package com.example.productapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import com.example.productapplication.adapter.ProductAdapter;
import com.example.productapplication.model.Products_Response;
import com.google.gson.Gson;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ProductListActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    Products_Response productsResponse;

    Gson gson;
    String url="";
    OkHttpClient client;
    Request request;

    ProductAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        client = new OkHttpClient();
        listView = (ListView) findViewById(R.id.product_listview);
        //client.setConnectTimeout(180,);
        url = getIntent().getStringExtra("categoryurl");
        request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                if(response.isSuccessful()){
                    String responseString = response.body().string();
                    gson=new Gson();
                    productsResponse=gson.fromJson(responseString,Products_Response.class);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adapter=new ProductAdapter(ProductListActivity.this,productsResponse.getProducts());
                            listView.setAdapter(adapter);
                        }
                    });

                }
            }
        });
    }
}
