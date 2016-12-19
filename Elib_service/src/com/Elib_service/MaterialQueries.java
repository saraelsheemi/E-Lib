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
	//rating material will require the material id and the rating given to this material 
	//this function is called when URL http://localhost:8080/Elib_service/rest/material/rate/5 is called
	@Path("/rate/{id}/{rating}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String rateMQuery(@PathParam("id") String id,@PathParam("rating") String rating){
		return "<p> rate </p>";
	}
	
	//remove the link between the material and the user 
	@Path("/remove/{materialId}/{userID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String removeMQuery(@PathParam("materialD") String materialID,@PathParam("userID") String userID){
		return "<p> remove </p>";
	}
	
	// delete the entire material from the database completely 
	//only Admin users can call this functions
	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteMQuery(@PathParam("id") String id){
		return "<p> delete </p>";
	}
	
	//save material by id to a specific user 
	@Path("/save/{materialID}/{userID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String saveMQuery(@PathParam("materialID") String materiaID,@PathParam("userID") String userID){
		return "<p> save </p>";
	}
	// add new material to the database 
	//Only Admin users can use this function
	@Path("/add/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addMQuery(@PathParam("id") String id){
		return "<p> num </p>";
	}
	
	
	
}
