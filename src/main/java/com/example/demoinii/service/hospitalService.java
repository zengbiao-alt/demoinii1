package com.example.demoinii.service;

import com.example.demoinii.po.Hospital;

public interface hospitalService {
    Hospital listHospital(Hospital hospital);
    int  updateOrdersState(Hospital hospital);
}
