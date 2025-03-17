package com.dh.subscriptionservice.Service;

import com.dh.subscriptionservice.model.Subscription;
import com.dh.subscriptionservice.repository.ISubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    private final ISubscriptionRepository subscriptionRepository;

    public SubscriptionService(ISubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public Subscription findSubscriptionByUserId(Integer userId) {
        return subscriptionRepository.findByUserId(userId);
    }
}
