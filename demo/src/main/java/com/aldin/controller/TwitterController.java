package com.aldin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aldin.service.TwitterService;

@RestController
public class TwitterController {

    @Autowired
    private TwitterService service;
    
    String PATH_FILE="c/download/gniplogs";

    @GetMapping("/process")
    public String process() {
        service.processFiles(PATH_FILE);
        return "Processing started";
    }
}
