package com.kauan.spring_security.repositories;


import com.kauan.spring_security.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}