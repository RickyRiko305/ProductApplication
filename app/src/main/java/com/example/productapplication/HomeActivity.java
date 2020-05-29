package com.example.productapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.drawerlayout.widget.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    //DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    //NavigationView navigationView;
    //WebView webView;
    String categoryurl="";
    Intent intent;
    //DilatingDotsProgressBar dilatingDotsProgressBar;
    CardView phone,computer,laptop,tv,homeTheatre,table,fitness,headPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        phone = (CardView) findViewById(R.id.phone);
        computer = (CardView) findViewById(R.id.computer);
        laptop = (CardView) findViewById(R.id.laptop);
        tv = (CardView) findViewById(R.id.tv);
        homeTheatre = (CardView) findViewById(R.id.homeTheatre);
        table = (CardView) findViewById(R.id.tablet);
        fitness = (CardView) findViewById(R.id.fitness);
        headPhone = (CardView) findViewById(R.id.headPhone);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat209400050001))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=abcat0501000))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=abcat0502000))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=abcat0101000))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        homeTheatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat241600050001))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat209000050006))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat242800050021))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
        headPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryurl="https://api.bestbuy.com/v1/products((categoryPath.id=abcat0204000))?apiKey=&pageSize=40&format=json";
                intent=new Intent(getApplicationContext(),ProductListActivity.class);
                intent.putExtra("categoryurl",categoryurl);
                startActivity(intent);
            }
        });
    }

}
