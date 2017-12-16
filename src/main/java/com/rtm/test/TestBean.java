package com.rtm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtm.service.UserService;

/**
 * 测试bean的注入
 * 
 * @author Dell
 *
 */
public class TestBean {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.toString());
	}
}
