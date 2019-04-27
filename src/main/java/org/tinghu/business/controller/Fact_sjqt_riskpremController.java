package org.tinghu.business.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tinghu.business.entity.Fact_sjqt_riskprem;
import org.tinghu.business.service.Fact_sjqt_riskpremService;

@Controller
@RequestMapping("/fact_sjqt_riskprem")
public class Fact_sjqt_riskpremController {
	
	@Autowired
	private Fact_sjqt_riskpremService fact_sjqt_riskprmService;
	
	@RequestMapping("/query")
	public String querFact_sjqt_riskprem(HttpServletRequest request, Model model) {
		
		String queryData = request.getParameter("queryData");
		System.out.println("queryData:" + queryData);
		
		List<Fact_sjqt_riskprem> list = new ArrayList<Fact_sjqt_riskprem>();
		list = fact_sjqt_riskprmService.selectRiskPrem(queryData);
		for (Fact_sjqt_riskprem fact_sjqt_riskprem : list) {
			System.out.println(fact_sjqt_riskprem.toString());
		}
		
		//System.err.println("==");
		return "success";
	}
}
