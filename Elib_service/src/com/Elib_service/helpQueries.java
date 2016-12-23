package com.Elib_service;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

@Path("/help")
public class helpQueries {
	private DatabaseController databaseCTRL; 
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String send(@PathParam("id") String id,@PathParam("rating") String rating){
		return "<p> rate </p>";
	}
}
