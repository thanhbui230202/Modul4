package com.example.blogrestapi.service.service;

import com.example.blogrestapi.entity.Blog;
import com.example.blogrestapi.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteById(String id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> searchByName(String name) {
        return blogRepository.findAllByNameContaining(name);
    }

}
