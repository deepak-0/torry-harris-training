package Model;

public class Tiger implements Mammal{
    @Override
    public void feed() {
        System.out.println("Tiger is feeding");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}
