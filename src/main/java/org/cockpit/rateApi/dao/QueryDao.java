/**
 * 
 */
package org.cockpit.rateApi.dao;

import java.util.List;

/**   
 * @ClassName:  QueryDao   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年3月11日 下午5:03:20   
 *   
 */
public interface QueryDao {
	
	public List query(String sql, String times,Object object) throws Exception;
	
}
