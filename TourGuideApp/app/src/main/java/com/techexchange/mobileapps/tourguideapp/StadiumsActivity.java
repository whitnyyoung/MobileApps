package com.techexchange.mobileapps.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StadiumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Phrases> phrases = new ArrayList<>();

        phrases.add(new Phrases("United Center: Chicago Bulls", "233 S. Wacker Dr., Chicago, IL 60606", R.drawable.basketball));
        phrases.add(new Phrases("United Center: Blackhawks", "233 S. Wacker Dr., Chicago, IL 60606", R.drawable.hockey_sticks));
        phrases.add(new Phrases("Soldier Field: Chicago bears", "600 E. Grand Ave, Chicago, IL 60611", R.drawable.american_football));
        phrases.add(new Phrases("Toyota Park: Chicago Fire", "201 E. Randolph St., Chicago, IL 60602", R.drawable.football));
        phrases.add(new Phrases("Wrigley Field: Chicago Cubs", "301 S. Columbus Dr., Chicago, IL 60605", R. drawable.baseball));
        phrases.add(new Phrases("US Cellular Field: Chicago White Six", "301 S. Columbus Dr., Chicago, IL 60605", R. drawable.baseball));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases, R.color.category_stadiums);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
