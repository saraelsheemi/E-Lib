package com.example.win81.e_lib;

import java.io.File;
import java.util.Date;

/**
 * Created by Hagar on 2016-12-23.
 */

public class Material {

    private enum materialType {link, book, exams, slides}
    private int materialID;
    private String materialName;
    private String extension;
    private String author;
    private Date dateAdded;
    private int rating;
    private Account uploadedBy = new Account();
    private Account reviewedBy = new Account();
    private Course materialCourse = new Course();
    private File materialFile;

    // Default constructor

    Material() {
        this.materialID = 0;
        this.materialName = " ";
        this.extension = " ";
        this.author = " ";
        this.dateAdded = null;
        this.rating = 0;
        this.uploadedBy = null;
        this.reviewedBy = null;
        this.materialCourse = null;
        this.materialFile = null;
    }

    //Parameterized Constructor

    Material(int materialID, String materialName, String extension, String author,
             Date dateAdded, int rating, Account uploadedBy,
             Account reviewedBy, Course materialCourse,
             File materialFile) {

        this.materialID = materialID;
        this.materialName = materialName;
        this.extension = extension;
        this.author = author;
        this.dateAdded = dateAdded;
        this.rating = rating;
        this.uploadedBy = uploadedBy;
        this.reviewedBy = reviewedBy;
        this.materialCourse = materialCourse;
        this.materialFile = materialFile;

    }


    //Setters and Getters

    public void setMaterialID(int materialID){
        this.materialID = materialID;
    }

    public int getMaterialID(){
        return materialID;
    }

    public void setMaterialName(String materialName){
        this.materialName = materialName;
    }

    public String getMaterialName(){
        return materialName;
    }

    public void setExtension(String extension){
        this.extension = extension;
    }

    public String getExtension(){
        return extension;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setDateAdded(Date dateAdded){
        this.dateAdded = dateAdded;
    }

    public String getDateAdded(){
        return dateAdded.toString();
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public void setMaterialFile(File materialFile){
        this.materialFile = materialFile;
    }

    public File getMaterialFile(){
        return materialFile;
    }


}
