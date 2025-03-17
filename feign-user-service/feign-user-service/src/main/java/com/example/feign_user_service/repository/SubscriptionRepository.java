package com.example.feign_user_service.repository;

import com.example.feign_user_service.model.dto.SubscriptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionRepository{

    private final FeignSubscriptionRepository feignSubscriptionRepository;

    public SubscriptionRepository(FeignSubscriptionRepository feignSubscriptionRepository) {
        this.feignSubscriptionRepository = feignSubscriptionRepository;
    }

    public SubscriptionDto findByUserId(Integer userId){
        ResponseEntity<SubscriptionDto> response = feignSubscriptionRepository.findByUserId(userId);
        return response.getBody();
    }
}
