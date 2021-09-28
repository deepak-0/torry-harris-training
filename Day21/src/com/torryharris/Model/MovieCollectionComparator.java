package com.torryharris.Model;

import java.util.Comparator;

public class MovieCollectionComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
         return (int) (o1.getCollection()-o2.getCollection());
    }
}
