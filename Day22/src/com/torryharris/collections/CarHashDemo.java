package com.torryharris.collections;

import com.torryharris.Model.Car;
import com.torryharris.Model.Employee;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CarHashDemo {
    public static void main(String[] args) {
        Car c1 = new Car(123456, "Creta", "Petrol", 1600);
        Car c2 = new Car(223456, "Swift", "Diesel", 1200);
        Car c3 = new Car(323456, "Swift", "Petrol", 1600);
        Car c4 = new Car(423456, "Innova", "Petrol", 2500);
        Car c5 = new Car(523456, "xuv700", "Diesel", 1800);

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(c1);
        carArrayList.add(c2);
        carArrayList.add(c3);
        carArrayList.add(c4);
        carArrayList.add(c5);
        System.out.println("Printing ArrayList Car......");
        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i));
        }
 TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(c1);
        carTreeSet.add(c2);
        carTreeSet.add(c3);
        carTreeSet.add(c4);
        carTreeSet.add(c5);

        for(Car car : carTreeSet){
          //  System.out.println(car);
        }



        TreeMap<String, Car> carTreeMap = new TreeMap<>();
        carTreeMap.put(c1.getCarName(), c1);
        carTreeMap.put(c2.getCarName(), c2);
        carTreeMap.put(c3.getCarName(), c3);
        carTreeMap.put(c4.getCarName(), c4);
        carTreeMap.put(c5.getCarName(), c5);
        System.out.println("................ ........................");
        for (Map.Entry<String, Car> emp : carTreeMap.entrySet()) {
           // System.out.println(emp.getValue());
        }

    }
}


