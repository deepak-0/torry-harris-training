package com.torryharris.Model;

public class Person implements Comparable<Person> {
    private Long aadharNumber;
    private String name;
    private String state;
    private String occupation;

    public Person(long aadharNumber, String name, String state, String occupation) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        //return this.aadharNumber.compareTo(o.aadharNumber);  // compare with long
       // return this.name.compareTo(o.name); // compare with String in Ascending Order
        return o.name.compareTo(this.name);  // compare with String in Descending order
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadharNumber=" + aadharNumber +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
