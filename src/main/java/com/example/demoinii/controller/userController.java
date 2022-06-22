package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.po.Users;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.service.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private LoginService loginService;
    /**
     * @description: 进行登录的登录传递的数据的数据是以接口的参数的形式进行传递
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Users
     * @return: * @return: Result
     **/
    @PostMapping("/getUsersByUserIdByPass")
    @ApiOperation("进行登录的登录传递的数据的数据是以接口的参数的形式进行传递")
    //进行登录的登录传递的数据的数据是以接口的参数的形式进行传递
    public Result Login(@RequestBody Users users, HttpSession session) {
//        User user1=new User();
        //1.数据校验
        if (!StringUtils.hasText(users.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        if (!StringUtils.hasText(users.getPassword())) {
            return Result.error(MallExcptionEum.NEED_PASSWORD);
        }
        //登录访问
        Users user1 = loginService.userLogin(users);
        //防止密码污染
        users.setPassword(null);
//        //3.将数据存在session中
//        session.setAttribute(Constant.User.CURRENT_USER, user);
        //4.响应数据
        return Result.success(user1);
    }

    /**
     * @description: 进行手机号码的验证
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Users
     * @return: * @return: Result
     **/

    @PostMapping("/getUsersById")
    //进行手机号码的验证
    @ApiOperation("进行手机号码的验证")
    public Result FindExist(@RequestBody Users user){
        if (!StringUtils.hasText(user.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        //登录访问
        Users user1 = loginService.getUsersById(user);
        if(user1==null)
        {
            throw  new MallExcetion(MallExcptionEum.USEID_NOT_EXIST);
        }
        return Result.success(user1);
    }

    /**
     * @description: 进行用户信息的注册
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Users
     * @return: * @return: Result
     **/
    @ApiOperation("进行用户信息的注册")
    @PostMapping("/saveUsers")
    //进行用户信息的注册
    public Result Regist(@RequestBody Users user){
        if (!StringUtils.hasText(user.getUserId()))//表示的是文档
        {
            return Result.error(MallExcptionEum.NEED_USERNAME);
        }
        int regist = loginService.userRegist(user);
        return Result.success(regist);
    }
}