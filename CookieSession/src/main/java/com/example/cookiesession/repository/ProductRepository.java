package com.example.cookiesession.repository;

import com.example.cookiesession.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
