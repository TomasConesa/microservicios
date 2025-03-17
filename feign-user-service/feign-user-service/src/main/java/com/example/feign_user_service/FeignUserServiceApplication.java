package com.example.feign_user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignUserServiceApplication.class, args);
	}

}
