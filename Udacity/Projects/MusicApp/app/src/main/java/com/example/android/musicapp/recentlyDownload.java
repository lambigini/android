package com.example.android.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class recentlyDownload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Senorita", "Shawn Mendes" ));
        songs.add(new Song("No guidance", "ChrisBrown" ));
        songs.add(new Song("Everything I wanted", "Billie Eillish" ));
        songs.add(new Song("10,000 hours", "Dan" ));
        songs.add(new Song("Truth Hurts", "Lizzo" ));


        // Create an {@link customArrayAdapter}, whose data source is a list of {@link song}s. The
        // adapter knows how to create list items for each item in the list.
        customArrayAdapter adapter = new customArrayAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list_song);

        listView.setAdapter(adapter);


    }
}
