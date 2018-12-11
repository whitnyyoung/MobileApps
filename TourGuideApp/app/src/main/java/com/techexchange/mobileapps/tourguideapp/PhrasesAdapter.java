package com.techexchange.mobileapps.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesAdapter extends ArrayAdapter<Phrases>{

    private int mColorResourceId;
    //private int mTranslationAudio;
    //private MediaPlayer mediaPlayer;

    public PhrasesAdapter(Activity context, ArrayList<Phrases> phrases, int colorResourceId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, phrases);
        mColorResourceId = colorResourceId;
        //mTranslationAudio = translationAudio;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Phrases currentPhrase = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameView = (TextView) listItemView.findViewById(R.id.name_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameView.setText(currentPhrase.getmName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressView = (TextView) listItemView.findViewById(R.id.address_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressView.setText(currentPhrase.getmAddress());

        TextView hoursView = (TextView) listItemView.findViewById(R.id.hours_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        hoursView.setText(currentPhrase.getmHours());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        if (currentPhrase.hasImage()) {
            imageView.setImageResource(currentPhrase.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);

        }
        // set the image to iconView

        //if (currentPhrase.hasImage()) {
          //  imageView.setImageResource(currentPhrase.getImageResourceId());

        //    imageView.setVisibility(View.VISIBLE);}
        //else{
        //    imageView.setVisibility(View.GONE);}

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);



        // mediaPlayer = MediaPlayer.create(getContext(), mTranslationAudio);
        // Button playM




        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


