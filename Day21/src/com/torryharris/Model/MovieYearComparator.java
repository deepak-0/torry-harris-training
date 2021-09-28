package com.torryharris.Model;

import java.util.Comparator;

public class MovieYearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {

            return o1.getYear() - o2.getYear();
            // return o2.getImdb()-o1.getImdb();
            // return o2.getCollection()-o1.getCollection();
        }
    }


