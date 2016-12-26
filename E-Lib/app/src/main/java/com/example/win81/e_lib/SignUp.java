package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.simple.parser.ParseException;

public class SignUp extends AppCompatActivity {
    private static Button buttonCancel;
    private static Button submit;
    private static EditText name;
    private static EditText email;
    private static EditText password;
    private static EditText date;
    private static EditText confirmpassword;
    Controller controller = new Controller();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        onClickButtonListener();
    }
    public void onClickButtonListener(){
        buttonCancel=(Button)findViewById(R.id.button4);
        buttonCancel.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(SignUp.this,SignIn.class);
                        startActivity(intent);
                    }
                }
        );

    }
    public void onClickButtonListener2(){
        submit=(Button)findViewById(R.id.button3);
        name = (EditText)findViewById(R.id.editText4);
        email = (EditText)findViewById(R.id.editText5);
        password= (EditText)findViewById(R.id.editText6);
        date = (EditText)findViewById(R.id.editText3);
        confirmpassword=(EditText)findViewById(R.id.editText7);
        submit.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        try {
                            controller.signup(name.getText().toString(),email.getText().toString(),password.getText().toString()
                                    ,date.getText().toString());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        Intent intent = new Intent(SignUp.this,SignIn.class);
                             startActivity(intent);
                    }
                }
        );

    }
}
