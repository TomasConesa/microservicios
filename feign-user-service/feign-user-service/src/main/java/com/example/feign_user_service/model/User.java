package com.example.feign_user_service.model;

import com.example.feign_user_service.model.dto.SubscriptionDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Optional;

public class User {


    private Integer id;

    private String name;
    private String lastName;
    private String email;
    private SubscriptionDto subscription;

    public User(Integer id, String name, String lastName, String email, SubscriptionDto subscription) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.subscription = subscription;
    }

    public User(Integer id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SubscriptionDto getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionDto subscription) {
        this.subscription = subscription;
    }
}
