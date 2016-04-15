package com.mydomain.doa;



import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.mydomain.model.Blog;
import com.mydomain.service.HibernateUtil;


public class BlogDoa {

	
	public Blog getBlog(Integer id) {
		Session ses = HibernateUtil.currentSession();
		try {
			Criteria crit =  ses.createCriteria(Blog.class);
			crit.add(Restrictions.idEq(id));
			Blog blog = (Blog)crit.uniqueResult();
			return blog;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
	
	public List<Blog> getBlogs() {
		Session ses = HibernateUtil.currentSession();
		try {
			return ses.createCriteria(Blog.class).list();
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
	
	public void createBlog(Blog blog){
		Session ses = HibernateUtil.currentSession();
		try {
			Transaction tx = ses.beginTransaction();
			ses.save(blog);
			tx.commit();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	
	public void updateBlog(Blog blog){
		//System.out.println("Updating user: "+u.getName());
		Session ses = HibernateUtil.currentSession();
		try {
			Transaction tx = ses.beginTransaction();
			ses.update(blog);
			tx.commit();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	
	
	public boolean deleteBlog(int id) {
		System.out.println("DeletingBlog: "+id);
		Session ses = HibernateUtil.currentSession();
		try {
			Transaction tx = ses.beginTransaction();
			Blog blog = (Blog) ses.load(Blog.class, id);
			ses.delete(blog);
			tx.commit();
			return true;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
}


