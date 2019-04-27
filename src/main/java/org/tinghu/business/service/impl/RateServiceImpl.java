package org.tinghu.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinghu.business.dao.RateMapper;
import org.tinghu.business.entity.Rate;

@Service
public class RateServiceImpl {

	@Autowired
	private RateMapper rateMapper;

	public List<Rate> queryRate(String dataDate) {

		return rateMapper.queryRate(dataDate);
	}

	public int insert(Rate rate) {
		
		return  rateMapper.insert(rate);
	}
}
