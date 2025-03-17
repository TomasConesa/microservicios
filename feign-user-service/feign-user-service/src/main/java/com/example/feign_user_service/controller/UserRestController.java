package com.example.feign_user_service.controller;

import com.example.feign_user_service.model.User;
import com.example.feign_user_service.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}
