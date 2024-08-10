package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return userService.login(user);

    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }
}