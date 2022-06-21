package com.example.demoinii.service;

import com.example.demoinii.po.overallResult;

import java.util.List;

public interface overallResultService {
    List<overallResult> SelectOverResultById(overallResult overallresult);
    int saveOverallResult(overallResult overallResult);
    int updateOverallResult(overallResult overallResults);
    int removeOverallResult(overallResult overallResults);
}
