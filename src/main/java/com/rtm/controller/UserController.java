package com.rtm.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rtm.entity.User;
import com.rtm.service.UserService;

@Controller
@RequestMapping("hello")
public class UserController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService useService;
	
	@RequestMapping("/find")
	public void findUser() {
		String msg = "hello springmvc !";
		System.out.println(msg);
		User user = new User();
		user.setName("ren");
		user.setPassword("333");
		useService.saveUser(user);
		logger.info("保存成功");
		
	}
	
	@RequestMapping("/save")
	public String saveUser(HttpServletRequest request) {
		String msg = "hello springmvc !";
		System.out.println(msg);
		User user = new User();
		user.setId(11);
		user.setName("77");
		user.setPassword("77");
		request.setAttribute("user", user);
		useService.saveUser(user);
		logger.info("保存");
		return "userInfo";
		
	}
}
