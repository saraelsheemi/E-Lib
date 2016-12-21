package com.Elib_service;

import java.net.URI;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
@Path("/comment")
public class CommentQueries {
	private DatabaseController databaseCTRL; 
	@Path("/add/{comment}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String addComment(@PathParam("comment") String comment) throws SQLException{
		
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Comment values ('"+comment+"')");
		return "Added";
	}
	
	@Path("/delete/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String removeComment(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Comment where id = "+id); 
		return "Removed";
		
	}
	@Path("/report/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String reportComment(@PathParam("id") String id) throws SQLException{

		return "";
	}
}

