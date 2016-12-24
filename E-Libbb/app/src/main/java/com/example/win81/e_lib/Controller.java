package com.example.win81.e_lib;

import java.util.ArrayList;

/**
 * Created by tabda on 12/18/2016.
 */

<<<<<<< HEAD
public class Controller  {
    public static int RateMaterial(material m ,int rate ,User user  ){
=======
public class Controller {
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e

    private Object object1;

    public int rateMaterial(Material m) {

        return m.getRating();
    }


    public int saveMaterial(Material m) {

        return m.getMaterialID();
    }

    public void readMaterial(Material m) {

    }

    public void openMaterial(Material m) {

    }

    public void deleteMaterial(Material m) {

    }

    public int addMaterial(Material m) {

        return m.getMaterialID();
    }

    public void addComment(String comment) {

    }

    public void reportComment(int commentID) {

    }

    public void removeComment(int commentID) {

    }


    public void uploadRequest(UploadRequest requset) {

    }


    public void viewRequests(int requestID) {

    }


    public void subscibe(Course c) {

    }


    public void unsubscribe(Course c) {

    }


    public void signIn(String name, String password) {

    }

    public void signUp(Account newAccount) {

    }

    public void deactivate(Account user) {


    };
    public static void signup(String userNameText ,String emailAddressText ,String PasswordText ,
                              String confirmPasswordText ,String dateOfBirthText){
        AccountController accountController = new AccountController();
        accountController.SignUp(userNameText ,emailAddressText ,PasswordText ,confirmPasswordText ,dateOfBirthText);

    }


    public void requestHelp(Account user) {

    }


}

