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
        List<overallResult> overallResultList=overallresultMapper.SelectOverResultById(overallresult);
        if(overallResultList==null)
        {
            throw  new MallExcetion(MallExcptionEum.HOPISTAL_QURRYFAIL);
        }
        else {
            return overallResultList;
        }
    }

    @Override
    public int  saveOverallResult(overallResult overallResults) {
        //首先判断的是添加的信息是否已经存在
        List<overallResult> overallResultList=overallresultMapper.SelectOverResultById(overallResults);
        if(overallResultList!=null)
        {
            throw new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        else {
            int status = overallresultMapper.saveOverallResult(overallResults);
            if (status != 0) {
                throw new MallExcetion(MallExcptionEum.overallResult_EXIST);
            }
            return  status;
        }

    }

    @Override
    public int updateOverallResult(overallResult overallResults) {
        //首先判断该数据是否存在
        List<overallResult> overallResultList=overallresultMapper.SelectOverResultById(overallResults);
        if(overallResultList!=null)
        {
            throw new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        else
        {
            int status=overallresultMapper.updateOverallResult(overallResults);
            if(status==0)
            {
                throw new MallExcetion(MallExcptionEum.UPDATE_FAIL);
            }
            return  status;
        }
    }

    @Override
    public int removeOverallResult(overallResult overallResults) {

        //首先判断该数据是否存在
        List<overallResult> overallResultList=overallresultMapper.SelectOverResultById(overallResults);
        if(overallResultList!=null)
        {
            throw new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        else {
            int status=overallresultMapper.removeOverallResult(overallResults);
            if(status==0)
            {
                throw  new MallExcetion(MallExcptionEum.DELETE_FAILED );
            }
            else {
                return status;
            }
        }
    }
}
