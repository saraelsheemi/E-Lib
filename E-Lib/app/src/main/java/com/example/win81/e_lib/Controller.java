package com.example.win81.e_lib;

import java.util.ArrayList;

/**
 * Created by tabda on 12/18/2016.
 */

public class Controller {

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

    }

    public void requestHelp(Account user) {

    }


}
