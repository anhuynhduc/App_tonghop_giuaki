package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = (Button) findViewById(R.id.button1);
        btnMain.setOnClickListener((view ->{
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        } ));
        Log.d("AAA", "onCreate main");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy main");
    }


}