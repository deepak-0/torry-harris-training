package com.torryharris.model;

public class Sedan extends Car{
    int bootSpace;

    public Sedan(String fuelType, String name, int engineCapacity, int noOfGears,
                 float power, Tyre tyre, Music music, int bootSpace) {
        super(fuelType, name, engineCapacity, noOfGears, power, tyre, music);
        this.bootSpace = bootSpace;
    }

    public void displaySedan(){
        displayFeatures();
        tyre();
        music();
        System.out.println("Boot space is :"+bootSpace+ "L");
        System.out.println("__________________________________");
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}
