package org.tinghu.business.service;

import java.util.List;

import org.tinghu.business.entity.Fact_sjqt_riskprem;

public interface Fact_sjqt_riskpremService {

	public List<Fact_sjqt_riskprem> selectRiskPrem(String dataDate);
	
	/*public List<Fact_sjqt_riskprem> queryfact_riskprem(String dataDate){
		return riskpremMapper.queryFact_sjqt_risk(dataDate);
	}*/
}
