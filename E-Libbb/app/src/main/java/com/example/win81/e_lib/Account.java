package com.example.win81.e_lib;

import java.util.Date;


/**
 * Created by hanahana on 20/12/2016.
 */
public class Account {

    private enum AccountType {admin, user}

    private int accountID;
    private String name;
    private String email;
    private String password;
    private Date dateOfBirth;
    private int level;
    private String faculty;
    private String university;
<<<<<<< HEAD
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
=======
    private Character gender;
    private AccountType type;

    // default constructor
    Account() {
        this.accountID = 0;
        this.name = " ";
        this.email = " ";
        this.password = " ";
        this.dateOfBirth = null;
        this.level = 0;
        this.faculty = " ";
        this.university = " ";
        this.gender = null;
        this.type = AccountType.user;
    }

    //Parameterized Constructor

    Account(int accountID, String name, String email, String password,
            Date dateOfBirth, int level, String faculty, String university,
            Character gender, AccountType type) {

        this.accountID = accountID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.level = level;
        this.faculty = faculty;
        this.university = university;
        this.gender = gender;
        this.type = type;
    }

    //Setters and Getters

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }


    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }


    public void setGender(Character gender) {
        this.gender = gender;
    }
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e

    public Character getGender() {
        return gender;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }
}
