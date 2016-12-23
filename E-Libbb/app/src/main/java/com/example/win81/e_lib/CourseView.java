package com.example.win81.e_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import static com.example.win81.e_lib.R.id.uploadRequest;
import static com.example.win81.e_lib.R.id.viewRequest;

public class CourseView extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_view);
        Button uploadRequest = (Button) findViewById(R.id.uploadRequest);
        uploadRequest.setOnClickListener(this);

        Button viewRequest = (Button) findViewById(R.id.viewRequest);
        viewRequest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.uploadRequest:
                setContentView(R.layout.activity_user_upload_request);
                break;
            case R.id.viewRequest:
                setContentView(R.layout.activity_review_request);
                break;
            default:
                break;
        }
    }
}

