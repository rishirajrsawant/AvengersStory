package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        AvengersList.add(new Avenger(R.drawable.cap, "Captain America" , "The First Avenger"));
        AvengersList.add(new Avenger(R.drawable.iron, "Iron Man" , "I Love You 3000"));
        AvengersList.add(new Avenger(R.drawable.thor, "Thor" , "God of Thunder"));
        AvengersList.add(new Avenger(R.drawable.panth, "Black Panther" , "King of Wakanda"));
        AvengersList.add(new Avenger(R.drawable.blwid, "Black Widow" , "Wow Avenger"));
        AvengersList.add(new Avenger(R.drawable.witch, "Scarlet Witch" , "My favourite"));
        AvengersList.add(new Avenger(R.drawable.ant, "Ant Man" , "Funniest Avenger"));
        AvengersList.add(new Avenger(R.drawable.hulk, "Hulk" , "Mightiest"));
        AvengersList.add(new Avenger(R.drawable.hawk, "Hawk-Eye" , "Baaz ki Nazar"));

        mAdapter = new AvengerAdapter(this,AvengersList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                //Bundle bundle = new Bundle();
                //startActivity(intent);
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.ironman);
                ring.start();

            }
        });

    }
}
