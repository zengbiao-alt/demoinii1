package com.example.demoinii.mapper;

import com.example.demoinii.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    User userLogin(@Param("userId") String userId, @Param("password") String password);
    User userFindAll(@Param("userId") String useId);
    int userRegist(User user);
}
