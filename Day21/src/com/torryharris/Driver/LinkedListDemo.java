package com.torryharris.Driver;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {
    public static void main(String[] args) {


        LinkedList<String> list1 = new LinkedList<>();
        list1.add("one");
        list1.add("Two");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("1");
        list2.add("2");

        list1.addAll(list2);

        System.out.println(list1);

        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(100);
        stackInt.push(200);
        stackInt.push(300);
        stackInt.push(500);

        System.out.println(stackInt);
        System.out.println(stackInt.peek());
       // System.out.println(stackInt.pop());
    }
}
