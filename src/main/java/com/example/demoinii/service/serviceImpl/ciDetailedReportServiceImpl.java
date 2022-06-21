package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.ciDetailedReportMapper;
import com.example.demoinii.po.Cidetailedreport;
import com.example.demoinii.service.ciDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ciDetailedReportServiceImpl implements ciDetailedReportService {
    @Autowired
    private ciDetailedReportMapper ciDetailedReportMappers;
    @Override
    public int updateCiDetailedReport(List<Cidetailedreport> cidetailedreport) {
        return ciDetailedReportMappers.updateCiDetailedReport( cidetailedreport);
    }
}
