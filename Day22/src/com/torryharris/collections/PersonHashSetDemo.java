package com.torryharris.collections;

import com.torryharris.Model.Person;

import java.util.Collections;
import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> personHashSet=new HashSet<>();

        Person p1 = new Person(1001,"Deepak","Business","Madurai");
        Person p2 = new Person(1000,"Anish","Business","Cbe");
        Person p3 = new Person(1002,"Varun","Manager","Pollachi");
        Person p4 = new Person(1003,"Barath","Engineer","Ooty");
        Person p6 = new Person(1001,"Deepak","Doctor","Blore");
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);
        System.out.println(p1.equals(p6)); // to compare p1 and p6 gives o/p in boolean
        System.out.println(p1.hashCode());
        for(Person person : personHashSet){
            System.out.println(person);
        }
    }
}
