package com.example.demoinii.mapper;

import com.example.demoinii.po.Setmeal;
import org.springframework.stereotype.Repository;

@Repository
public interface SetmealMapper {
    Setmeal selectSetBySeId(Setmeal setmeal);
}
