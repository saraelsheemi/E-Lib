package com.Elib_service;

import java.net.URI;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;

@Path("/material")
public class MaterialQueries {
	@Path("/rate/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String rateMQuery(@PathParam("id") String id){
		return "<p> rate </p>";
	}
	
	@Path("/remove/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String removeMQuery(@PathParam("id") String id){
		return "<p> remove </p>";
	}
	
	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteMQuery(@PathParam("id") String id){
		return "<p> delete </p>";
	}
	
	@Path("/save/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String saveMQuery(@PathParam("id") String id){
		return "<p> save </p>";
	}
	@Path("/add/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addMQuery(@PathParam("id") String id){
		return "<p> num </p>";
	}
	
	
	
}
