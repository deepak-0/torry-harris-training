package com.torryharris.Model;

import java.util.Comparator;

public class MovieIMDBComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
         return (int) (o2.getImdb()-o1.getImdb());
    }
}
