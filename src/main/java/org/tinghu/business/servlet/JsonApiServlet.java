package org.tinghu.business.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.tinghu.business.dao.Fact_sjqt_riskpremMapper;
import org.tinghu.business.entity.Fact_sjqt_riskprem;
import org.tinghu.business.entity.User;
import org.tinghu.business.service.Fact_sjqt_riskpremService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class JsonApiServlet
 */

@WebServlet("/JsonApiServlet")
public class JsonApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public JsonApiServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Autowired
	private Fact_sjqt_riskpremMapper fact_sjqt_riskpremMapper;

	/*
	 * @Autowired private Fact_sjqt_riskpremService fact_sjqt_riskpremService;
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		System.out.println("Get方法");

		// 测试数据
		List<User> list = new ArrayList<User>();
		List<Fact_sjqt_riskprem> riskpremlist = new ArrayList<Fact_sjqt_riskprem>();
		String queryData = request.getParameter("queryData");
		System.out.println("queryData:" + queryData);
		// riskpremlist = fact_sjqt_riskpremService.selectRiskPrem(queryData);
		riskpremlist = fact_sjqt_riskpremMapper.queryFact_sjqt_risk(queryData);

		// 生成JSON数据
		// JSONStringer stringer = new JSONStringer();
		// 1、使用JSONObject Json对象形式
		// JSONObject object = new JSONObject();

		/*
		 * JSONObject json = JSONObject.fromObject(riskpremlist);
		 * System.out.println(json.toString());
		 */

		// 2、使用JSONArray Json数组对象形式
		JSONArray jsonArray = JSONArray.fromObject(riskpremlist);
		String strArray = jsonArray.toString();
		System.out.println(strArray);

		List<Fact_sjqt_riskprem> riskpremlist2 = new ArrayList<Fact_sjqt_riskprem>();
		riskpremlist2 = (List<Fact_sjqt_riskprem>) JSONArray.toCollection(jsonArray, Fact_sjqt_riskprem.class);
		
		for (Fact_sjqt_riskprem fact_sjqt_riskprem : riskpremlist2) {
			System.out.println("------");
			System.out.println(fact_sjqt_riskprem.toString());
		}
		
		try {
			/*
			 * stringer.array(); for (User u : list) {
			 * stringer.object().key("Id").value(u.getId()).key("name").value(u.
			 * getUserName()).key("passwords")
			 * .value(u.getPassword()).endObject(); } for (Fact_sjqt_riskprem
			 * fact_sjqt_riskprem : rikspremlist) { stringer.object().key(arg0)
			 * } stringer.endArray(); object.element("user",
			 * stringer.toString());
			 */
			for (Fact_sjqt_riskprem fact_sjqt_riskprem : riskpremlist) {
				// System.out.println(fact_sjqt_riskprem.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * response.getOutputStream().write(object.toString().getBytes("UTF-8"))
		 * ; response.setContentType("text/json; charset=UTF-8");
		 * 
		 * response.getWriter().append("Served at: "
		 * ).append(request.getContextPath());
		 */
		// return "";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
