package Model;

public class Pigeon implements Bird {
    @Override
    public void fly() {
        System.out.println("Pigeon is flying ");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating ");
    }
}
