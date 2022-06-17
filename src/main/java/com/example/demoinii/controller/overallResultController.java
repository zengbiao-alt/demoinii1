package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Setmeal;
import com.example.demoinii.po.overallResult;
import com.example.demoinii.service.SetmealService;
import com.example.demoinii.service.overallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoinii.service.overallResultService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/overallResult")
public class overallResultController {
    @Autowired
    public overallResultService overallResultServices;
    @PostMapping("/listOverallResultByOrderId")
    public Result SelectOverResultById(@RequestBody overallResult overallresult , HttpSession session)
    {
        //通过体检预约表编号查询总检结论
       List<overallResult> overallresult1 = overallResultServices.SelectOverResultById(overallresult);
        return Result.success(overallresult1);
    }
}
