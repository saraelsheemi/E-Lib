package com.Elib_service;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Hi {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String x ="hehe";
		DatabaseController dc = new DatabaseController();
		ResultSet S = dc.executeQuery("Select * from Users where email = 'sara'");
		S.next();
		if(x != S.getString("password").toString())
			System.out.println("here");

		System.out.println(S.getString("password"));
		
	}

}