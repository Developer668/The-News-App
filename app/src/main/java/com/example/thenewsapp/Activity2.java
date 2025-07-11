package com.example.thenewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();

        int number = intent.getIntExtra("newsCompanyNames", -1);

        //System.out.println(intent.getIntExtra("newsCompanyNames", -1));

            if (number == 0) {

                webView.loadUrl("https://timesofindia.indiatimes.com/");

            }

            else if (number == 1) {

                webView.loadUrl("https://www.bbc.com/");

            }

            else if (number == 2) {

                webView.loadUrl("https://www.hindustantimes.com/");

            }

            else if (number == 3) {

                webView.loadUrl("https://www.indiatoday.in/");

            }

            else if (number == 4) {

                webView.loadUrl("https://edition.cnn.com/India");

            }

            else if (number == 5) {

                webView.loadUrl("https://www.ndtv.com/");

            }
    }
}