package com.torryharris.Model;


import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o1.getName());
    }
}
