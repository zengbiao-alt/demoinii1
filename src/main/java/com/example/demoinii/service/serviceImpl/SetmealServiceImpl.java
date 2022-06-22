package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.mapper.LoginMapper;
import com.example.demoinii.mapper.SetmealMapper;
import com.example.demoinii.po.Setdetailed;
import com.example.demoinii.po.Setmeal;
import com.example.demoinii.po.User;
import com.example.demoinii.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService {
    @Autowired
    private SetmealMapper setmealMapper;
    @Override
    public Setmeal selectSetBySeId(Setmeal setmeal) {
        Setmeal setmeal1 = setmealMapper.selectSetBySeId(setmeal);
        if (setmeal1 == null) {
            throw new MallExcetion(MallExcptionEum.HOPISTAL_QURRYFAIL);
        } else {
            return setmeal1;
        }
    }

    @Override
    public List<Setmeal> listSetmeal() {
        List<Setmeal> setmeal=setmealMapper.listSetmeal();
        if(setmeal==null)
        {
            throw new MallExcetion(MallExcptionEum.HOPISTAL_QURRYFAIL);
        }
        else {
            return setmeal;
        }
    }
}
