package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AvengerDetails extends AppCompatActivity {

    //define the elements of layout file
    private TextView name;
    private ImageView image_poster;

    private Avenger data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avenger_details);

        name = findViewById(R.id.textView);
        image_poster = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (Avenger)bundle.getSerializable("data");

        name.setText(data.getmName());


    }
}
