package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private static Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        onClickButtonListener();
    }

    public void onClickButtonListener(){
        buttonSearch=(Button)findViewById(R.id.button6);
        buttonSearch.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(HomePage.this,UploadRequestView.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
