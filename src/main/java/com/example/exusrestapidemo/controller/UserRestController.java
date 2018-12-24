package com.example.exusrestapidemo.controller;
import com.example.exusrestapidemo.exception.ResourceNotFoundException;
import com.example.exusrestapidemo.repository.UserRepository;
import com.example.exusrestapidemo.model.User;
import com.example.exusrestapidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/")
public class UserRestController {

    @Autowired UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping(path = "")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(path = "getuser/{email}")
    public List<User> findUserByEmail(@PathVariable(value = "email") String email) {
        return userRepository.findUserByEmail(email);

    }

    @PostMapping("/saveUser")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}