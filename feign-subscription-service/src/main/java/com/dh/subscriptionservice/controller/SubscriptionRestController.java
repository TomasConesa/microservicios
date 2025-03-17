package com.dh.subscriptionservice.controller;

import com.dh.subscriptionservice.Service.SubscriptionService;
import com.dh.subscriptionservice.model.Subscription;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/subscription")
public class SubscriptionRestController {

    private final SubscriptionService subscriptionService;

    public SubscriptionRestController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/find")
    public Subscription findSubscriptionByUser(@RequestParam Integer userId, HttpServletResponse response){
        response.addHeader("port", String.valueOf(serverPort));

        return subscriptionService.findSubscriptionByUserId(userId);
    }
}
