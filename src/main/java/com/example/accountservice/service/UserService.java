package com.example.accountservice.service;

import com.example.accountservice.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    // Additional methods as needed
}
