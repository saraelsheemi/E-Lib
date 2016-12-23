package com.example.win81.e_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editprofile extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        Button editProfile = (Button) findViewById(R.id.editProfile);
        editProfile.setOnClickListener(this);

        Button editAccount = (Button) findViewById(R.id.editAccount);
        editAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.editProfile:
                setContentView(R.layout.edit_profile_d);
                break;
            case R.id.editAccount:
                setContentView(R.layout.activity_edit_account_settings);
                break;
            default:
                break;
        }

    }
}
