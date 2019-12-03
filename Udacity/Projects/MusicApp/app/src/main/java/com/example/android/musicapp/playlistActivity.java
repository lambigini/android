package com.example.android.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class playlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Hot 100", "English" ));
        songs.add(new Song("Pop", "Latin" ));
        songs.add(new Song("Dance", "Canada" ));
        songs.add(new Song("Hip Hop", "America" ));
        songs.add(new Song("Country", "China" ));


        // Create an {@link customArrayAdapter}, whose data source is a list of {@link song}s. The
        // adapter knows how to create list items for each item in the list.
        customArrayAdapter adapter = new customArrayAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list_song);

        listView.setAdapter(adapter);
    }
}
