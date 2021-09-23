import java.sql.SQLOutput;

public class Laptop {
    private int ram;
    private int hdd;
    private String processor;
    private double size;

    public Laptop() {
        System.out.println("The specifications of Laptop : ");
    }

    public void initialize(int r,int h,String p,double s){
        ram=r;
        hdd=h;
        processor=p;
        size=s;
    }
    public void display(){
        System.out.println("Ram size "+ram+" GB");
        System.out.println("HDD size "+hdd+" GB");
        System.out.println("Processor is "+processor);
        System.out.println("Display size is"+size);
    }

}
