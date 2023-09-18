package com.example.blogrestapi.repository;

import com.example.blogrestapi.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog,String> {
}
