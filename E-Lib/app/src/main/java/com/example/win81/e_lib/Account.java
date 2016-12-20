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
    private Character gender;
    private AccountType Type;

    public void setID(int ID){};
    public void setName(String name){};
    public  void setEmail(String Email){};
    public  void setPassword(String password){};
    public void setDateOfBirth(Date DOB){};
    public void setLevel(int level){};
    public void setFaculty(String faculty){};
    public  void setUniversity(String uni){};
    public  void setGender(Character g){};
    public void setType(AccountType Type){};

    public int getID(){return ID;};
    public String getName(){return name;};
    public String getEmail(){return Email;};
    public String getPassword(){return password;};
    public Date getDateOfBirth(){return  DateOfBirth;};
    public int getLevel(){return level;};
    public String getFaculty(){return faculty;};
    public String getUniversity(){return university;};
    public Character getGender(){return gender;};
    public AccountType getType(){return Type;};



}
