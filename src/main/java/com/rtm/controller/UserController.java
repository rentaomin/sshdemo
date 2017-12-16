package com.rtm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rtm.entity.User;
import com.rtm.service.UserService;

@Controller
@RequestMapping("/hello")
public class UserController {
	
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
		
	}
	
	@RequestMapping("/save")
	public String saveUser(HttpServletRequest request) {
		String msg = "hello springmvc !";
		System.out.println(msg);
		User user = new User();
		user.setName("rrrn");
		user.setPassword("55");
		request.setAttribute("user", user);
		useService.saveUser(user);
		return "userInfo";
		
	}
}
