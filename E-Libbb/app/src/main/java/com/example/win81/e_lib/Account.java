package com.example.win81.e_lib;

import java.util.Date;


/**
 * Created by hanahana on 20/12/2016.
 */
public class Account {

    private int ID;
    private String name;
    private String Email;
    private String password;
    private Date DateOfBirth;
    private int level;
    private String faculty;
    private String university;
    private String gender;
    private AccountType Type;

        Account(){};

        Account(int ID  ,String name ,String Email ,
                String password ,Date DOB ,
                int level, String faculty ,
                String university ,String gender , AccountType Type ){

                    this.ID=ID;
                    this.name=name;
                    this.Email=Email;
                    this.password=password;
                    this.DateOfBirth=DOB;
                    this.level=level;
                    this.faculty=faculty;
                    this.university=university;
                    this.gender=gender;
                    this.Type=Type;
        }
    public void setID(int ID){
        this.ID=ID;
    };
    public void setName(String name){
        this.name=name;
    };
    public  void setEmail(String Email){
        this.Email = Email;
    };
    public  void setPassword(String password){
        this.password=password;
    };
    public void setDateOfBirth(Date DOB){
        this.DateOfBirth=DOB;
    };
    public void setLevel(int level){
        this.level=level;
    };
    public void setFaculty(String faculty){
        this.faculty=faculty;
    };
    public  void setUniversity(String uni){
        this.university=uni;
    };
    public  void setGender(String g){
        this.gender=g;
    };
    public void setType(AccountType Type){
        this.Type=Type;
    };

    public int getID(){return ID;};
    public String getName(){return name;};
    public String getEmail(){return Email;};
    public String getPassword(){return password;};
    public Date getDateOfBirth(){return  DateOfBirth;};
    public int getLevel(){return level;};
    public String getFaculty(){return faculty;};
    public String getUniversity(){return university;};
    public String getGender(){return gender;};
    public AccountType getType(){return Type;};



}
