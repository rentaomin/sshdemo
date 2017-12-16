package com.rtm.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.rtm.entity.User;
import com.rtm.util.HibernateUtil;

public class HibernateTest {
	
	
	public void save() {
		Session session =HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		for(int i = 0;i<100;i++) {
	    	 User user = new User();
	    	 user.setName("test"+i);
	    	 user.setPassword("mm"+i);
				session.save(user);
			}
				 tx.commit();
				 if (session != null ) {
					 session.close();
				 }
	}
	
	public static void main(String[] args) {
		
		
			 Session session = HibernateUtil.getSession();  
	     
		 Transaction tx = session.beginTransaction();  
	     try {
			for(int i = 0;i<10;i++) {
				 User user = new User();
				 user.setName("zss"+i);
				 user.setPassword("root"+i);
				 session.save(user);
				 tx.commit();
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			HibernateUtil.closeSession();
		}
	     
	     
	     
	     /*	    try {
	    	 List list = session.createNativeQuery("select u.name from t_user u where u.name like '%����%'").list();
	    	 for (Object str:list) {
	    		 System.out.println(str);
	    	 }
			//User u = session.find(User.class, 1);
			 tx.commit();
			 System.out.println("����ɹ�!");
		} catch (Exception e) {
			  tx.rollback();  
			e.printStackTrace();
			System.out.println("����ʧ��");
		} finally{
			HibernateUtil.closeSession();
		}*/
	     }
}
