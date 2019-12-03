package com.example.android.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class songActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Circles", "Post Malone" ));
        songs.add(new Song("Someone You Love", "Lewis Capaldi" ));
        songs.add(new Song("Good As Hell", "Lizzo" ));
        songs.add(new Song("Memories", "Maroon 5" ));
        songs.add(new Song("Lose You to Love Me", "Selena Gomez" ));





       Log.v("print new song " + songs.get(0).getSongName(), "print new song " + songs.get(0).getArtist());

        // Create an {@link customArrayAdapter}, whose data source is a list of {@link song}s. The
        // adapter knows how to create list items for each item in the list.
       customArrayAdapter adapter = new customArrayAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list_song);

        listView.setAdapter(adapter);


    }
}
