package com.Elib_service;

import java.net.URI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

@Path("/course")
public class CourseQueries {
	private DatabaseController databaseCTRL; 

	private Connection dbConnection;	

	@Path("/add/{id}/{name}/{code}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addCQuery(@PathParam("id") String id,@PathParam("name") String name,@PathParam("code") String code) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Course values ("+id+",'"+name+"','"+code+"')");
		 return "Added"; 
	}
	
	@Path("/remove/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String removeCQuery(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Subscribe where course_ID = "+id);
		databaseCTRL.executeUpdate("Delete from Course where course_ID = "+id);
		 return "Removed"; 
	}
	
	@Path("/getinfo/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCInfoQuery(@PathParam("id") String id) throws SQLException{
		 JSONObject object = new JSONObject();
		 databaseCTRL = new DatabaseController(); 
	 	ResultSet resultSet = databaseCTRL.executeQuery("Select * from Course where course_ID = "+1);
	 	resultSet.next();
	 	object.put("Name:",resultSet.getString("name"));
	 	object.put("Code:",resultSet.getString("code"));
	 	
		 
		return object.toJSONString();
		 
	}
	@Path("/getinfo")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllInfoQuery() throws SQLException{
		 ArrayList <JSONObject> object = new ArrayList<JSONObject>();
		 JSONObject temp= new JSONObject();
		 databaseCTRL = new DatabaseController(); 
	 	ResultSet resultSet = databaseCTRL.executeQuery("Select * from Course");
	 	while(resultSet.next()){ 		
	 	temp.put("ID:",resultSet.getString("course_ID"));
	 	temp.put("Name:",resultSet.getString("name"));
	 	temp.put("Code:",resultSet.getString("code"));
	 	object.add(temp);
	 	}
		 
		return object.toString();
		 
	}
	@Path("/subscribe/{u_id}/{course_ID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String subscribe(@PathParam("course_ID") String course_ID,
			@PathParam("u_ID") String u_id) throws SQLException{
		 ArrayList <JSONObject> object = new ArrayList<JSONObject>();
		 JSONObject obj= new JSONObject();
		 databaseCTRL = new DatabaseController(); 
	 	ResultSet resultSet = databaseCTRL.executeQuery("insert into Subscribe values(" + 
		 course_ID +","+u_id + ")"); 
	 			
	 	
	 	obj.put("Course","Subscribed");
	 	
		 
		return obj.toString();
		 
	}
	@Path("/unsubscribe/{u_id}/{course_ID}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String unsubscribe(@PathParam("course_ID") String course_ID,
			@PathParam("u_ID") String u_id) throws SQLException{
		 ArrayList <JSONObject> object = new ArrayList<JSONObject>();
		 JSONObject obj= new JSONObject();
		 databaseCTRL = new DatabaseController(); 
	 	ResultSet resultSet = databaseCTRL.executeQuery("delete from Subscribe where course_ID =" + 
		 course_ID +"and u_ID = " + u_id );
	 			
	 	
	 	obj.put("Course","Unsubscribed");
	 	
		 
		return obj.toString();
		 
	}
}
