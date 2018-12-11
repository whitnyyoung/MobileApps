package com.techexchange.mobileapps.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Phrases> phrases = new ArrayList<>();

        phrases.add(new Phrases("Sears Tower", "233 S Wacker Dr, Chicago, IL 60606","Hours: 9AM-5PM", R.drawable.baseball));
        phrases.add(new Phrases("Navy Pier", "600 E Grand Ave, Chicago, IL 60611", "Hours: Sun-Th 10AM-8PM, Fri & Sat 10AM-10PM", R.drawable.baseball));
        phrases.add(new Phrases("Millennium Park", "201 E Randolph St, Chicago, IL 60602", "Hours: 6AM-11PM", R.drawable.basketball));
        phrases.add(new Phrases("Buckingham Fountain", "301 S Columbus Dr, Chicago, IL 60605", "Hours: open 24/7", R. drawable.hockey_stick));



        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases, R.color.category_colors);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
