package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnLogin = (Button) findViewById(R.id.register_button_login);
        btnLogin.setOnClickListener((view ->{
            Intent intent = new Intent(Register.this, Login.class);
            startActivity(intent);
        } ));
        Log.d("AAA", "onCreate mainSecond");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart mainSecond");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart mainSecond");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume mainSecond");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause mainSecond");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop mainSecond");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy mainSecond");
    }
}
