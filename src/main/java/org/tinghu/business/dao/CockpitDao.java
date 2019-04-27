/**
 * 
 */
package org.tinghu.business.dao;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import org.tinghu.business.entity.V_FACT_JTGLJSC_RENEWALRATE;
import org.tinghu.business.util.DataSourceUtils;

/**
 * @ClassName: CockpitDao
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019年3月15日 上午11:22:55
 * 
 */

public class CockpitDao {

	// 继续率
	public List<V_FACT_JTGLJSC_RENEWALRATE> queryRate(String times) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		System.out.println("V_FACT_JTGLJSC_RENEWALRATE  传入数据库的查询参数：" + times);
		String sql = "select orgcode,orgname,datadate,managecom,name,salechnl,salechnlname,paidprem_3_m,rcvprem_3_m,paidprem_7_m,rcvprem_7_m,paidprem_13_m,rcvprem_13_m,paidprem_25_m,rcvprem_25_m,paidprem_3_y,rcvprem_3_y,paidprem_7_y,rcvprem_7_y,paidprem_13_y,rcvprem_13_y,paidprem_25_y,rcvprem_25_y from V_FACT_JTGLJSC_RENEWALRATE where to_char(datadate,'yyyy-mm-dd') = ?";
		List<V_FACT_JTGLJSC_RENEWALRATE> list = runner.query(sql,
				new BeanListHandler<V_FACT_JTGLJSC_RENEWALRATE>(V_FACT_JTGLJSC_RENEWALRATE.class), times);
		return list;
	}
}
