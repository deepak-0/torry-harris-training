package com.torryharris.Model;

public class Movie implements Comparable<Movie>{
    private  String title;
    private int year;
    private float imdb;
    private float collection;

    public Movie(String title, int year, float imdb, float collection) {
        this.title = title;
        this.year = year;
        this.imdb = imdb;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public float getImdb() {
        return imdb;
    }

    public float getCollection() {
        return collection;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdb=" + imdb +
                ", collection=" + collection +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }
}
