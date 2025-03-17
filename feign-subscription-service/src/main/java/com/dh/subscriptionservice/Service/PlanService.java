package com.dh.subscriptionservice.Service;

import com.dh.subscriptionservice.model.Plan;
import com.dh.subscriptionservice.repository.IPlanRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PlanService {

    private final IPlanRepository planRepository;


    public PlanService(IPlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public Optional<Plan> findByPlanId(Integer id){
        return this.planRepository.findById(id);
    }
}
