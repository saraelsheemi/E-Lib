package com.Elib_service;

import java.net.URI;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
@Path("/account")
public class AccountQueries {
	private DatabaseController databaseCTRL; 
	@Path("/create/{id}/{name}/{type}/{email}/{password}/{gender}/{date}/{level}/{faculty}/{university}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String createAccount(@PathParam("id") String id,@PathParam("name") String name,
			@PathParam("type") String type,@PathParam("email") String email,@PathParam("password") String password,
			@PathParam("gender") String gender,@PathParam("date") String date,@PathParam("level") String level,
			@PathParam("faculty") String faculty,@PathParam("university") String university) 
			throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Users values ("+id+",'"+name+"','"+type+"','"+email+
				"','"+password+"','"+date+"','"+gender+"',"+level+",'"+faculty+"','"+university+"')");
		 return "Account Created"; 
	}
	@Path("/delete/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String removeAccount(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Users where u_id = "+id);
		return "Account Deleted";
	}
	
	@Path("/signin/{email}/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String signIn(@PathParam("email") String email,@PathParam("password") String password) throws SQLException{
		databaseCTRL = new DatabaseController(); 
//	/	databaseCTRL.executeUpdate("Delete from Users where u_id = "+id);
		return "Account Deleted";
	}
	

}
