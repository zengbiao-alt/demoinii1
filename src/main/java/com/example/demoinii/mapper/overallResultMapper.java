package com.example.demoinii.mapper;

import com.example.demoinii.po.overallResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface overallResultMapper {
    List<overallResult> SelectOverResultById(overallResult overallresult);
}
