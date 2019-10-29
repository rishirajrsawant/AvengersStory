package com.example.mytest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AvengersActivity extends AppCompatActivity {

    private ListView avengersList = null;
    private AvengersXMLData data;
    private ArrayList<Avenger> AvengerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new AvengersXMLData(this);

        for (int i = 0; i < data.getLength(); i++) {
            AvengerList.add(data.getAvenger(i));
        }


        avengersList = findViewById(R.id.avengers_list);

        AvengerAdapter adapter = new AvengerAdapter(this, R.layout.list_item, AvengerList);
        avengersList.setAdapter(adapter);



        avengersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AvengersActivity.this, AvengerDetails.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("data", data.getAvenger(i));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}
