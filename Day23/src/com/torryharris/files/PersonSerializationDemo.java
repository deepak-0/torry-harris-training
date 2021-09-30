package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class PersonSerializationDemo {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person(123456, "Deepak", "TN", "Business");
        Person p2 = new Person(923456, "Arun", "TN", "Business");
        Person p3 = new Person(323456, "Varun", "TN", "Business");
        Person p4 = new Person(023456, "Dharun", "TN", "Business");

        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream personOutputStream = new ObjectOutputStream(fos);

        personOutputStream.writeObject(p1);
        personOutputStream.writeObject(p2);
        personOutputStream.writeObject(p3);
        personOutputStream.writeObject(p4);
        personOutputStream.flush();
        personOutputStream.close();

//        TreeMap<Integer, Person> personTreeMap = new TreeMap<>();
//        personTreeMap.put(p1.getPersonId(), p1);
//        personTreeMap.put(p2.getPersonId(), p2);
//        personTreeMap.put(p3.getPersonId(), p3);
//        personTreeMap.put(p4.getPersonId(), p4);
//
//        for (Map.Entry<Integer, Person> emp : personTreeMap.entrySet()) {
//            System.out.println( emp.getValue());
//        }

    }
}