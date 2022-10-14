package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnSecond = (Button) findViewById(R.id.button2);
        btnSecond.setOnClickListener((view ->{
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        } ));
        Log.d("AAA", "onCreate mainSecond");
        };

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
