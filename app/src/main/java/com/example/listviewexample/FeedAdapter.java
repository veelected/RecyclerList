package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class FeedAdapter {
    private String songTitle;
    private String artist;
    private String info;

    public FeedAdapter(String songTitle, String artist, String info) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.info = info;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

