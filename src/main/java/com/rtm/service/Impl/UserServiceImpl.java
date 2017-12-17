package com.rtm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtm.entity.User;
import com.rtm.service.UserService;

@Transactional
@Service(value="userService")
public class UserServiceImpl implements UserService  {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveUser(User user) {
		hibernateTemplate.save(user);
	}

}
