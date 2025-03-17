package com.example.feign_user_service.repository;

import com.example.feign_user_service.configuration.feign.FeignInterceptor;
import com.example.feign_user_service.model.dto.SubscriptionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "subscription-service", url = "http://localhost:8083", configuration = FeignInterceptor.class)
public interface FeignSubscriptionRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/subscription/find")
    ResponseEntity<SubscriptionDto> findByUserId(@RequestParam Integer userId);
}
