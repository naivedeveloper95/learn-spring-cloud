package com.satyam.couponservicespringcloud.controller;


import com.satyam.couponservicespringcloud.model.Coupon;
import com.satyam.couponservicespringcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/coupon")
public class CouponRestController {

    @Autowired
    CouponRepository couponRepository;

    @PostMapping
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping(value = "/{code}")
    public Coupon getCoupon(@PathVariable("code") String code) {
        return couponRepository.findByCode(code);
    }
}
