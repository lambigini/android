package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayList<String> array_about = new ArrayList<String>();
        array_about.add("City in California");
        array_about.add("Anaheim is a city outside Los Angeles, in Southern California.");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array_about );

        ListView listView_activity_about = (ListView) findViewById(R.id.activity_about);
        listView_activity_about.setAdapter(arrayAdapter);

    }

}