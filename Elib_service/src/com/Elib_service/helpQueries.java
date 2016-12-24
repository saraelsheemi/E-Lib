package com.Elib_service;

import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

@Path("/help")
public class helpQueries {
	private DatabaseController databaseCTRL;
	@Path("/{u_id}/{description}/{sub_date}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String send(@PathParam("u_id") String uId,
					   @PathParam("description") String description,
					   @PathParam("sub_date") String submissionDate) throws SQLException{
		int id = getLastID()+1;
		databaseCTRL = new DatabaseController();
		databaseCTRL.executeUpdate("insert into User_inquiry values("+id+","+uId +",'"+description+"','"+submissionDate+"')");
		return "submited successfully";
	}
	public int getLastID() throws SQLException{
		databaseCTRL = new DatabaseController();
		ResultSet resultSet = databaseCTRL.executeQuery("Select max(ID) from User_inquiry");
		resultSet.next();
		return Integer.parseInt(resultSet.getString("ID"));		
	}
}
