package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class AvengerDetails extends AppCompatActivity {

    //define the elements of layout file
    private TextView name, real_name, age, fam;
    private ImageView image_poster;

    private Button moreBtn = null;

    private Avenger data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avenger_details);

        name         = findViewById(R.id.textView);
        image_poster = findViewById(R.id.imageView2);
        real_name    = findViewById(R.id.textview_realname);
        age          = findViewById(R.id.textview_agetext);
        fam          = findViewById(R.id.textview_family);
        moreBtn      = findViewById(R.id.button);

        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (Avenger)bundle.getSerializable("data");

        name.setText(data.getmName());

        AssetManager assetManager = getAssets();
        InputStream inputStream = null;
        try {
            inputStream = assetManager.open("avengers/"+data.getmID()+"/"+data.getmRealImg());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        image_poster.setImageBitmap(bitmap);

        real_name.setText(data.getmRealName());
        age.setText(data.getmAge());
        fam.setText(data.getmFam());

        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(AvengerDetails.this, MoreFacts.class);
                Bundle bundle1 = new Bundle();

                bundle1.putSerializable("data", data);
                more.putExtras(bundle1);
                startActivity(more);
            }
        });


    }
}
