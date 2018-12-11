package com.techexchange.mobileapps.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Phrases> phrases = new ArrayList<>();

        phrases.add(new Phrases("Art Institute of Chicago", " 111 S. Michigan Ave., Chicago, IL 60603", R.drawable.rgb));
        phrases.add(new Phrases("Museum of Contemporary Art", "220 E. Chicago Ave., Chicago, IL 60611", R.drawable.painting));
        phrases.add(new Phrases("Field Museum of Natural History", "1400 S. Lake Shore Dr., Chicago, IL 60605", R.drawable.pharaoh));
        phrases.add(new Phrases("Science & Industry Museum", "5700 S. Lake Shore Dr., Chicago, IL 60637", R.drawable.innovation));
        phrases.add(new Phrases("Shedd Aquarium", "1200 S. Lake Shore Dr., Chicago, IL 60605", R. drawable.jellyfish));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases, R.color.category_museums);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
