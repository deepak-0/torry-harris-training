package com.torryharris.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> student = new HashMap<>();
        student.put(101,1);
        student.put(102,2);
       // System.out.println(student);
        student.put(101,5); // replace value of key 101
       // System.out.println(student);


        for(Map.Entry<Integer,Integer> s1 : student.entrySet()){  // to print values line by line
          //  System.out.println(s1.getKey()+"="+s1.getValue());
            System.out.println(s1);
        }



    }
}
