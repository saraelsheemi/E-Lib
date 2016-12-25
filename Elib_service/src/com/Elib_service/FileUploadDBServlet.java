package com.Elib_service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.ws.rs.Path;

import com.sun.corba.se.pept.transport.Connection;


/**
 * Servlet implementation class FileUploadDBServlet
 */
@Path("/uploadRequest")
@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)
public class FileUploadDBServlet extends HttpServlet {
     
	    protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	    
	    		String filenName = request.getParameter("fileName");
	            String description = request.getParameter("description");
	            String author = request.getParameter("author");
	            String date = request.getParameter("date");
	            String message = null; 
	            
	            
	            InputStream inputStream = null;
	            Part filePart = request.getPart("file");
	            if (filePart != null) {
	                // prints out some information for debugging
	                System.out.println(filePart.getName());
	                System.out.println(filePart.getSize());
	                System.out.println(filePart.getContentType());
	                 
	                // obtains input stream of the upload file
	                inputStream = filePart.getInputStream();
	            }
	        	try {
				DatabaseController databaseCTRL = new DatabaseController();
				 String sql = "INSERT INTO Upload_Request (_file_name, file_description,file_author,requested_file)"
				 		+ " values (?, ?, ?, ?)";
				 PreparedStatement statement = databaseCTRL.prepareStatement(sql);
		            statement.setString(1, filenName);
		            statement.setString(2, description);
		            statement.setString(3, author);
		          //  statement.setString(4, date);
		            if (inputStream != null) {
		                // fetches input stream of the upload file for the blob column
		                statement.setBlob(4, inputStream);
		            }
		            int row = statement.executeUpdate();
		            if (row > 0) {
		                message = "File uploaded and saved into database";
		            }
			} catch (SQLException e) {
				 message = "ERROR: " + e.getMessage();
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        	finally {
	                // sets the message in request scope
	                request.setAttribute("Message", message);
	                 
	                // forwards to the message page
	                getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
	            }
	        	
	    }

}
