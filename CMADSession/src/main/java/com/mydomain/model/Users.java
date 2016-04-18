package com.mydomain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Users {

	private Integer id;
	private String name="";
	private String emailId="";
	private String password="";
	private Date joinDate=new Date();
	private Integer age;
	private String state="";
	//private List<Blog> blogs = new ArrayList<Blog>(0);
	private Set<Blog> blogs;
	
	public Users() {
		
	}
	
	public Users( String name, String emailId, String password) {
		this.name = name;
		this.emailId = emailId;
		this.password = password;
	}
	
	public Users( String name, String emailId, String password,  Integer age, String state) {
	
	
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.joinDate = new Date();
		this.age = age;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void addBlogs (Blog blog) {
		if(blogs == null) {
			this.blogs = new HashSet<Blog>();
		} 
		blogs.add(blog);
		blog.setUser_id(this);
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + ", joinDate="
				+ joinDate + ", age=" + age + ", state=" + state + "]" + "\n";
	}

	
}