package com.example.listviewexample;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewexample.MainActivity;
import com.example.listviewexample.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayAdapterSetting {
    public static void setAdapter(MainActivity mainActivity) {
        ListView lv_listView;
        ArrayList<String> friendArrayList = new ArrayList<>(Arrays.asList("jeff", "bruce", "joe", "chill","jeff", "bruce", "joe", "chill","jeff", "bruce", "joe", "chill","jeff", "bruce", "joe", "chill","jeff", "bruce", "joe", "chill"));
        lv_listView = mainActivity.findViewById(R.id.lv_ListView);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(mainActivity, R.layout.list_view,friendArrayList);

        Collections.sort(friendArrayList);

        lv_listView.setAdapter(arrayAdapter);

    }
}
