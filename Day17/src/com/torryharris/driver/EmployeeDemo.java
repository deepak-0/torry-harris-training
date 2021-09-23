package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arun",001,"Associate",25000f);
        Employee e2 = new Employee("Anish",002,"Associate ",27000f);
        Employee e3 = new Employee("Avi",003,"Associate",23000f);


       //e1.display();
       //e2.display();
      // e3.display();

       Manager m1 = new Manager ("abi",004,"Associate",
               26500f,"Project1",4);

       Lead l1 = new Lead("Barath",005,"Associate",34000,5);

       Clerk c1 = new Clerk("Dinesh",006,"Clerk",14500,"Bsc");

       // System.out.println(m1);
      //  m1.CallMeeting();


       // System.out.println(l1);
        //l1.standUpCall();

       // System.out.println(c1);
       // c1.generatePayRoll();

    }

}
