package com.torryharris.Model;

public class Car {
    private int chasisNo;
    private String carName;
    private String fueltype;
    private int power;

    public Car(int chasisNo, String carName, String fueltype, int power) {
        this.chasisNo = chasisNo;
        this.carName = carName;
        this.fueltype = fueltype;
        this.power = power;
    }

    public int getChasisNo() {
        return chasisNo;
    }

    public String getCarName() {
        return carName;
    }

    public String getFueltype() {
        return fueltype;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chasisNo=" + chasisNo +
                ", carName='" + carName + '\'' +
                ", fueltype='" + fueltype + '\'' +
                ", power=" + power +
                '}';
    }


}
