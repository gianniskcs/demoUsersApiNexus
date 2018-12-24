package com.example.exusrestapidemo.service;
import com.example.exusrestapidemo.model.User;
import com.example.exusrestapidemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }


}
