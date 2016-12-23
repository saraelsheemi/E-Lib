package com.example.win81.e_lib;

import java.io.File;
import java.util.Date;

/**
 * Created by hanahana on 20/12/2016.
 */
public class UploadRequset {
    private int ID;

    private File file;
    private String fileName;
    private String fileAuthor;
    private Date date;
   private Account account;
    public void setID(int ID){};

    public void setFile(File file){};
    public void setFileName(String fileName){};
    public void setFileAuthor(String fileAuthor){};
    public void setDate(Date date){};
    public void setAccount(Account account){};

    public int getID(){return ID;};

    public File getFile(){return  file;};
    public String getFileName(){return fileName;};
    public String getFileAuthor(){return fileAuthor;};
    public Date getDate(){return  date;};
    public Account getAccount(){return account;};
}
