package com.example.win81.e_lib;

import org.json.simple.parser.ParseException;

/**
 * Created by tabda on 12/18/2016.
 */

public class Controller {
    /*
    public static int RateMaterial(materialUI m ,int rate ,User user  ){

        return totalRate;
    };
    public static int saveMaterial(materialUI m ,User user){

        return materialId;
    };
    public static void readMaterial(materialUI m){

    };
    public static int addComment(String comment ,User user ,int materialId ){

        return commentId;
    };
    public static int reportComment (int commentId ,User user ){

        return reportId;
    };
    public static int removeComment (int commentId ,User user ,){

        return userId;
    };
    public static void deleteMaterial (matrial m ,User user ){

    };
    public static int uploadRequest (materialUI m , User user ){

        return requestId;
    };
    public static void viewRequest (int requestId ){

    };
    public static void openMaterial (materialUI m ,User user){

        return materialId;
    };
    public static int addMaterial (materialUI m ){

        return materialId;
    };
    public static void subscibe(course course ,User user){

    };
    public static void unsubscribe(course course ,User user){

    };
    */
    public static void signIn(String email ,String password ) throws ParseException {
        AccountController accountController = new AccountController();
        accountController.SignIn(email,password);

    };
    public static void signup(String name, String email , String password, String date) throws ParseException {
    AccountController accountController= new AccountController();
        accountController.SignUp(name,email,password,date);
    }
  /*  public static void deactivate(User user){

    }
    public static void requestHelp(User user){

        return inquiryId;
    };
*/
}

