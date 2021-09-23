package Model;

public class Peacock implements Bird{

    @Override
    public void fly() {
        System.out.println("Peacock is flying low");
    }

    @Override
    public void eat() {
        System.out.println("Peacock is eating ");
    }
}
