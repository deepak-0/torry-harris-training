public class NewBoxDemo {
    public static void main(String[] args) {
        NewBox n1= new NewBox(100,50,200);
        n1.display();
        System.out.println(n1.getVolume());

        System.out.println("Modified Length " +n1.getLength());
        System.out.println("Modified Width " +n1.getWidth());
        System.out.println("Modified Height "+n1.getHeight());
    }
}
