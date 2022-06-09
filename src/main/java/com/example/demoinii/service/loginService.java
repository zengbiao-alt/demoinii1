package com.example.demoinii.service;

import com.example.demoinii.dto.User;

public interface loginService {
    public User userLogin(String userId, String password);
}
