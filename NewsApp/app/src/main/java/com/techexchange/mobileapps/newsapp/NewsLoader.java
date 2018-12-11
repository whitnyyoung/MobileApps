package com.techexchange.mobileapps.newsapp;


public class NewsLoader AsyncTaskLoader<List<News>>{

        public NewsLoader(Context context) {

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
                Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
            }
            return listOfNews;
        }
}
