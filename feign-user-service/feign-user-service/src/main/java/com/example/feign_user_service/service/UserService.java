package com.example.feign_user_service.service;

import com.example.feign_user_service.model.User;
import com.example.feign_user_service.model.dto.SubscriptionDto;
import com.example.feign_user_service.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final List<User> userRepository;
    private final SubscriptionRepository subscriptionRepository;

    public UserService(SubscriptionRepository subscriptionRepository) {
            this.subscriptionRepository = subscriptionRepository;
            this.userRepository = List.of(new User(1, "Test name", "Test last name", "test@test.com"));
    }

    public User findById(Integer id){
        User user = userRepository.stream().filter(_user -> Objects.equals(_user.getId(), id)).findFirst().orElse(null);

        SubscriptionDto subscriptionDto = subscriptionRepository.findByUserId(id);

        if (user != null) user.setSubscription(subscriptionDto);

        return user;
    }
}

