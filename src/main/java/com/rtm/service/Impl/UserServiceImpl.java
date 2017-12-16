package com.rtm.service.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtm.entity.User;
import com.rtm.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveUser(User user) {
		Session  session  = sessionFactory.openSession();
		Transaction  tx = session.beginTransaction();
		System.out.println(session);
		session.save(user);
		tx.commit();
		
		if (tx!=null) {
			session.close();
		}
		System.out.println(session);
		System.out.println("保存成共");
	}

}
