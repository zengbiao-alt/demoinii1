package com.example.demoinii.mapper;

import com.example.demoinii.po.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface hospitalMapper {
    Hospital listHospital(Hospital hospital);
     int updateOrdersState(Hospital hospital);
}
