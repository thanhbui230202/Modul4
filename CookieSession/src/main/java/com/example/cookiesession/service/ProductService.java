package com.example.cookiesession.service;

import com.example.cookiesession.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void create(Product product);
    List<Product> findAll();
    Optional<Product> findById(String id);
}
