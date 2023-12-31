package com.satyam.springcloud.restclients;

import com.satyam.springcloud.model.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("zuul-api-gateway")
//@RibbonClient("COUPON-SERVICE")
public interface CouponClient {
	@GetMapping("/coupon-service/couponapi/coupons/{code}")
	Coupon getCoupon(@PathVariable("code") String code);
}
