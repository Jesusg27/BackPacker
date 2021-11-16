package com.example.backpacker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.backpacker.actividades.MainActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registro(View view){
        Intent intentregistro=new Intent(this, registro.class);
        startActivity(intentregistro);
        }

    public void principal(View view){
        Intent intentprincipal=new Intent(this, principal.class);
        startActivity(intentprincipal);
    }

    public void LoginActivity(View view){
        Intent intentLoginActivity=new Intent(this, LoginActivity.class);
        startActivity(intentLoginActivity);
    }
}
