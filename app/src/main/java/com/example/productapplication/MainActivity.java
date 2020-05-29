package com.example.productapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splashThread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startApplication_Home = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(startApplication_Home);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
