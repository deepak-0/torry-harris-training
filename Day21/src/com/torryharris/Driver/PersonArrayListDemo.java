package com.torryharris.Driver;

import com.torryharris.Model.EmployeeNameComparator;
import com.torryharris.Model.Person;


import java.util.ArrayList;


public class PersonArrayListDemo {
    public static void main(String[] args) {
        Person p1 = new Person(12220000123l, "Deepak", "TN", " Engineer");
        Person p2 = new Person(11230001123l, "Avinash", "TN", " Engineer");
        Person p3 = new Person(85440011123l, "Anish", "TN", "Business");
        Person p4 = new Person(10210000012l, "Barath", "TN", "Business");

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(p1);
        personArrayList.add(p3);
        personArrayList.add(p2);
        personArrayList.add(p4);
        personArrayList.remove(p2);
        Person p5 = new Person(11000010012l, "Bala", "KL", "Business");
        personArrayList.add(p5);

        System.out.println("Before Sorting ");
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }

        System.out.println("After sorting");
        personArrayList.sort(null);
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }
        System.out.println("Using comparator");
        personArrayList.sort(new EmployeeNameComparator());
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }
    }
}
