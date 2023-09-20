package com.satyam.springcloud.repos;


import com.satyam.springcloud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
