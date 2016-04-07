package com.mydomain.model;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import junit.framework.Assert;

public class testUser {

	private static SessionFactory sessionFactory;
	
	public void initHibernate() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	@Test
	public void test() {
		initHibernate();
		Session session = sessionFactory.openSession();
		

		//Users newUser = new Users("samijain", "samijain@gmail.com", "sami123", 32, "");
		Users newUser = new Users();
		newUser.setName("newuser3");
		Transaction tx = session.beginTransaction();
		session.save(newUser);
	
		Users samiUser = (Users) session.load(Users.class, 111);
		//Users samiUser = (Users) session.createQuery("select u from Users u where u.name=samijain1");
		samiUser.setEmailId("newuser@gmail.com");
		
		Users delUser = (Users) session.load(Users.class, 102);
		//Users samiUser = (Users) session.createQuery("select u from Users u where u.name=samijain1");
		session.delete(delUser);
		tx.commit();
		List<Users> userList = session.createQuery("select u from Users u").list();
		System.out.println(userList.toString());
		
		/*Iterator itr = userList.iterator();
	while(itr.hasNext()) {
		Users user = (Users) itr.next();
		System.out.println(user.getName() + " " + user.getEmailId());
	}*/
	session.close();
	}

}

