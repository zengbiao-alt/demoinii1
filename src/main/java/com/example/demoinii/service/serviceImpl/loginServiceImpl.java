package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.po.Users;
import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.mapper.LoginMapper;
import com.example.demoinii.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class loginServiceImpl implements LoginService {
   @Autowired
   private LoginMapper  loginMapper;
    @Override
    public int  userRegist(Users user) {
        //首先我们进行判断该用户是都已经注册
        Users user1=loginMapper.getUsersById(user);
        if(user1!=null)
        {
           throw   new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        else {
            int regist = loginMapper.userRegist(user);
            if (regist == 0) {
                throw new MallExcetion(MallExcptionEum.INSERT_FAILED);
            }
            return regist;
        }
    }

    public Users userLogin(Users user) {
        Users user1=loginMapper.userLogin(user);
        if(user1==null)
        {
            throw  new MallExcetion(MallExcptionEum.LOGIN_FAILED);
        }
        return user1;

    }

    @Override
    public Users getUsersById(Users user) {
        Users user1=loginMapper.getUsersById(user);
        return user1;
    }
}
