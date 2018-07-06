package com.example.sahil.sahilregistrationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

public class Last extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_activity);
      Toast t=  Toast.makeText(this,"Sucessfully Logged In :-) hurray...",Toast.LENGTH_LONG);
      t.setGravity(Gravity.CENTER,0 ,0 );
        t.show();

    }


}
