package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.doctorMapper;
import com.example.demoinii.po.Doctor;
import com.example.demoinii.service.doctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class doctorServiceImpl  implements doctorService {
    @Autowired
    private doctorMapper doctorMappers;
    @Override
    public Doctor getDoctorByCodeByPass(Doctor doctor) {
        return doctorMappers.getDoctorByCodeByPass(doctor);
    }
}
