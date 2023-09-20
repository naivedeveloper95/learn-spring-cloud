package com.satyam.springcloud.controllers;

import com.satyam.springcloud.model.Coupon;
import com.satyam.springcloud.model.Product;
import com.satyam.springcloud.repos.ProductRepo;
import com.satyam.springcloud.restclients.CouponClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@Autowired
	CouponClient couponClient;

	@Autowired
	private ProductRepo repo;

	@HystrixCommand(fallbackMethod = "sendErrorResponse")
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponClient.getCoupon(product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);

	}

	public Product sendErrorResponse(Product product) {
		return product;

	}

}
