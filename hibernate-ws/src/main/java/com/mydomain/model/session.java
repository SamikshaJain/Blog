package com.mydomain.model;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;


public class session {
	
	public static void main (String[] args) {
	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	
	Session session = sessionFactory.openSession();
	

	//Users newUser = new Users("samijain", "samijain@gmail.com", "sami123", 32, "");
	Users newUser = new Users();
	newUser.setName("samijain123");
	newUser.setEmailId("samijain@gmail.com");
	Transaction tx = session.beginTransaction();
	session.save(newUser);
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

