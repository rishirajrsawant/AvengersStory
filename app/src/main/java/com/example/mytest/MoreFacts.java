package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;

public class MoreFacts extends AppCompatActivity {

    private Button playBtn = null, orgBtn = null;

    private Avenger data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_facts);

        playBtn = findViewById(R.id.button2);
        orgBtn  = findViewById(R.id.button3);

        final Intent more = getIntent();
        Bundle bundle1 = more.getExtras();

        data = (Avenger)bundle1.getSerializable("data");

        playBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    String music = "avengers/"+data.getmID()+"/"+data.getmScream();
                    AssetFileDescriptor afd = getAssets().openFd(music);
                    long start = afd.getStartOffset();
                    long end = afd.getLength();
                    MediaPlayer player = new MediaPlayer();
                    player.setDataSource(afd.getFileDescriptor(),start, end);
                    player.prepare();
                    player.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        orgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web = new Intent(MoreFacts.this, WebViewAct.class);
                Bundle bundleweb = new Bundle();

                bundleweb.putSerializable("data", data);
                web.putExtras(bundleweb);
                startActivity(web);
            }
        });
    }
}
