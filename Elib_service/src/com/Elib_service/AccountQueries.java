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

@Path("/account")
public class AccountQueries {
	private DatabaseController databaseCTRL;

	@Path("/create/{id}/{name}/{type}/{email}/{password}/{gender}/{date}/{level}/{faculty}/{university}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String createAccount(@PathParam("id") String id,
			@PathParam("name") String name, @PathParam("type") String type,
			@PathParam("email") String email,
			@PathParam("password") String password,
			@PathParam("gender") String gender, @PathParam("date") String date,
			@PathParam("level") String level,
			@PathParam("faculty") String faculty,
			@PathParam("university") String university) throws SQLException {
		databaseCTRL = new DatabaseController();
		databaseCTRL.executeUpdate("insert into Users values (" + id + ",'"
				+ name + "','" + type + "','" + email + "','" + password+ "','" + gender + "','" +date+ "'," + level + ",'" + faculty
				+ "','" + university + "')");
		JSONObject object = new JSONObject();
		object.put("Account", "Created");
		return object.toJSONString();
	}

	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String removeAccount(@PathParam("id") String id) throws SQLException {
		databaseCTRL = new DatabaseController();
		databaseCTRL.executeUpdate("Delete from Subscribe where u_ID = " + id);
		databaseCTRL.executeUpdate("Delete from Saves where u_ID = " + id);
		databaseCTRL.executeUpdate("Delete from Users where u_ID = " + id);
		JSONObject object = new JSONObject();
		object.put("Account", "Removed");
		return object.toJSONString();
	}

	@Path("/signin/{email}/{password}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String signIn1(@PathParam("email") String email,
			@PathParam("password") String password) throws SQLException {
		databaseCTRL = new DatabaseController();
		JSONObject object = new JSONObject();
		ResultSet resultSet = databaseCTRL.executeQuery("Select * from Users where email = " + "'"
						+ email + "'");

		if (!resultSet.next()) {
			object.put("Invalid", "Email or Password");
			return object.toJSONString();
		}
		if (resultSet.getString("password").contains(password)) {
			object.put("Password:", resultSet.getString("password"));
			object.put("Email:", resultSet.getString("email"));
		} else
			object.put("Invalid", "Email or Password");
		return object.toJSONString();
	}
<<<<<<< HEAD
	@Path("/userexist/{email}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String cheackUserExist(@PathParam("email") String email)throws SQLException{
		databaseCTRL = new DatabaseController();
		JSONObject object = new JSONObject();
		
		ResultSet resultSet = databaseCTRL
				.executeQuery("Select * from Users where email = " + "'"
						+ email + "'");
		if (!resultSet.next()) {
			object.put("this email is accepted ", resultSet);
			return object.toJSONString();
		}
		
		
=======
	public int getLastID() throws SQLException{
		databaseCTRL = new DatabaseController();
		ResultSet resultSet = databaseCTRL.executeQuery("Select max(u_ID) from Users");
		resultSet.next();
		return Integer.parseInt(resultSet.getString("u_ID"));		
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e
	}
}
