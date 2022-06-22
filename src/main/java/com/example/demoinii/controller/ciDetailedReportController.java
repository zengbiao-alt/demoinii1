package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Cidetailedreport;
import com.example.demoinii.service.ciDetailedReportService;
import com.example.demoinii.service.ciRporService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoinii.service.ciDetailedReportService;

import java.util.List;
/**
 * @description: 更新检查项信息及检查项明细信息
 * @author: 黄必涛
 * @date:  下午4:42
 * @param: * Cidetailedreport
 * @return: * @return: Result
 **/

@RestController
@RequestMapping("/ciDetailedReport")
public class ciDetailedReportController {
    @Autowired
    private ciDetailedReportService ciDetailedReportService;
    @ApiOperation("更新检查项信息及检查项明细信息")
    @PostMapping("/updateCiDetailedReport")
    public Result updateCiDetailedReport(@RequestBody Cidetailedreport cidetailedreport)
    {
        int status=ciDetailedReportService.updateCiDetailedReport(cidetailedreport);
        return Result.success(status);
    }

}