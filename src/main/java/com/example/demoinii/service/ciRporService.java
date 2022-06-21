package com.example.demoinii.service;

import com.example.demoinii.po.Cireport;
import com.example.demoinii.po.Orders;

import java.util.List;

public interface ciRporService {
    List<Cireport> listCiReport(Cireport cireport);
    int createReportTemplate(Orders orders);
}
