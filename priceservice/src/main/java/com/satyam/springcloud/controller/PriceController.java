package com.satyam.springcloud.controller;

import com.satyam.springcloud.model.Price;
import com.satyam.springcloud.repository.PriceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {

	private final PriceRepository priceRepository;

	public PriceController(PriceRepository priceRepository) {
		this.priceRepository = priceRepository;
	}

	@PostMapping
	public Price createPrice(@RequestBody Price price) {
		return priceRepository.save(price);
	}

	@GetMapping("{code}")
	public Price getPrice(@PathVariable String code) {
		return priceRepository.findByCode(code);
	}
}
