package org.tinghu.business.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.tinghu.business.entity.Fact_sjqt_riskprem;

//@Service("fact_sjqt_riskpremMapper")

//@Repository
public interface Fact_sjqt_riskpremMapper {
    
	int insert(Fact_sjqt_riskprem record);

    int insertSelective(Fact_sjqt_riskprem record);
    
    List<Fact_sjqt_riskprem> queryFact_sjqt_risk(String dataDate);
    
}