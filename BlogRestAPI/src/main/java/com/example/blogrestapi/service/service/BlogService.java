package com.example.blogrestapi.service.service;

import com.example.blogrestapi.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    void deleteById(String id);
    Blog findById(String id);
    Page<Blog>findAll(Pageable pageable);
    List<Blog> findAll();
}
