package com.example.android.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView song_category = (TextView) findViewById(R.id.song_category);
        TextView playlists_category = (TextView) findViewById(R.id.playlists_category);

        song_category.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent song_category_intent = new Intent(MainActivity.this, songActivity.class);
                                                 startActivity(song_category_intent);
                                             }
                                         });

        playlists_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlists_category_intent = new Intent(MainActivity.this, playlistActivity.class);
                startActivity(playlists_category_intent);
            }
        });



}
}
