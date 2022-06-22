package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Setmeal;
import com.example.demoinii.po.overallResult;
import com.example.demoinii.service.SetmealService;
import com.example.demoinii.service.overallResultService;
import io.swagger.annotations.ApiOperation;
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
    /**
     * @description: 通过体检预约表编号查询总检结论
     * @author:赵浩澄
     * @date:  上午10:42
     * @param: * @param overallResult:
     * @return: * @return:Result
     **/
    @PostMapping("stOverallResultByOrderId")
    @ApiOperation("通过体检预约表编号查询总检结论")
    public Result SelectOverResultById(@RequestBody overallResult overallresult , HttpSession session)
    {
        List<overallResult> overallresult1 = overallResultServices.SelectOverResultById(overallresult);
        return Result.success(overallresult1);
    }
    @PostMapping("saveOverallResult")
    public  Result saveOverallResult(@RequestBody overallResult overallResults) {
        /**
         * @description: 添加总检结论信息
         * @author:赵浩澄
         * @date:  上午10:42
         * @param: * @param overallResult:
         * @return: * @return:Result
         **/
        int overallResultList = overallResultServices.saveOverallResult(overallResults);
        return Result.success(overallResultList);
    }
    @PostMapping("updateOverallResult")
    public Result updateOverallResult(@RequestBody overallResult overallResults)
    {
        /**
         * @description: 更新总检结论信息
         * @author:赵浩澄
         * @date:  上午10:42
         * @param: * @param overallResult:
         * @return: * @return:Result
         **/
        int overallResultList=overallResultServices.updateOverallResult(overallResults);
        return Result.success(overallResultList);
    }
    @PostMapping("removeOverallResult")
    public Result removeOverallResult(@RequestBody overallResult overallResults)
    {
        /**
         * @description: 根据总检信息表编号OverallResult对象
         * @author:赵浩澄
         * @date:  上午10:42
         * @param: * @param overallResult:
         * @return: * @return:Result
         **/
        int overallResultList=overallResultServices.removeOverallResult(overallResults);
        return Result.success(overallResultList);
    }
}