package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
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

    @Override
    public int  saveOverallResult(overallResult overallResults) {
        //首先判断的是添加的信息是否已经存在
        List<overallResult> overallResultList=overallresultMapper.SelectOverResultById(overallResults);
        if(overallResultList!=null)
        {
            throw new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        return overallresultMapper.saveOverallResult(overallResults);
    }

    @Override
    public int updateOverallResult(overallResult overallResults) {
      return overallresultMapper.updateOverallResult(overallResults);
    }

    @Override
    public int removeOverallResult(overallResult overallResults) {
        return overallresultMapper.removeOverallResult(overallResults);
    }
}
