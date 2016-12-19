package com.Elib_service;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

@Path("/course")
public class CourseQueries {
	@Path("/add/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addCQuery(@PathParam("id") String id){
		return "<p> add </p>";
	}
	
	@Path("/remove/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String removeCQuery(@PathParam("id") String id){
		return "<p> remove </p>";
	}
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCQuery(@PathParam("id") String id){
		return "<p> get </p>";
	}
}
