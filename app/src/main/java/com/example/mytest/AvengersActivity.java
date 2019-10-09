package com.example.mytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class AvengersActivity extends AppCompatActivity {

    private ListView avengersList = null;
    private ArrayAdapter<String> adapter = null;
    private AvengersXMLData data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new AvengersXMLData(this);

        avengersList = findViewById(R.id.avengers_list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data.getNames());
        avengersList.setAdapter(adapter);

        /*avengersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(PeopleActivity.this, PersonActivity.class);
                //Bundle bundle = new Bundle();

                //bundle.putSerializable("data", data.getAvenger(i));
                //intent.putExtras(bundle);
                //startActivity(intent);
            }
        });*/
    }
}
