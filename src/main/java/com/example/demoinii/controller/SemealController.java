package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.po.Setdetailed;
import com.example.demoinii.po.Setmeal;
import com.example.demoinii.po.User;
import com.example.demoinii.service.SetmealService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/setmeal")
public class SemealController {
    @Autowired
    public SetmealService setmealService;
    /**
     * @description: 根据主键查询套餐信息
     * @author: 赵嘉翔
     * @date:  下午4:42
     * @param: * Setmeal
     * @return: * @return: Result
     **/
    @PostMapping("/getSetmealById")
    //根据主键查询套餐信息
    @ApiOperation("根据主键查询套餐信息")
    public Result SelectSetmealById(@RequestBody Setmeal setmeal, HttpSession session)
    {
        //通过主键进行查询
        Setmeal setmeal1 = setmealService.selectSetBySeId(setmeal);
        return Result.success(setmeal1);
    }
    //查询所有的套餐类型列表
    /**
     * @description: 查询所有套餐类型列表
     * @author: 赵嘉翔
     * @date:  下午4:42
     * @param: * Setmeal
     * @return: * @return: Result
     **/
    @ApiOperation("查询所有套餐类型列表")
    @PostMapping("/listSetmeal")
    public Result  listSetmeal(){
        List<Setmeal> setmeals=setmealService.listSetmeal();
        return  Result.success(setmeals);
    }
}
