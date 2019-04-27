/**
 * 
 */
package org.cockpit.rateApi.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import utils.DataSourceUtils;

/**   
 * @ClassName:  QueryDaoImpl   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年3月11日 下午6:34:32   
 *   
 */
public class QueryDaoImpl implements QueryDao {

	/**
	 * 
	 */
	public QueryDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List query(String sql, String times,Object object) throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		List<Object> list = runner.query(sql, new BeanListHandler<Object>(Object.class), times);
		
		return list;
	}
}
