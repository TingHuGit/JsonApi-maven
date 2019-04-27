/**
 * 
 */
package org.cockpit.rateApi.services;

import java.sql.SQLException;
import java.util.List;

import org.cockpit.rateApi.bean.V_FACT_JTGLJSC_RENEWALRATE;


/**
 * @ClassName: QueryService
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019年3月11日 下午5:01:07
 * 
 */
public class QueryRenewalrateService {

	//private FACT_JTGLJSC_RENEWALRATE fact_jtgljsc_renewalrate;
	
	private QueryDaoImpl queryDaoImpl;
	
	public List queryRenewalrateService(String times) throws SQLException {
		
		String sql = "select orgcode,orgname,datadate,managecom,name,salechnl,salechnlname,paidprem_3_m,rcvprem_3_m,paidprem_7_m,rcvprem_7_m,paidprem_13_m,rcvprem_13_m,paidprem_25_m,rcvprem_25_m,paidprem_3_y,rcvprem_3_y,paidprem_7_y,rcvprem_7_y,paidprem_13_y,rcvprem_13_y,paidprem_25_y,rcvprem_25_y from V_FACT_JTGLJSC_RENEWALRATE where to_char(datadate,'yyyy-mm-dd') = ?";
		List<V_FACT_JTGLJSC_RENEWALRATE> list = null;  //queryDaoImpl.query(sql, times);
		
		return list;
	}

	
	public QueryDaoImpl getQueryDaoImpl() {
		return queryDaoImpl;
	}

	public void setQueryDaoImpl(QueryDaoImpl queryDaoImpl) {
		this.queryDaoImpl = queryDaoImpl;
	}
	
	
}
