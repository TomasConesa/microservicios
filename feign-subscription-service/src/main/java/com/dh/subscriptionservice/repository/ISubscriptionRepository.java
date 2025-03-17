package com.dh.subscriptionservice.repository;

import com.dh.subscriptionservice.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription,Integer> {

    Subscription findByUserId(Integer userId);
}
