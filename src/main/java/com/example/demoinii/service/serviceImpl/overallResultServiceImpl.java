package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.LoginMapper;
import com.example.demoinii.mapper.overallResultMapper;
import com.example.demoinii.po.overallResult;
import com.example.demoinii.service.overallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class overallResultServiceImpl implements overallResultService {
    @Autowired
    private overallResultMapper overallresultMapper;
    @Override
    public List<overallResult> SelectOverResultById(overallResult overallresult) {
       return overallresultMapper.SelectOverResultById(overallresult);
    }
}
