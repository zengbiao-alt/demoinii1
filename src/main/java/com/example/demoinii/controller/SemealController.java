package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.po.Setdetailed;
import com.example.demoinii.po.Setmeal;
import com.example.demoinii.po.User;
import com.example.demoinii.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/setmeal")
public class SemealController {
    @Autowired
    public SetmealService setmealService;
    @PostMapping("/getSetmealById")
    //根据主键查询套餐信息
    public Result SelectSetmealById(@RequestBody Setmeal setmeal, HttpSession session)
    {
        //通过主键进行查询
        Setmeal setmeal1 = setmealService.selectSetBySeId(setmeal);
        return Result.success(setmeal1);
    }
}
