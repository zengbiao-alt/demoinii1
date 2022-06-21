package com.example.demoinii.mapper;

import com.example.demoinii.po.Setmeal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetmealMapper {
    Setmeal selectSetBySeId(Setmeal setmeal);
    List<Setmeal>listSetmeal();
}
