package com.sunny.finance.debit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(@ComponentScan(basePackages = "com.sunny.finance"))
public class DebitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebitApplication.class, args);
	}

}
