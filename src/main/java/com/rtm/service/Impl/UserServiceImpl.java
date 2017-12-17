package com.rtm.service.Impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import com.rtm.entity.User;
import com.rtm.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService  {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public User saveUser(User user) {
		String sql = "select distinct a from User a where a.name = ? ";
		User entity = null;
		if (user != null) {
			List<User> list = (List<User>) hibernateTemplate.find(sql, user.getName());
			if (list != null && list.size() > 0) {
				entity = list.get(0);
			}
		}
		if (entity == null) {
			hibernateTemplate.save(user);
			entity = user;
		}
		return entity;
	}

}
