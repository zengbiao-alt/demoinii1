package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.ciReportMapper;
import com.example.demoinii.po.Cireport;
import com.example.demoinii.service.ciRporService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ciReportServiceImpl implements ciRporService {
@Autowired
private ciReportMapper cireportMapper;
    @Override
    public List<Cireport> listCiReport(Cireport cireport) {
        return cireportMapper.listCiReport(cireport);
    }
}
