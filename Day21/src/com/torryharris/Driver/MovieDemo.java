package com.torryharris.Driver;

import com.torryharris.Model.Movie;
import com.torryharris.Model.MovieCollectionComparator;
import com.torryharris.Model.MovieIMDBComparator;
import com.torryharris.Model.MovieYearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie("Thor", 2015, 8.3f, 500f);
        Movie m2 = new Movie("Hulk", 2004, 9.0f, 700f);
        Movie m3 = new Movie("Captain America", 2007, 8.8f, 900f);
        Movie m4 = new Movie("Iron Man", 2012, 7.9f, 1000f);
        Movie m5 = new Movie("Avatar", 2009, 9.5f, 1500f);

        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);

        Scanner sc = new Scanner(System.in);
        System.out.println("1.title\n2.Year\n3.IMDB\n4.Collection");
        System.out.println("Enter your choice ");
        int n = sc.nextInt();

//        System.out.println("Before Sorting ");
//        for (int i = 0; i < movieList.size(); i++) {
//            System.out.println(movieList.get(i));
//        }

//        System.out.println("After Sorting : ");
//        movieList.sort(new MovieYearComparator());
//        for (int i = 0; i < movieList.size(); i++) {
//            //System.out.println(movieList.get(i));
//        }
        System.out.println("------------------------");
        if (n == 1) {
            movieList.sort(null);
            //movieList.sort(new MovieYearComparator());
            for (int i = 0; i < movieList.size(); i++) {
                System.out.println(movieList.get(i));
            }
        } else if (n == 2) {
            movieList.sort(new MovieYearComparator());
            for (int i = 0; i < movieList.size(); i++) {
                System.out.println(movieList.get(i));
            }
        } else if (n == 3) {
            movieList.sort(new MovieIMDBComparator());

            for (int i = 0; i < movieList.size(); i++) {
                System.out.println(movieList.get(i));
            }
        } else if (n == 4) {
            movieList.sort(new MovieCollectionComparator());
            for (int i = 0; i < movieList.size(); i++) {
                System.out.println(movieList.get(i));
            }
        }
    }
}
