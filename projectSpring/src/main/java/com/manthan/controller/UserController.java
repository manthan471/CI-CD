package com.manthan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manthan.model.User;
import com.manthan.service.UserService;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/user/add")
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/user/getAll")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "User deleted";
    }
}