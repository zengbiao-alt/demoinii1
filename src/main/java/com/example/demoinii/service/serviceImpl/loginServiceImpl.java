package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.dto.User;
import com.example.demoinii.mapper.LoginMapper;
import com.example.demoinii.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {
   @Autowired
    LoginMapper  loginMapper;
    @Override
    public User userLogin(String userId, String password) {
       return loginMapper.userLogin(userId,password);


    }
}
