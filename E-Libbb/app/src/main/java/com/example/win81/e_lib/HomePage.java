package com.example.win81.e_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.win81.e_lib.R.id.search;
import static com.example.win81.e_lib.R.id.view;

public class HomePage extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button searchButton = (Button) findViewById(search);
        searchButton.setOnClickListener(this);


        Button CourseButton = (Button) findViewById(R.id.courses);
        CourseButton.setOnClickListener(this);

        Button SubscribeButton = (Button) findViewById(R.id.subscribes);
        SubscribeButton.setOnClickListener(this);

        Button settingsButton = (Button) findViewById(R.id.settings);
        settingsButton.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.search:
                setContentView(R.layout.activity_search);
                break;
            case R.id.courses:
                setContentView(R.layout.courses_view);
                break;
            case R.id.subscribes:
                setContentView(R.layout.activity_notification);
                break;
            case R.id.settings:
                setContentView(R.layout.settings);
                break;
            default:
                break;

        }

    }
}
