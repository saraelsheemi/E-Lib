package com.example.win81.e_lib;

/**
 * Created by hanahana on 19/12/2016.
 */

public class AccountController {
    private
    int id ;
    String name ;
    String email;
    // String mobileNumber;
    String university;
    String faculty;
    String userName;
    String password;
    String ConfirmPassword;
    String dateOfBirth;

    public
    AccountController(String n, String e ,String u
            ,String f ,String uN ,String p ,String dOB){
        int randomNum = 100 + (int) (Math.random() * 999999);

        id=randomNum;
        name=n;
        email=e;

        university=u;
        faculty=f;
        userName=uN;
        password=p;
        dateOfBirth=dOB;
    }
    public static void addUser(String n, String e ,String u
            ,String f ,String uN ,String p ,String dOB){
        user user = new user(String n, String e ,String u
                ,String f ,String uN ,String p ,String dOB)
    }



}
