package Model;

public class Bat implements  Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }

    @Override
    public void feed() {
        System.out.println("Bat is feeding");
    }

    @Override
    public void eat() {
        System.out.println("Bat is eating");
    }

}
