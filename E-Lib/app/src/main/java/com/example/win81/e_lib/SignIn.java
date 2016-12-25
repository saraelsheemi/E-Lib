package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {
    private static Button buttonSignUp;
    private static Button buttonSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        onClickButtonListener();
        onClickButtonListener2();
    }
    public void onClickButtonListener(){
        buttonSignUp=(Button)findViewById(R.id.signUpButton);
        buttonSignUp.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        HomeCommands m = new openCoursePage();
                        m.excute();
                        //
                        Intent intent = new Intent(SignIn.this,SignUp.class);
                        startActivity(intent);
                    }
                }
        );

    }
    public void onClickButtonListener2(){
        buttonSignIn=(Button)findViewById(R.id.signIn);
        buttonSignIn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(SignIn.this,HomePage.class);
                        startActivity(intent);
                    }
                }
        );

    }
}

