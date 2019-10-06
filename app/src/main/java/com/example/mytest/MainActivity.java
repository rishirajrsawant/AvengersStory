package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private AvengerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.avengers_list);
        ArrayList<Avenger> AvengersList = new ArrayList<>();
        AvengersList.add(new Avenger(R.drawable.cap, "Captain America" , "2013"));
        AvengersList.add(new Avenger(R.drawable.iron, "Iron Man" , "2017"));
        AvengersList.add(new Avenger(R.drawable.thor, "Thor" , "2016"));
        AvengersList.add(new Avenger(R.drawable.panth, "Black Panther" , "2014"));
        AvengersList.add(new Avenger(R.drawable.blwid, "Black Widow" , "1999"));
        AvengersList.add(new Avenger(R.drawable.witch, "Scarlet Witch" , "1975"));
        AvengersList.add(new Avenger(R.drawable.ant, "Ant Man" , "2011"));
        AvengersList.add(new Avenger(R.drawable.hulk, "Hulk" , "2016"));
        AvengersList.add(new Avenger(R.drawable.hawk, "Hawk-Eye" , "2011"));

        mAdapter = new AvengerAdapter(this,AvengersList);
        listView.setAdapter(mAdapter);

    }
}
