package com.example.mynfcreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);



        webView=findViewById(R.id.webView);

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/sazzadhossainshifat/");

        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                //  startActivity(new Intent(WebActivity.this,MainActivity.class));

                Intent intent=new Intent(WebActivity.this,MainActivity.class);
                intent.putExtra("name",1);
                startActivity(intent);
                finish();

            }
        },60000);


    }
}