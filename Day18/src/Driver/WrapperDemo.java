package Driver;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
//        int a=10;
//        Integer obj1= a;
//        int b =obj1;
//        System.out.println(obj1);
//        int c= obj1+10;
//
//        System.out.println(c);
//
//        String s1="1234";
//        System.out.println(s1);
//
//        int num=Integer.parseInt(s1);
//        System.out.println(num+10);

        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        int num=Integer.parseInt(s1);
        float f1=Float.parseFloat(s2);

        System.out.println(num*2);
        System.out.println(f1*2);

    }
}
