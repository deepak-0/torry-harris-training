package Model;

public class Cow implements Mammal {
    @Override
    public void feed() {
        System.out.println("Cow is Feeding ");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating");

    }
}
