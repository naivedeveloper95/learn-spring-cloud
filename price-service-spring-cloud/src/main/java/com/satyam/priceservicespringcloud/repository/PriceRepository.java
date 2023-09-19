package com.satyam.priceservicespringcloud.repository;

import com.satyam.priceservicespringcloud.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
    Price getPriceByCode(String code);
}
