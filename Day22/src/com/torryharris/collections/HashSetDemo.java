package com.torryharris.collections;

import com.torryharris.Model.Person;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strHashSet = new HashSet<>();

        strHashSet.add("eerrty");
        strHashSet.add("aaaa");
        strHashSet.add("zzz");

        System.out.println(strHashSet);

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(10000);
        integerHashSet.add(0);
        integerHashSet.add(null);
        integerHashSet.add(200);
        integerHashSet.remove(0);
        System.out.println(integerHashSet);

  //      HashSet<Person> personHashSet = new HashSet<>();

//        Person p1 = new Person(101,"arun","business","coimbatore");
//        personHashSet.add(p1);
//        for(Person person : personHashSet){
//            System.out.println(person);
//        }
    }
}
