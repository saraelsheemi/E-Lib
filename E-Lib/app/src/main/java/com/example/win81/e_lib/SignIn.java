package com.example.win81.e_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SignIn extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signIn = (Button) findViewById(R.id.signIn);
        signIn.setOnClickListener(this);


        Button signUp = (Button) findViewById(R.id.signUp);
        signUp.setOnClickListener(this);

        Button forgetPassword = (Button) findViewById(R.id.forgetPassworr);
        forgetPassword.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signIn:
                setContentView(R.layout.activity_home_page);
                break;
            case R.id.signUp:
                setContentView(R.layout.activity_sign_up);
                break;
            default:
                break;


        }
    }
}

