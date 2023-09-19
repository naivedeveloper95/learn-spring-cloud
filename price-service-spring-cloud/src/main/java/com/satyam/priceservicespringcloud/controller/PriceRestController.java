package com.satyam.priceservicespringcloud.controller;

import com.satyam.priceservicespringcloud.model.Price;
import com.satyam.priceservicespringcloud.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/price")
public class PriceRestController {

    @Autowired
    PriceRepository priceRepository;

    @PostMapping
    public Price createPrice(@RequestBody Price price) {
        return priceRepository.save(price);
    }

    @GetMapping("/{code}")
    public Price getPrice(@PathVariable("code") String code) {
        return priceRepository.getPriceByCode(code);
    }
}
