package com.torryharris.files;


import com.torryharris.model.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class PersonDeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream personInputStream = new ObjectInputStream(fis);
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person;

        try {
            while (true) {
                person = (Person) personInputStream.readObject();
                personArrayList.add(person);
            }
        } catch (EOFException ex) {

        }
        for(Person p : personArrayList){
            System.out.println(p);
        }

        Person p1 = new Person(123456, "Deepak", "TN", "Business");
        Person p2 = new Person(923456, "Arun", "TN", "Business");
        Person p3 = new Person(323456, "Varun", "TN", "Business");
        Person p4 = new Person(023456, "Dharun", "TN", "Business");
        TreeMap<Integer, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put(p1.getPersonId(), p1);
        personTreeMap.put(p2.getPersonId(), p2);
        personTreeMap.put(p3.getPersonId(), p3);
        personTreeMap.put(p4.getPersonId(), p4);
        System.out.println("----------------------After Sorting------------------------");
        for (Map.Entry<Integer, Person> emp : personTreeMap.entrySet()) {
            System.out.println( emp.getValue());
        }
    }
}

