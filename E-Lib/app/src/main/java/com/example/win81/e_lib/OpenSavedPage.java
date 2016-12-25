package com.example.win81.e_lib;

import android.content.Intent;

/**
 * Created by tabda on 12/18/2016.
 */

public class openSavedPage implements HomeCommands {

    @Override
    public void excute() {

        Intent intent = new Intent(SignIn.this,SignUp.class);
        setContentView(R.layout.s);
    }
}
