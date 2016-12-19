package com.example.win81.e_lib;

import java.util.ArrayList;

/**
 * Created by Hagar on 2016-12-19.
 */

public class Course {
    int courseID;
    int courseCode;
    String courseName;
    ArrayList<Material> materials = new ArrayList<Material>();

    //Setters and getters

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    public int getCourseID(){
        return courseID;
    }

    public void setCourseCode(int courseCode){
        this.courseCode = courseCode;
    }

    public int getCourseCode(){
        return courseCode;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }


}
