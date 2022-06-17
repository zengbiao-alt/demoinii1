package com.example.demoinii.mapper;

import com.example.demoinii.po.Cireport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ciReportMapper {
    public List<Cireport> listCiReport(Cireport cireport);
}
