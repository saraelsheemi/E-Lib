package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    EditText userNameTB = (EditText) findViewById(R.id.userNameText);
    EditText emailAddressTB = (EditText) findViewById(R.id.emailAddressText);
    EditText PasswordT = (EditText) findViewById(R.id.PasswordText);
    EditText confirmPasswordT =(EditText) findViewById(R.id.confirmPasswordText);
    EditText dateOfBirthT = (EditText) findViewById(R.id.dateOfBirthText);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button submitSignUp = (Button) findViewById(R.id.signUp);
        submitSignUp.setOnClickListener(this);

        AccountController ac;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signUp:
                String userNameText =userNameTB.getText().toString();
                String emailAddressText = emailAddressTB.getText().toString();
                String PasswordText = PasswordT.getText().toString();
                String confirmPasswordText = confirmPasswordT.getText().toString();
                String dateOfBirthText =dateOfBirthT.getText().toString();
                if (PasswordText==confirmPasswordText) {
                    Controller controller = new Controller();
                    controller.signup(userNameText, emailAddressText, PasswordText, confirmPasswordText, dateOfBirthText);
                }
                else
                    // tl3 2ol en el password mesh match ..

        }




    }
}
