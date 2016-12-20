package com.example.win81.e_lib;

import java.util.Date;
import java.util.ArrayList;


/**
 * Created by Hagar on 2016-12-19.
 */

public class UserInquiry {

    int inquiryID;
    String inquiryContent;
    Date inquiryDate;
    Account inquirySenderAccount = new Account();

    //Setters and Getters

    public void setInquiryID(int inquiryID){
        this.inquiryID = inquiryID;
    }

    public  int getInquiryID(){
        return inquiryID;
    }

    public void setInquiryContent(String inquiryContent){
        this.inquiryContent = inquiryContent;
    }

    public  String getInquiryContent(){
        return inquiryContent;
    }

    // functionalities

    public void sendInquiry(){

    }

    public String viewInquiry(){
        return inquiryContent;
    }


}
