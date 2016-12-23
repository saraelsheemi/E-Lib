package com.example.win81.e_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reviewRequest extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_request);

        Button viewRequest = (Button) findViewById(R.id.viewRequest);
        viewRequest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewRequest:
                setContentView(R.layout.activity_view_request_single);
        }

    }
}
