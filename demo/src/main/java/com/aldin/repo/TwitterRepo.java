package com.aldin.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aldin.entity.Twitter;

public interface TwitterRepo extends JpaRepository<Twitter, Long> {
}
