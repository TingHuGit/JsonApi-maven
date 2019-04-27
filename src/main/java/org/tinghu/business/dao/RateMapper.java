package org.tinghu.business.dao;

import java.util.List;

import org.tinghu.business.entity.Rate;

public interface RateMapper {
    int insert(Rate record);

    int insertSelective(Rate record);
    
    List<Rate> queryRate(String datadate);
    
}