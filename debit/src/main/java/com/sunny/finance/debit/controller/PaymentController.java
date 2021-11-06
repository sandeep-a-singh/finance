package com.sunny.finance.debit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debit/v1")
public class PaymentController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/name")
    public String getAppName() {
        return appName;
    }
}
