package org.tinghu.business.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tinghu.business.entity.User;
import org.tinghu.business.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/select")
	public String select(HttpServletRequest request, Model model) {
		
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserService(userId);
		System.out.println("用户名：" + user.getUserName());
		model.addAttribute(user);
		log.debug(user.toString());
		return "index";
	}
	
	// /user/test?id=1
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		
		int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("userId:" + userId);
		User user = null;
		if (userId == 1) {
			user = new User();
			user.setAge("11");
			user.setId(1);
			user.setPassword("123");
			user.setUserName("javen");
		}
		log.debug(user.toString());
		model.addAttribute("user", user);
		return "index";
	}
	
	/*@ResponseBody
	@RequestMapping(value="/user",method = RequestMethod.POST)
	public List<User> QueryUser(int id){
		List<User> username = userService.getUserService(id);
		System.out.println(username);
		return username;
	}*/
}
