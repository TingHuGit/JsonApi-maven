package org.tinghu.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinghu.business.dao.Fact_sjqt_riskpremMapper;
import org.tinghu.business.entity.Fact_sjqt_riskprem;
import org.tinghu.business.service.Fact_sjqt_riskpremService;

@Service
public class Fact_sjqt_riskpremServiceImpl implements Fact_sjqt_riskpremService {
	
	@Autowired
	private Fact_sjqt_riskpremMapper fact_sjqt_riskpremMapper;
	
	@Override
	public List<Fact_sjqt_riskprem> selectRiskPrem(String dataDate) {
		return fact_sjqt_riskpremMapper.queryFact_sjqt_risk(dataDate);
	}
}
