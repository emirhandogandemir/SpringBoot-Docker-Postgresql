package com.example.bestcloudforme.controller;

import com.example.bestcloudforme.domain.User;
import com.example.bestcloudforme.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public User getById(){
        User user = new User(1,"Emirhan","Doğandemir");

    return user;
    }

}
