package com.aldin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

import com.aldin.entity.Twitter;
import com.aldin.repo.TwitterRepo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class TwitterService {

    @Autowired
    private TwitterRepo repository;

    @Autowired
    private SolrTemplate solrTemplate;

    private static final int MAX_THREADS = 3;
    private ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

    public void processFiles(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files != null) {
            for (File file : files) {
                executor.submit(() -> {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            Twitter feed = new Twitter();
                            feed.setConversation(line);
                            repository.save(feed);
                            solrTemplate.saveBean("twitter_feed", feed);
                        }
                        solrTemplate.commit("twitter_feed");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        }
    }
}