package com.satyam.productservicespringcloud.repository;

import com.satyam.productservicespringcloud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
