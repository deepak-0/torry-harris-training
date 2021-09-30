package com.torryharris.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> strTreeSet = new TreeSet<String>();
        strTreeSet.add("H");
        strTreeSet.add("Z");
        strTreeSet.add("A");
        System.out.println(strTreeSet);
         strTreeSet.add("K");
        System.out.println(strTreeSet);

        TreeSet<Float> flTreeSet = new TreeSet<>(Collections.reverseOrder());

        flTreeSet.add(22.22f);
        flTreeSet.add(33.45f);
        flTreeSet.add(0.089f);
        System.out.println("For float"+flTreeSet);
    }
}