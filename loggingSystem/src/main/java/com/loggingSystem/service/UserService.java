package com.loggingSystem.service;

import com.loggingSystem.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
