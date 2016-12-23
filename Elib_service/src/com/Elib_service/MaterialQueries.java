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

@Path("/material")
public class MaterialQueries {
	private DatabaseController databaseCTRL; 
	//rating material will require the material id and the rating given to this material 
	//this function is called when URL http://localhost:8080/Elib_service/rest/material/rate/5 is called
	@Path("/rate/{id}/{rating}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String rateMQuery(@PathParam("id") String id,@PathParam("rating") String rating) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Update Material SET rate = "+rating+ " where m_ID = "+ id);
		 return "Updated"; 
	}
	
	//remove the link between the material and the user 
	@Path("/remove/{materialId}/{userID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String unsaveMQuery(@PathParam("materialD") String materialID,@PathParam("userID") String userID) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Saves where m_ID = "+materialID+" and "+
		"u_ID = "+userID);
		return "Material Removed";
	}
	
	// delete the entire material from the database completely 
	//only Admin users can call this functions
	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteMQuery(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Saves where m_ID = "+id);
		databaseCTRL.executeUpdate("Delete from Material where m_ID = "+id);
		return "Material Removed";
	}
	
	//save material by id to a specific user 
	@Path("/save/{materialID}/{userID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String saveMQuery(@PathParam("materialID") String materialID,@PathParam("userID") String userID) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Saves values ("+materialID+","+userID+")");
		
		return "Saved";
	}
	// add new material to the database 
	//Only Admin users can use this function
	@Path("/add/{id}/{name}/{extension}/{author}/{rate}/{uploader}/{processor}/{date}/{courseID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addMQuery(@PathParam("id") String id, @PathParam("name") String name,@PathParam("extension") String ext,
			@PathParam("author") String author,@PathParam("rate") String rate,@PathParam("uploader") String uploader,
			@PathParam("processor") String processor,@PathParam("date") String date,@PathParam("courseID") String courseID) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Material values ("+id+","+"'"+name+"'"+","+"'"+ext+"'"+","+"'"+author+"'"+","+rate+","+"'"+uploader+"'"+","+"'"+processor+"'"+","+"'"+date+"'"+","+courseID+")");
		
		
		return "Updated";
	}
	
	@Path("/getinfo/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCInfoQuery(@PathParam("id") String id) throws SQLException{
		 JSONObject object = new JSONObject();
		 databaseCTRL = new DatabaseController(); 
	 	ResultSet resultSet = databaseCTRL.executeQuery("Select * from Material where m_ID = "+id);
	 	resultSet.next();
	 	object.put("Name:",resultSet.getString("name"));
	 	object.put("Rate:",resultSet.getString("rate"));
	 	object.put("author:",resultSet.getString("author"));
	 	
		 
		return object.toJSONString();
		 
	}
	
	
}
