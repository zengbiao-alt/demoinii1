package com.example.demoinii.mapper;

import com.example.demoinii.po.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    Users userLogin(Users users);
    Users getUsersById(Users user);
    int userRegist(Users user);
}
