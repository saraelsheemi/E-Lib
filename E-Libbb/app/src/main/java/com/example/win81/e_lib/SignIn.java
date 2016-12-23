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
<<<<<<< HEAD

        Button signIn = (Button) findViewById(R.id.signIn);
        signIn.setOnClickListener(this);


        Button signUp = (Button) findViewById(R.id.signUp);
        signUp.setOnClickListener(this);

        Button forgetPassword = (Button) findViewById(R.id.forgetPassworr);
        forgetPassword.setOnClickListener(this);

=======
        onClickButtonListener();
        onClickButtonListener2();
    }
    public void onClickButtonListener(){
        buttonSignUp=(Button)findViewById(R.id.signUpButton);
        buttonSignUp.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //added by tarek i think
                        //HomeCommands m = new openCoursePage();
                        //m.execute();
                        //
                        Intent intent = new Intent(SignIn.this,SignUp.class);
                        startActivity(intent);
                    }
                }
        );
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e

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

