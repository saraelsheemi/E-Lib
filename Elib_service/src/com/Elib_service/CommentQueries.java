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
@Path("/comment")
public class CommentQueries {
	private DatabaseController databaseCTRL; 
	@Path("/add/{u_id}/{comment}/{m_id}/{submission_date}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String addComment(@PathParam("u_id") String userId,
							 @PathParam("comment") String comment,
							 @PathParam("m_id") String materialId,
							 @PathParam("submission_date") String submissionDate) throws SQLException{
		int id = getLastIDComment()+1;
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Comment values "
				+ "("+Integer.toString(id)+","+userId+",'"+comment+"',"+materialId+",'"+submissionDate+"')" );
		JSONObject object = new JSONObject();
		object.put("response", "comment added");
		return object.toJSONString();
	}
	
	@Path("/delete/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String removeComment(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("Delete from Comment where id = "+id); 
		JSONObject object = new JSONObject();
		object.put("response", "comment removed");
		return object.toJSONString();
		
	}
	@Path("/report/{comment_id}/{material_id}/{description}/{Date}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String reportComment(@PathParam("comment_id") String comment_id,
			@PathParam("material_id") String material_id, @PathParam("description") String description,
			@PathParam("Date") String date) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		int id = getLastIDCommentReport()+1;
		databaseCTRL.executeUpdate("insert into CommentReport values ( "+Integer.toString(id)+","+comment_id+","+
		material_id+","+"'"+description+"','"+date+"')"); 
		JSONObject object = new JSONObject();
		object.put("response", "comment reported");
		return object.toJSONString();
	}
	public int getLastIDComment() throws SQLException{
		databaseCTRL = new DatabaseController();
		ResultSet resultSet = databaseCTRL.executeQuery("Select max(ID) from Comment");
		resultSet.next();
		return Integer.parseInt(resultSet.getString(1));		
	}
	public int getLastIDCommentReport() throws SQLException{
		databaseCTRL = new DatabaseController();
		ResultSet resultSet = databaseCTRL.executeQuery("Select max(ID) from CommentReport");
		resultSet.next();
		return Integer.parseInt(resultSet.getString(1));		
	}
}

