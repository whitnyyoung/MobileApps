package com.techexchange.mobileapps.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Loader extends AsyncTaskLoader<List<News>> {


public Loader(Context context) {

            super(context);}

        @Override
        protected void onStartLoading() {
            super.onStartLoading();
            forceLoad();
        }

        @Override
        public List<News> loadInBackground() {
            List<News> listOfNews = null;
            try {
                URL url = QueryUtils.createUrl();
                String jsonResponse = QueryUtils.makeHttpRequest(url);
                listOfNews = QueryUtils.parseJson(jsonResponse);
            } catch (IOException e) {
                Log.e("QueryUtils", "Error Loader: ", e);
            }
            return listOfNews;
        }
    }



