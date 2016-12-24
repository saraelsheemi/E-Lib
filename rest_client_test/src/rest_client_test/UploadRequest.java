package rest_client_test;

import java.io.File;
import java.util.Date;

public class UploadRequest {
	private int requestID;
    private File f;
    private String fileDescription;
    private String fileName;
    private String fileAuthor;
    private Date requestDate;
    private Account requestUploader;


    //Default Constructor

    UploadRequest() {
        this.requestID = 0;
        this.f = null;
        this.fileDescription = " ";
        this.fileName = " ";
        this.fileAuthor = " ";
        this.requestDate = null;
        this.requestUploader = null;
    }

    //Parameterized Constructor

    UploadRequest(int requestID, File f, String fileDescription, String fileName, String fileAuthor,
                  Date requestDate, Account requestUploader) {
        this.requestID = requestID;
        this.f = f;
        this.fileDescription = fileDescription;
        this.fileName = fileName;
        this.fileAuthor = fileAuthor;
        this.requestDate = requestDate;
        this.requestUploader = requestUploader;

    }

    //Setters and Getters
    public void setID(int requestID) {
        this.requestID = requestID;
    }

    public int getID() {
        return requestID;
    }

    public void setFile(File f) {
        this.f = f;
    }

    public File getFile() {
        return f;
    }
    
    public void setFileDescripion(String fileDescription) {
        this.fileDescription = fileDescription;
    }
    
    public String getFileDescripion() {
       return fileDescription;
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileAuthor(String fileAuthor) {
        this.fileAuthor = fileAuthor;
    }


    public String getFileAuthor() {
        return fileAuthor;
    }


    public void setDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getDate() {
        return requestDate.toString();
    }

}
