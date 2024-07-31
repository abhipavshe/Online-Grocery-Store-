package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void deleteUser(Long id);
}

