package Model;

public class Swift implements Car{

    @Override
    public void changeGear() {
        System.out.println("Changing Gear...");
    }

    @Override
    public void move() {
        System.out.println("Car is moving in road");
    }
}
