package com.satyam.springcloud.repository;

import com.satyam.springcloud.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
	Price findByCode(String code);
}
