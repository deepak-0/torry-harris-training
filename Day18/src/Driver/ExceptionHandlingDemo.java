package Driver;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
//      try{
//          String s1=null;
//          System.out.println(s1.length());
//      }
//     catch (NullPointerException ex)
//     {
//         System.out.println("Exception : "+ex);
//      }

      Scanner sc=new Scanner(System.in);
      int a= sc.nextInt();
      int b=sc.nextInt();
      int c;
      try{
          if(b==0){
              throw new Exception("Custom Exception");
          }
          else{
              c=a/b;
              System.out.println(c);
          }
      } catch (Exception ex) {
          System.out.println("Exception caught");
          System.out.println(ex);
      }

//        int [] arr = new int [4];
//      //  arr[5] = 10;
//        int a=10,b=0;
//        System.out.println(a/b);
    }
}
