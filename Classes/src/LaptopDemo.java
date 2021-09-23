public class LaptopDemo {
    public static void main(String[] args) {

        Laptop hp = new Laptop();
        Laptop dell = new Laptop();
        hp.initialize(8, 500, "Intel", 17.5);
        dell.initialize(16, 256, "AMD", 15.7);
        hp.display();
        dell.display();
    }
}
