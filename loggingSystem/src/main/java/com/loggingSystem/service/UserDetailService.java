package com.loggingSystem.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailService {
    public UserDetails LoadUserByUserName(String userName);
}
