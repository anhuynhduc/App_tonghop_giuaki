package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity{
    Button btnRegister, btnLogin;
    EditText edtEmail, edtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister= (Button) findViewById(R.id.login_button_register);
        btnLogin= (Button) findViewById(R.id.login_button_login);
        edtEmail= (EditText) findViewById(R.id.login_email);
        edtPass= (EditText) findViewById(R.id.login_password);
        btnLogin.setOnClickListener((view ->{
            Intent intent = new Intent(Login.this, Home.class);
            if (edtEmail.getText().toString().equals("") || edtPass.getText().toString().equals("")){
                Toast.makeText(Login.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
            }else if (edtEmail.getText().toString().equals("an@gmail.com") && edtPass.getText().toString().equals("123")){
                Toast.makeText(Login.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }else {
                Toast.makeText(Login.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
            }
        } ));
        btnRegister.setOnClickListener((view ->{
            Intent intent = new Intent(Login.this, Register.class);
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
