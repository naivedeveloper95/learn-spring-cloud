package com.satyam.productservicespringcloud.controller;

import com.satyam.productservicespringcloud.model.Product;
import com.satyam.productservicespringcloud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductRestController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
