package org.cockpit.rateApi.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.cockpit.rateApi.bean.V_FACT_JTGLJSC_PREM;
import org.cockpit.rateApi.bean.V_FACT_JTGLJSC_RENEWALRATE;
import org.cockpit.rateApi.utils.DataSourceUtils;


public class queryTableDao {
	
	//
	public List<Object> query(String sql, String times) throws SQLException {

		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		List<Object> list = runner.query(sql, new BeanListHandler<Object>(Object.class), times);
		return list;
	}
	
	// 继续率
	public List<V_FACT_JTGLJSC_RENEWALRATE> queryRate(String times) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		System.out.println("V_FACT_JTGLJSC_RENEWALRATE  传入数据库的查询参数：" + times  + "\n");
		String sql = "select datadate,tarid,freid,curid,orgid,salechnl,renewaltype,renewalprem,renewalpaidprem,renewalrcvprem from V_FACT_JTGLJSC_RENEWALRATE where datadate = ?";
		List<V_FACT_JTGLJSC_RENEWALRATE> list = runner.query(sql, new BeanListHandler<V_FACT_JTGLJSC_RENEWALRATE>(V_FACT_JTGLJSC_RENEWALRATE.class), times);
		return list;
	}
	
	//销售业绩
	public List<V_FACT_JTGLJSC_PREM> queryBusiness(String times) throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		System.out.println("V_FACT_JTGLJSC_PREM  传入数据库的查询参数：" + times  + "\n");
		String sql = "select datadate,tarid,freid,curid,orgid,salechnl,subchnl,payintv,prem from V_FACT_JTGLJSC_PREM where datadate = ?";
		List<V_FACT_JTGLJSC_PREM> list = runner.query(sql, new BeanListHandler<V_FACT_JTGLJSC_PREM>(V_FACT_JTGLJSC_PREM.class), times);
		return list;
	}
	
	// 风险指标
	/*public List<FACT_SJQT_FXZB> findFACT_SJQT_FXZB(String times) throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		System.out.println("FACT_SJQT_FXZB  传入数据库的查询参数：" + times);
		String sql = "select substr(DATADATE,0,7) DATADATE,INX,NAME,VALUE,INIVALUE,REMARKS,FREQ,DATASOURCE,REPORTDEPT,UNIT,CURRENCY,to_char(MAKEDATE,'yyyy-mm-dd'),INXBM from FACT_SJQT_FXZB where to_char(MAKEDATE,'yyyy-mm-dd') = ?";
		List<FACT_SJQT_FXZB> list = runner.query(sql, new BeanListHandler<FACT_SJQT_FXZB>(FACT_SJQT_FXZB.class), times);
		return list;
	}*/
	
}
