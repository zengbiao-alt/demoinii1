package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.po.User;
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
    public int  userRegist(User user) {
        int regist=loginMapper.userRegist(user);
        if(regist==0)
        {
            throw  new MallExcetion(MallExcptionEum.INSERT_FAILED);
        }
        return regist;

    }

    public User userLogin(User user) {
        User user1=loginMapper.userLogin(user.getUserId(),user.getPassword());
        if(user1==null)
        {
            throw  new MallExcetion(MallExcptionEum.LOGIN_FAILED);
        }
        return user1;

    }

    @Override
    public User userFindAll(User user) {
        User user1=loginMapper.userFindAll(user.getUserId());
        if(user1==null)
        {
            throw  new MallExcetion(MallExcptionEum.USEID_NOT_EXIST);
        }
        return user1;
    }
}
