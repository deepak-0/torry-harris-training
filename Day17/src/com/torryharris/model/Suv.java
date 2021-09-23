package com.torryharris.model;

public class Suv extends Car {
    String driveMode;
    boolean sunRoof;

    public Suv(String fuelType, String name, int engineCapacity, int noOfGears, float power,
               Tyre tyre, Music music, String driveMode, boolean sunRoof) {
        super(fuelType, name, engineCapacity, noOfGears, power, tyre, music);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }

    public void displaySuv(){
        displayFeatures();
        tyre();
        music();
        System.out.println("Drive Mode :"+driveMode);
        System.out.println("Sun roof : "+sunRoof);
        System.out.println("_________________________________________");
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}
