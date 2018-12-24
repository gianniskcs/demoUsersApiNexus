package com.example.exusrestapidemo.repository;

import com.example.exusrestapidemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findUserByEmail(String email);
}
