package com.vid.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vid.category.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
