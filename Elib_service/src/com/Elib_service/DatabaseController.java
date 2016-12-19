package com.Elib_service;
 
 /**
  * @author youssef
  *
  */
 import java.sql.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
 
@Path("/calculator/{number1}/{number2}")
 public class DatabaseController {
	 @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getResults(@PathParam("number1") String number1, @PathParam("number2") String number2) {
	    JSONObject object = new JSONObject();
	    object.put("add", Integer.parseInt(number2)+Integer.parseInt(number1));
	    object.put("subtract", Integer.parseInt(number2)-Integer.parseInt(number1));
	    object.put("divide", Integer.parseInt(number2)/Integer.parseInt(number1));
	    object.put("multiply", Integer.parseInt(number2)*Integer.parseInt(number1));
	    return object.toJSONString();
	  }
 	public void test(){
 		try{
 			String url =""; //"jdbc:sqlserver://"el host";databaseName=MYDB";
			String userName = "elib";
 			String password = "elibelib";
 			//get a connection to database with the connection string URL 
 			Connection dbConnection = DriverManager.getConnection(url, userName, password);
 			//create a statement to be executed on the target database
 			Statement statement = dbConnection.createStatement(); 
 			//execute the statement on the target database
 			String sqlQuery = "";
 			ResultSet resultSet = statement.executeQuery(sqlQuery);
			//process the result set
 			System.out.println(resultSet.toString());
 		}catch(Exception exc){
 			exc.printStackTrace();
 		}
 	}
 }