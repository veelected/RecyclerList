package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class PersonListAdapter extends ArrayAdapter<FeedAdapter> {
    private  int mResource;
    private  Context mContext;
    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String songTitle = getItem(position).getSongTitle();
        String artist = getItem(position).getArtist();
        String info = getItem(position).getInfo();

        FeedAdapter person = new FeedAdapter(songTitle, artist, info);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tv_songTitle = (TextView) convertView.findViewById(R.id.tv_songTitle);
        TextView tv_artist = (TextView) convertView.findViewById(R.id.tv_artist);
        TextView tv_info = (TextView) convertView.findViewById(R.id.tv_info);

        tv_songTitle.setText(songTitle);
        tv_artist.setText(artist);
        tv_info.setText(info);
        return convertView;

    }
}
