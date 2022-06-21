package com.example.demoinii.mapper;

import com.example.demoinii.po.Cidetailedreport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ciDetailedReportMapper {
    int updateCiDetailedReport(Cidetailedreport cidetailedreport);
}
