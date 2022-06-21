package com.example.demoinii.service;

import com.example.demoinii.po.Setdetailed;
import com.example.demoinii.po.Setmeal;

import java.util.List;

public interface SetmealService {
    Setmeal selectSetBySeId(Setmeal setmeal);
     List<Setmeal> listSetmeal();
}
