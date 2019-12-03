package com.example.android.musicapp;

public class Song {
    //song name
    private String mSongName;

    // song Artist
    private  String mArtist;

    /** create new Song object
     @param songName: name of the song
     @param artist: who sing the song
     */

    public Song(String songName, String artist) {
        mSongName = songName;
        mArtist = artist;
    }

    //get the song name
    public String getSongName() { return  mSongName; }

    //get the artist
    public  String getArtist() { return mArtist;}

}
