package src.test.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mydomain.model.Blog;
import com.mydomain.model.Users;

public class TestBlog {

	public static void main(String[] args) {
		 Blog blog = new Blog("Test Title", "New Blogs for test");
		Users user = new Users("samiksha", "samijain@cisco.com", "cisco123");
	
		user.addBlogs(blog);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();


		session.save(user);
		session.save(blog);

		transaction.commit();
		session.close();
	}

}
