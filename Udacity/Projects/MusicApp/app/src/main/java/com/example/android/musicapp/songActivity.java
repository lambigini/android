package com.example.android.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class songActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Post Maline", "Circles" ));
       Log.v("print new song " + songs.get(0).getmSongName(), "print new song " + songs.get(0).getmArtist());
    }
}
