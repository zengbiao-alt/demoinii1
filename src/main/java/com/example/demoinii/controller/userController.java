package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.User;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/getUsersByUserIdByPass")
    //进行登录的登录传递的数据的数据是以接口的参数的形式进行传递
    public Result Login(@RequestBody User user, HttpSession session) {
//        User user1=new User();
        //1.数据校验
        if (!StringUtils.hasText(user.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        if (!StringUtils.hasText(user.getPassword())) {
            return Result.error(MallExcptionEum.NEED_PASSWORD);
        }
        //登录访问
        User user1 = loginService.userLogin(user);
        //防止密码污染
        user.setPassword(null);
//        //3.将数据存在session中
//        session.setAttribute(Constant.User.CURRENT_USER, user);
        //4.响应数据
        return Result.success(user1);
    }

    @PostMapping("/getUsersById")
    //进行手机号码的验证
    public Result FindExist(@RequestBody User user){
        if (!StringUtils.hasText(user.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        //登录访问
        User user1 = loginService.userFindAll(user);
        return Result.success(user1);
    }
    @PostMapping("/saveUsers")
    //进行用户信息的注册
    public Result Regist(@RequestBody User user){
        if (!StringUtils.hasText(user.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        //登录访问
        int regist = loginService.userRegist(user);
        return Result.success(regist);
    }
}