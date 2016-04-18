package com.mydomain.model;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "blogPostTable")
public class Blog {

	
	private Users user_id;
	 
	
	private Integer id;
	//private Integer user_id;
	private String title="";
	private String body="";
	private String tag_id="";
	private Timestamp post_date=new Timestamp(1);
	
	public Blog() {
		
	}
	
	public Blog( String title, String body) {
	
		//this.id = id;
		//this.user_id = user_id;
		this.title = title;
		this.body = body;
		this.tag_id = tag_id;
		this.post_date = post_date;
	}

	public Blog(Integer id,  String title, String body, String tag_id, Timestamp post_date,Users user) {
		super();
		this.id = id;
		this.user_id = user;
		this.title = title;
		this.body = body;
		this.tag_id = tag_id;
		this.post_date = post_date;
	}
	
	@JsonIgnore 
	public Users getUser_id() {
		return user_id;
	}

	//@JsonIgnore 
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}*/

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTag_id() {
		return tag_id;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public Timestamp getPost_date() {
		return post_date;
	}

	public void setPost_date() {
		//this.post_date = post_date;
		 java.util.Date date= new java.util.Date();
		 this.post_date = (new Timestamp(date.getTime()));
	}

	public void setPost_date(Timestamp post_date) {
		
		 this.post_date = post_date;
	}
	@Override
	public String toString() {
		return "New Blog [id=" + id + ", user_id=" + user_id + ", title=" + title + ", body=" + body + ", tag_id=" + tag_id
				+ ", post_date=" + post_date + "]";
	}

	
	

	
}
