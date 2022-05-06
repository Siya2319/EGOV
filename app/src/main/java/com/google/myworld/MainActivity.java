package com.google.myworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etemail, etPass, etusername;
    Button btlogin;
    //correct email-abcd.com
    //correct password-admin123

    String Stringemail, StringUsername, Stringpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlogin = findViewById(R.id.btlogin);
        etemail = findViewById(R.id.etemail);
        etPass = findViewById(R.id.etPass);


        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Stringemail = etemail.getText().toString();
                Stringpassword = etPass.getText().toString();


                if (Stringemail.equals("abcd@gmail.com") && Stringpassword.equals("admin123")) {
                    Intent mymovingIntent = new Intent(MainActivity.this, Activityhome.class);
                    mymovingIntent.putExtra("mykey", Stringemail);

                    startActivity(mymovingIntent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}