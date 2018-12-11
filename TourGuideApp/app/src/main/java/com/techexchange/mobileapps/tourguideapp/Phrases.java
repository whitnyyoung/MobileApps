package com.techexchange.mobileapps.tourguideapp;

import android.support.v7.app.AppCompatActivity;

public class Phrases extends AppCompatActivity {

    private String  mAddress;
    private String  mName;
    private String  mHours;
    private int mImageResourceId;

    public Phrases(String locationName, String locationAddress, String locationHours, int locationResourceId){
        mName = locationName;
        mAddress = locationAddress;
        mHours = locationHours;
        mImageResourceId = locationResourceId;

    }

    public Phrases(String locationName, String locationAddress, int locationResourceId){
        mName = locationName;
        mAddress = locationAddress;
        mImageResourceId = locationResourceId;

    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {

        return mAddress;
    }

    public String getmHours() {
        return mHours;
    }
}
