package com.Elib_service;

import java.awt.List;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.json.simple.JSONObject;

import java.io.File;

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
//	@POST 
//	@Path("/upload")
//	@Consumes(MediaType.MULTIPART_FORM_DATA)
//	public String uploadFile(@FormDataParam("file") InputStream uploadedInputStream,
//							 @FormDataParam("file")FormDataContentDisposition fileDetail){
//	//	saveToDisk(uploadedInputStream, fileDetail);
//		//System.out.println(uploadedInputStream);
//		//System.out.println(fileDetail.getFileName());
//		return "File uploaded successfully";
//	}
	

//	
//    @POST
//    @Path("/upload")
//    @Consumes("multipart/form-data")
//    public Response uploadFile(MultipartFormDataInput input) throws IOException {
//          
//        Map<String, java.util.List<InputPart>> uploadForm = input.getFormDataMap();
// 
//        // Get file data to save
//        java.util.List<InputPart> inputParts = uploadForm.get("file");
// 
//        for (InputPart inputPart : inputParts) {
//            try {
// 
//                MultivaluedMap<String, String> header = inputPart.getHeaders();
//                String fileName = getFileName(header);
//   
//                // convert the uploaded file to inputstream
//                InputStream inputStream = inputPart.getBody(InputStream.class,
//                        null);
// 
//                byte[] bytes =new byte[8192];
//                int bytesRead;
//                ByteArrayOutputStream output = new ByteArrayOutputStream();
//                while ((bytesRead = inputStream.read(bytes)) != -1)
//                {
//                    output.write(bytes, 0, bytesRead);
//                }
//                // constructs upload file path
//                fileName = "/home/user/Downloads/" + fileName;
//                writeFile(bytes, fileName);
// 
//                  
//                return Response.status(200).entity("Uploaded file name : " + fileName)
//                        .build();
// 
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//    private String getFileName(MultivaluedMap<String, String> header) {
//    	 
//        String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
// 
//        for (String filename : contentDisposition) {
//            if ((filename.trim().startsWith("filename"))) {
// 
//                String[] name = filename.split("=");
// 
//                String finalFileName = name[1].trim().replaceAll("\"", "");
//                return finalFileName;
//            }
//        }
//        return "unknown";
//    }
//// 
//    // Utility method
//    private void writeFile(byte[] content, String filename) throws IOException {
//        File file = new File(filename);
//        if (!file.exists()) {
//            System.out.println("not exist> " + file.getAbsolutePath());
//            file.createNewFile();
//        }
//        FileOutputStream fop = new FileOutputStream(file);
//        fop.write(content);
//        fop.flush();
//        fop.close();
//    }
//    @POST  
//    @Path("/upload")  
//    @Consumes(MediaType.MULTIPART_FORM_DATA)  
//    public Response uploadFile(  
//            @FormDataParam("file") InputStream uploadedInputStream,  
//            @FormDataParam("file") FormDataContentDisposition fileDetail) throws SQLException {  
//            String fileLocation = "D://" + fileDetail.getFileName();  
//                    //saving file  
//            try {  
//                FileOutputStream out = new FileOutputStream(new File(fileLocation));  
//                int read = 0;  
//                byte[] bytes = new byte[1024];  
//                out = new FileOutputStream(new File(fileLocation));  
//                while ((read = uploadedInputStream.read(bytes)) != -1) {  
//                    out.write(bytes, 0, read);  
//                }  
//                out.flush();  
//                out.close();  
//              
//            } catch (IOException e) {e.printStackTrace();}  
//            String output = "File successfully uploaded to : " + fileLocation;  
//            return Response.status(200).entity(output).build();  
//        }  
    
	@Path("accept/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String accept(@PathParam("id") String id) throws SQLException{
		databaseCTRL = new DatabaseController(); 
		databaseCTRL.executeUpdate("insert into Upload_Request values (" );
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
