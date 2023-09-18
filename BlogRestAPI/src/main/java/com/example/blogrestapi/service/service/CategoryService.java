package com.example.blogrestapi.service.service;

import com.example.blogrestapi.entity.Category;

import java.util.List;

public interface CategoryService {
    Category findById(int id);
    List<Category> findAll();
}
