package com.Elib_service;

import java.net.URI;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
@Path("/uploadRequest")
public class uploadRequestQueries {
	private DatabaseController databaseCTRL; 

	@Path("upload/{id}/{u_ID}/{fileDescription}/{file}/{name}/{author}/{course_ID}/{date}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String upload(@PathParam("id") String id,@PathParam("u_ID") String u_ID,
			@PathParam("fileDescription") String fileDescription,@PathParam("file") String file,
			@PathParam("name") String name,@PathParam("author") String author,
			@PathParam("course_ID") String course_ID,@PathParam("date") String date) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Upload_Request values (");
		return "Removed";
		
	}
	@Path("accept/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String acceptorReject(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Upload_Request values (");
		return "Removed";
		
	}

}
