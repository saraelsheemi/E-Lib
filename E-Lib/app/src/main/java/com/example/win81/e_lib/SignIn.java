package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.simple.parser.ParseException;

public class SignIn extends AppCompatActivity {
    private static Button buttonSignUp;
    private static Button buttonSignIn;
    private static EditText emailText;
    private static EditText passwordText;
    private static String email;
    private static String password;
    Controller controller = new Controller();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        onClickButtonListener();
        onClickButtonListener2();
    }
    public void onClickButtonListener(){
        buttonSignUp=(Button)findViewById(R.id.button3);
        buttonSignUp.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(SignIn.this,SignUp.class);
                        startActivity(intent);
                    }
                }
        );

    }
    public void onClickButtonListener2(){
        buttonSignIn=(Button)findViewById(R.id.button);
        emailText = (EditText)findViewById(R.id.editText);
        passwordText = (EditText)findViewById(R.id.editText2);
        buttonSignIn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        try {
                            controller.signIn(emailText.getText().toString(),passwordText.getText().toString());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

    }
}

