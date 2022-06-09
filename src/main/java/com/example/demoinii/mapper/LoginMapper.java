package com.example.demoinii.mapper;

import com.example.demoinii.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
//    @Select("select realName,sex,birthday,userType from users where userId= #{userId} and password = #{password}")
    public User userLogin(String userId,String password);

}
