package com.e.locationpointer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutusActivity extends AppCompatActivity {
    private TextView adress, phoneno, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        getSupportActionBar().setTitle("About Us");



        adress = (TextView) findViewById(R.id.adress);
        phoneno = (TextView) findViewById(R.id.phoneno);
        email = (TextView) findViewById(R.id.eemail);

    }

}