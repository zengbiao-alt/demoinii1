package com.example.demoinii.controller;

import com.example.demoinii.dto.User;
import com.example.demoinii.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private loginService loginService;

    @RequestMapping(value = "/getUsersByUserIdByPass")
//    @RequestBody User user
    public User valide() {
        System.out.println(loginService.userLogin("12345671111","123"));
        return this.loginService.userLogin("12345671111","123");

//        return this.loginService.userLogin(user.getUserId(),user.getPassword());
//    System.out.println(user1.getPassword());
//    System.out.println(user1.getUserId());
//        if (user1 != null) {
//            return ApiResultHandler.buildApiResult(200, "请求成功", user2);
//        }
//        return ApiResultHandler.buildApiResult(400, "请求失败", null);
//    }
    }

    public static void main(String[] args) {
        new userController().valide();
    }
}