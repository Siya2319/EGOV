package com.google.myworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activityhome extends AppCompatActivity {
    String myReceivedEmail,myReceivedusername;
    TextView txuseremail,txusername,welcomehome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityhome);
        myReceivedEmail = getIntent().getStringExtra("mykey");
        myReceivedusername = getIntent().getStringExtra("myusernamekey");

        txuseremail = findViewById(R.id.txuserwmail);
        txusername = findViewById(R.id.txusername);
        welcomehome = findViewById(R.id.welcomehome);
        txuseremail.setText(myReceivedEmail);

        welcomehome.setText("welcome");


    }
}