package com.Elib_service;

import java.io.InputStream;
import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.json.simple.JSONObject;
@Path("/uploadRequest")
public class uploadRequestQueries {
	private DatabaseController databaseCTRL; 

//	@Path("upload/{u_ID}/{fileDescription}/{file}/{name}/{author}/{course_ID}/{date}")
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//	public String upload(@PathParam("u_ID") String u_ID,
//			@PathParam("fileDescription") String fileDescription,@PathParam("file") String file,
//			@PathParam("name") String name,@PathParam("author") String author,
//			@PathParam("course_ID") String course_ID,@PathParam("date") String date) throws SQLException{
//		int id = getLastID()+1;
//		databaseCTRL = new DatabaseController(); 
//		databaseCTRL.executeUpdate("insert into Upload_Request values (");
//		return "Removed";
//		
//	}
	@POST 
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String uploadFile(@FormDataParam("file") InputStream uploadedInputStream,
							 @FormDataParam("file")FormDataContentDisposition fileDetail){
	//	saveToDisk(uploadedInputStream, fileDetail);
		//System.out.println(uploadedInputStream);
		//System.out.println(fileDetail.getFileName());
		return "File uploaded successfully";
	}
	
	private void saveToDisk(InputStream uploadedInputStream,
		FormDataContentDisposition fileDetail) {
	//String uploadedFileLocation = 
	
}

	@Path("accept/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String accept(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Upload_Request values (");
		return "Removed";
		
	}
	
	@Path("reject/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String reject(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("delete from Upload_Request where ID = " + id);
		return "Rejected";
		
	}
	public int getLastID() throws SQLException{
		databaseCTRL = new DatabaseController();
		ResultSet resultSet = databaseCTRL.executeQuery("Select max(ID) from Upload_Request");
		resultSet.next();
		return Integer.parseInt(resultSet.getString("ID"));		
	}
}
