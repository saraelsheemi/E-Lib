package com.Elib_service;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Hi {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseController dc = new DatabaseController();
		dc.executeQuery("Update Material SET rate = "+"5"+ " where m_ID = "+ "1");
		System.out.println("Updated");
		
	}

}
