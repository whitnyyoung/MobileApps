package com.techexchange.mobileapps.newsapp;

import android.support.v7.app.AppCompatActivity;


public class News {
    String Title;
    String Author;
    String URL;
    String Date;
    String Category;

    public News(String Title, String Author, String URL, String Date, String Category) {
        this.Title = Title;
        this.Author = Author;
        this.URL = URL;
        this.Date = Date;
        this.Category = Category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    @Override
    public String toString() {
        return "News{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", URL='" + URL + '\'' +
                ", Date='" + Date + '\'' +
                ", Section='" + Category + '\'' +
                '}';
    }
}

}
