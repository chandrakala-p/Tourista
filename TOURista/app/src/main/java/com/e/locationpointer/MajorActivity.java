package com.e.locationpointer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MajorActivity extends AppCompatActivity {
private TextView navigation,content,whatsnew,gallery,settings,aboutus,current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        getSupportActionBar().setTitle("Menu");

        navigation = (TextView) findViewById(R.id.navigation);
        content = (TextView) findViewById(R.id.content);
        whatsnew = (TextView) findViewById(R.id.whatsnew);
        gallery = (TextView) findViewById(R.id.gallery);
        settings = (TextView) findViewById(R.id.setting);
        aboutus = (TextView) findViewById(R.id.aboutus);
        current = (TextView) findViewById(R.id.currentloc);

        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity1();
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity6();
            }
        });

       content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity2();
            }
        });

        whatsnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity3();
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity4();
            }
        });

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity5();
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity7();
            }
        });
    }

    private void activity1() {
        Intent i1=new Intent (this,MapsActivity.class);
        startActivity(i1);
    }

    private void activity2() {
        Intent i1=new Intent (this,ContentActivity.class);
        startActivity(i1);
    }

    private void activity3() {
        Intent i1=new Intent (this,WhatsActivity.class);
        startActivity(i1);
    }

    private void activity4() {
        Intent i1=new Intent (this,ImageActivity.class);
        startActivity(i1);
    }



    private void activity6() {
        Intent i1=new Intent (this,SettingsActivity.class);
        startActivity(i1);
    }

    private void activity7() {
        Intent i1=new Intent (this,AboutusActivity.class);
        startActivity(i1);
    }

    private void activity5() {
        Intent i1=new Intent (this,MapsActivity2.class);
        startActivity(i1);
    }
}
