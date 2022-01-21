package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "checking";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        ListView lv_listview = findViewById(R.id.lv_ListView);
        FeedAdapter usher = new FeedAdapter("Usher", "Burn", "Burn is a song by American R&B singer Usher, which he wrote with American songwriters Jermaine Dupri and Bryan-Michael Cox. The song was produced by Dupri ");
        FeedAdapter jayz = new FeedAdapter("Jay-Z", "99problems", "99 Problems is the third · In the song, Jay-Z tells a story about dealing with rap critics, racial profiling from a police officer who wants to search his car");
        FeedAdapter aboogie = new FeedAdapter("Aboogie", "Timeless", "Artist Julius Dubose (born December 6, 1995), known professionally as A Boogie wit da Hoodie (or simply A Boogie), is an American rapper, singer, ");
        FeedAdapter usher5 = new FeedAdapter("Usher", "Burn", "Burn is a song by American R&B singer Usher, which he wrote with American songwriters Jermaine Dupri and Bryan-Michael Cox. The song was produced by Dupri ");
        FeedAdapter jayz1 = new FeedAdapter("Jay-Z", "99problems", "99 Problems is the third · In the song, Jay-Z tells a story about dealing with rap critics, racial profiling from a police officer who wants to search his car");
        FeedAdapter aboogie2 = new FeedAdapter("Aboogie", "Timeless", "Artist Julius Dubose (born December 6, 1995), known professionally as A Boogie wit da Hoodie (or simply A Boogie), is an American rapper, singer, ");
        FeedAdapter usher4 = new FeedAdapter("Usher", "Burn", "Burn is a song by American R&B singer Usher, which he wrote with American songwriters Jermaine Dupri and Bryan-Michael Cox. The song was produced by Dupri ");
        FeedAdapter jayz2 = new FeedAdapter("Jay-Z", "99problems", "99 Problems is the third · In the song, Jay-Z tells a story about dealing with rap critics, racial profiling from a police officer who wants to search his car");
        FeedAdapter aboogie3 = new FeedAdapter("Aboogie", "Timeless", "Artist Julius Dubose (born December 6, 1995), known professionally as A Boogie wit da Hoodie (or simply A Boogie), is an American rapper, singer, ");

        ArrayList<FeedAdapter> peopleList = new ArrayList<>();

        peopleList.add(usher);
        peopleList.add(jayz);
        peopleList.add(aboogie);
        peopleList.add(usher5);
        peopleList.add(jayz1);
        peopleList.add(aboogie2);
        peopleList.add(usher4);
        peopleList.add(jayz2);
        peopleList.add(aboogie3);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.listview_topmusic, peopleList);
        lv_listview.setAdapter(adapter);


    }

}