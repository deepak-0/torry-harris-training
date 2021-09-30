package com.torryharris.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        stringLinkedHashSet.add("Hello");
        stringLinkedHashSet.add("Abcd");
        stringLinkedHashSet.add("bye");
        System.out.println(stringLinkedHashSet); //gives output in the same order of input(insertion order)
    }
}
