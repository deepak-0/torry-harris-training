package com.torryharris.model;

 public class HatchBack extends Car{
      String steeringType;

     public HatchBack(String fuelType, String name, int engineCapacity, int noOfGears, float power,
                      Tyre tyre, Music music, String steeringType) {
         super(fuelType, name, engineCapacity, noOfGears, power, tyre, music);
         this.steeringType = steeringType;
     }

     public void displayHatch(){
         displayFeatures();
         tyre();
         music();
         System.out.println("Steering Type :"+steeringType);
         System.out.println("______________________________");

     }

     public String getSteeringType() {
          return steeringType;
      }

      public void setSteeringType(String steeringType) {
          this.steeringType = steeringType;
      }
  }
