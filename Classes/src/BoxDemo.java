public class BoxDemo {
    public static void main(String[] args) {
        box b1=new box();
        b1.initialize(10, 5, 8);
        b1.display();
        System.out.println("The volume of box1 is "+b1.getVolume());
    }
}
