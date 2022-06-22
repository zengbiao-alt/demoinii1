package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.mapper.ciReportMapper;
import com.example.demoinii.po.Cidetailedreport;
import com.example.demoinii.po.Cireport;
import com.example.demoinii.po.Orders;
import com.example.demoinii.service.ciRporService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Author: tan
 * FileName:ciReportServiceImpl
 */
@Service
public class ciReportServiceImpl implements ciRporService {
    @Autowired
    private ciReportMapper cireportMapper;
    @Override
    public List<Cireport> listCiReport(Cireport cireport) {
        List<Cireport> cireports=new ArrayList<Cireport>();
        Cireport cireport2=new Cireport();
        List<Cireport> list=cireportMapper.listCiReport(cireport);
        List<Cidetailedreport> cidetailedreports1=new ArrayList<Cidetailedreport>();
        for(Cireport cireport1:list)
        {
            System.out.println(cireport1);
            List<Cidetailedreport> cidetailedreports=cireport1.getCidetailedreports();
            for(Cidetailedreport cidetailedreport :cidetailedreports)
            {
                System.out.println("\t"+cidetailedreport);
                cidetailedreports1.add(cidetailedreport);
            }
        }
        cireport2.setCidetailedreports(cidetailedreports1);
        cireports.add(cireport2);
        if(cireports == null){
            throw new MallExcetion(MallExcptionEum.NOT_EXISTS);
        }
        return cireports;
    }

    @Override
    public int createReportTemplate(Orders orders) {
        int orders1 = cireportMapper.createReportTemplate(orders);
        if (orders1 == 0){
            throw new MallExcetion(MallExcptionEum.INSERT_FAILED);
        }
        return orders1;

    }
}