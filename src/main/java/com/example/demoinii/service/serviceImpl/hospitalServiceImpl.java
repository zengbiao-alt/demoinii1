package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
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
        Hospital hospital1=hospitalmapper.listHospital(hospital);
        if(hospital1==null)
        {
            throw  new MallExcetion(MallExcptionEum.HOPISTAL_QURRYFAIL);
        }
        else{
            return hospital1;
        }

    }


    @Override
    public int updateOrdersState(Hospital hospital) {


        Hospital hospital1=hospitalmapper.getHospitalById(hospital);
        if (hospital1==null)
        {
            throw  new MallExcetion(MallExcptionEum.HOPISTAL_non_existent);
        }
        else{
            int result=hospitalmapper.updateOrdersState(hospital);
            if(result==0)
            {
                throw  new MallExcetion(MallExcptionEum.UPDATE_FAIL);
            }
            else{
                return  result;
            }
        }

    }

    @Override
    public Hospital getHospitalById(Hospital hospital)
    {
        /*由于我们返回的是一个对象，所以我们需要进行判断返回的对象是否为null,直接抛出异常为查询失败，
        反之就是返回这个对象
         */
        Hospital hospital1=hospitalmapper.getHospitalById(hospital);
        if(hospital1==null)
        {
            throw  new MallExcetion(MallExcptionEum.HOPISTAL_QURRYFAIL);
        }
        else{
            return hospital1;
        }
    }


}