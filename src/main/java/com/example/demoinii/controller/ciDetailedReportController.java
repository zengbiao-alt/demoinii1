package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Cidetailedreport;
import com.example.demoinii.service.ciDetailedReportService;
import com.example.demoinii.service.ciRporService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoinii.service.ciDetailedReportService;

import java.util.List;

@RestController
@RequestMapping("/ciDetailedReport")
public class ciDetailedReportController {
    @Autowired
    private ciDetailedReportService ciDetailedReportService;
    @PostMapping("/updateCiDetailedReport")
    public Result updateCiDetailedReport(@RequestBody List<Cidetailedreport> cidetailedreport)
    {
        int status=ciDetailedReportService.updateCiDetailedReport(cidetailedreport);
        return Result.success(status);
    }

}
