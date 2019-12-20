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

        ArrayList<StringObject> array_about = new ArrayList<StringObject>();

        array_about.add(new StringObject("City in California","Anaheim is a city outside Los Angeles, in Southern California." ));

        InfoAdapter infoAdapter = new InfoAdapter(this, array_about );

        ListView listView_activity_about = (ListView) findViewById(R.id.activity_about);
        listView_activity_about.setAdapter(infoAdapter);

    }

}