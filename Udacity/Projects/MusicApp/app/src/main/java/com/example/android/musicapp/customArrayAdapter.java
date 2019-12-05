package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customArrayAdapter extends ArrayAdapter<Song> {

    public customArrayAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songNameTextView = (TextView) convertView.findViewById(R.id.song_name);
        // Get the song Name from the currentSong object and set this text on
        // the song name TextView.
        songNameTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView artistTextView = (TextView) convertView.findViewById(R.id.song_artist);
        // Get the artist from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getArtist());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }


}


