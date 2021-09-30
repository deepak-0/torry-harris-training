package com.torryharris.collections;

import com.torryharris.Comparator.PersonCityComparator;
import com.torryharris.Model.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1001,"Deepak","Business","Madurai");
        Person p2 = new Person(1000,"Anish","Business","Cbe");
        Person p3 = new Person(1002,"Varun","Manager","Pollachi");
        Person p4 = new Person(1003,"Barath","Engineer","Ooty");

        TreeSet<Person> personTreeSet =new TreeSet<>(new PersonCityComparator());

        personTreeSet.add(p1);
        personTreeSet.add(p3);
        personTreeSet.add(p2);
        personTreeSet.add(p4);

        for(Person person : personTreeSet){
            System.out.println(person);
        }

        personTreeSet.remove(p2);
        System.out.println("------After Removing object ------");
        for(Person person : personTreeSet){
            System.out.println(person);
        }
        System.out.println(personTreeSet.comparator()); // gives the used comparator

    }
}
