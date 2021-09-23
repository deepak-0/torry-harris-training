package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypesDemo {
    public static void main(String[] args) {


        Tyre mrf = new Tyre("MRf",22);

        Music jbl =new Music("JBL",8,1,12.2f);

        HatchBack swift =new HatchBack("Petrol","Swift",2000,6,
                129.9f, mrf,jbl,"power");

        Sedan rapid = new Sedan("Diesel","Rapid",2050,7,
                133.3f,mrf,jbl,250);

        Suv creta =new Suv("Diesel","Creta",2200,7,
                120.5f,mrf,jbl,"Cruise",true);

        swift.displayHatch();
        rapid.displaySedan();
        creta.displaySuv();


    }
}
