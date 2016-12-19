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