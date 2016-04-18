package com.mydomain.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mydomain.doa.BlogDoa;
import com.mydomain.doa.UserData;
import com.mydomain.model.Blog;
import com.mydomain.model.Users;

@Path("/blogs")
public class BlogService {

	BlogDoa blogDoa = new BlogDoa();
	
	public BlogDoa getBlogDoa() {
		return blogDoa;
	}

	public void setBlogDoa(BlogDoa blogDoa) {
		this.blogDoa = blogDoa;
	}

	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Blog getBlog(@PathParam("param") Integer id) {
		return blogDoa.getBlog(id);
		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Blog> getBlogs() {
		return blogDoa.getBlogs();
		
	}
	
	/*
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void createBlog(Blog blog){
	
		blogDoa.createBlog(blog);
		
	}*/
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	//public void createBlog(@FormParam("title") String title,@FormParam("body") String body){
	public void createBlog(Blog blog) {
		blog.setPost_date();
		blogDoa.createBlog(blog);
		
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	//public void updateUser(@FormParam("id") Integer id, @FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void updateBlog(Blog blog){
		blogDoa.updateBlog(blog);
	}
	
	@DELETE
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public boolean deleteBlog(@PathParam("param") Integer id) {
		return blogDoa.deleteBlog(id);
	}
	
}


