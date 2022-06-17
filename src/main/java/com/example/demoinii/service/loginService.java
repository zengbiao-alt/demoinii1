package com.example.demoinii.service;

import com.example.demoinii.po.User;

public interface LoginService {
    public int  userRegist(User user);
    public User userLogin(User user);
    public User userFindAll(User user);
}
