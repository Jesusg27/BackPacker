package com.example.backpacker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class principal extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        bottomNavigationView=findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottonNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FirstFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottonNavMethod=new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    Fragment fragment=null;
                    switch (menuItem.getItemId())
                    {
                        case R.id.firstFragment:
                            fragment=new FirstFragment();
                            break;

                        case R.id.secondFragment:
                            fragment=new SecondFragment();
                            break;

                        case R.id.thirdFragment:
                            fragment=new ThirdFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

                    return true;
                }
            };
}
