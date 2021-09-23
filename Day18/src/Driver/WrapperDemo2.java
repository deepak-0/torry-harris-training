package Driver;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int a=50;

        Integer obj1 =a;    //Boxing
        Integer obj2=a/2;   //Boxing
        int b=obj1*10;  //unboxing
        int c=obj1-25;  //unboxing
        System.out.println("Output of boxing (addition) :  "+(obj1+10));
        System.out.println("Output of unboxing (multiplication) : "+b);
        System.out.println("output of boxing (division) :"+obj2);
        System.out.println("output of unboxing (subtraction) :"+c);

    }
}
