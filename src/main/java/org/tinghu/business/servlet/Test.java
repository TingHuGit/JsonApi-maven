/**
 * 
 */
package org.tinghu.business.servlet;

import java.sql.SQLException;
import java.util.List;

import org.tinghu.business.dao.CockpitDao;
import org.tinghu.business.entity.Rate;
import org.tinghu.business.entity.V_FACT_JTGLJSC_RENEWALRATE;
import org.tinghu.business.service.impl.RateServiceImpl;

/**   
 * @ClassName:  Test   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年3月15日 上午8:38:50   
 *   
 */
public class Test {
	
	//空指针异常
	public static void main(String[] args) {
		
		System.out.println("开始！");
		
		/*RateServiceImpl rateServiceImpl = new RateServiceImpl();
		List<Rate> rates = rateServiceImpl.queryRate("2019-03-13");
		
		Rate rate = new Rate();
		rate.setManagecom("11");
		int a = rateServiceImpl.insert(rate);
		System.out.println(a);*/
		
		CockpitDao cockpitDao = new CockpitDao();
		
		try {
			List<V_FACT_JTGLJSC_RENEWALRATE> rates = cockpitDao.queryRate("2019-03-13");
			for (V_FACT_JTGLJSC_RENEWALRATE rate : rates) {
				String managecom = rate.getManagecom();
				System.out.println(managecom);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
