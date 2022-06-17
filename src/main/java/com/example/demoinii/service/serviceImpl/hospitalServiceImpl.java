package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.hospitalMapper;
import com.example.demoinii.po.Hospital;
import com.example.demoinii.service.hospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class hospitalServiceImpl  implements hospitalService {
@Autowired
private hospitalMapper hospitalmapper;
    @Override
    public Hospital listHospital(Hospital hospital) {
        return hospitalmapper.listHospital(hospital);
    }

    @Override
    public int updateOrdersState(Hospital hospital) {
        return hospitalmapper.updateOrdersState(hospital);
    }
}
