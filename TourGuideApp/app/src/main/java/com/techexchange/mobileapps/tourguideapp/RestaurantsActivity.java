package com.techexchange.mobileapps.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Phrases> phrases = new ArrayList<>();

        phrases.add(new Phrases("Giordano's Pizza", "6314 S. Cicero Ave., Chicago, IL 60638", R.drawable.pizza));
        phrases.add(new Phrases("The Patio", "1503 W. Polk St., Chicago, IL 60607", R.drawable.burger));
        phrases.add(new Phrases("Johnnie's Beef", "7500 W. North Ave, Elmwood Park, IL 60707", R.drawable.hamburger));
        phrases.add(new Phrases("Sweet Maple", "1339 W. Taylor St, Chicago, IL 60607", R.drawable.breakfast));
        phrases.add(new Phrases("Dat Donut", "8251 S. Cottage Grove Ave,, Chicago, IL 60619", R. drawable.donut));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases, R.color.category_restaurants);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


}}
