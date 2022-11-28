package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import android.widget.ImageView;

public class user_profile extends AppCompatActivity {

   ImageView img;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        img=findViewById(R.id.profileimage);
        name=findViewById(R.id.username);
        Intent intent=this.getIntent();

        String username=intent.getStringExtra("name");
        int imageid=intent.getIntExtra("image",R.drawable.cong);

        name.setText(username);
        img.setImageResource(imageid);


    }
}