package com.rtm.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rtm.entity.User;
import com.rtm.service.UserService;

@Controller
@RequestMapping("user")
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
	

	@ResponseBody
	@RequestMapping("/saveUser")
	public User saveUser(@ModelAttribute(value="user") User user) {
		String msg = "hello springmvc !";
		System.out.println(msg);
		User entity  = null;
		if (user != null) {
			 entity = useService.saveUser(user);
		}
		logger.info("保存");
		return entity;
	}
	
	@RequestMapping("/index")
	public String forwardIndex(@RequestParam(value="name")String name,HttpServletRequest request) {
		try {
			String nameStr = new String(name.getBytes("iso8859-1"),"utf-8");
			request.setAttribute("name",nameStr);
		} catch (UnsupportedEncodingException e) {
			logger.error("传递参数转码错误!");
		}
		return "index";
	}
	
	@RequestMapping(value="/loginOut")
	public String loginOut() {
		return "content";
	}
}
