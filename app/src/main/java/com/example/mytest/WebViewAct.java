package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewAct extends AppCompatActivity {

    private Avenger data = null;
    private String URL = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        final Intent web = getIntent();
        Bundle bundleweb = web.getExtras();

        data = (Avenger)bundleweb.getSerializable("data");

        URL = data.getmWeb();

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl(URL);

        //myWebView.getSettings().setJavaScriptEnabled(true);
        //myWebView.getSettings().setLoadWithOverviewMode(true);
        //myWebView.getSettings().setUseWideViewPort(true);


    }
}
