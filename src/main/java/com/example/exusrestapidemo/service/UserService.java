package com.example.exusrestapidemo.service;

import com.example.exusrestapidemo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findUserByEmail(String email);

}
