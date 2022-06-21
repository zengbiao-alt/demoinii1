package com.example.demoinii.service;

import com.example.demoinii.po.Users;

public interface LoginService {
    public int  userRegist(Users user);
    public Users userLogin(Users user);
    public Users getUsersById(Users user);
}
