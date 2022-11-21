package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import android.widget.ImageView;

public class user_profile extends AppCompatActivity {

   ImageView img;
    TextView name , stragename, nation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        img=findViewById(R.id.profileimage);
        name=findViewById(R.id.username);
        stragename=findViewById(R.id.profilestragename);
        nation=findViewById(R.id.profilenation);
        Intent intent=this.getIntent();

        String username=intent.getStringExtra("name");
        String userstragename=intent.getStringExtra("stragename");
        String usernation=intent.getStringExtra("nation");
        int imageid=intent.getIntExtra("image",R.drawable.user2);

        name.setText(username);
        stragename.setText(userstragename);
        nation.setText(usernation);
        img.setImageResource(imageid);


    }
}