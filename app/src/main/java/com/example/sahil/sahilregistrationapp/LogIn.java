package com.example.sahil.sahilregistrationapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.*;

public class LogIn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        final Button Login=findViewById(R.id.Login);
        Button Signup=findViewById(R.id.Signup);
        final EditText number=findViewById(R.id.Number);
        final  EditText password=findViewById(R.id.Password);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String str1=sharedPreferences.getString("Number: ","");
                String str2=sharedPreferences.getString("Password: ","");
                if(str1.compareTo(number.getText().toString())==0 && str2.compareTo(password.getText().toString())==0)
                {
                    Intent i = new Intent(LogIn.this, Last.class);
                    startActivity(i);
                }
                  else
                    Toast.makeText(LogIn.this,"Enter Valid Details",Toast.LENGTH_LONG).show();

            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LogIn.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }


}
