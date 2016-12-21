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
 
 public class DatabaseController {
	private Connection dbConnection;	 
 	public DatabaseController() throws SQLException{
 			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 			String url ="jdbc:sqlserver://localhost:1433;DatabaseName=Elib";
				String userName = "elib";
	 			String password = "elibelib";
	 			//get a connection to database with the connection string URL 
	 			dbConnection = DriverManager.getConnection(url, userName, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
 			//create a statement to be executed on the target database
 	}
 	public ResultSet executeQuery(String sqlQuery) throws SQLException{
 		Statement statement = dbConnection.createStatement(); 
 		ResultSet resultSet = statement.executeQuery(sqlQuery);
 		
		return resultSet;
 		
 	}
	public int executeUpdate(String sqlQuery) throws SQLException{
 		Statement statement = dbConnection.createStatement(); 
 		statement.executeUpdate(sqlQuery);
 		
		return 0;
 		
 	}
 	
 }