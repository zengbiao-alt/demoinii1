package com.example.demoinii.mapper;

import com.example.demoinii.po.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorMapper {

    public Doctor getDoctorByCodeByPass(Doctor doctor);
}
