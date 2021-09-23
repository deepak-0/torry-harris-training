package Model;

public class AirIndia implements Airplane{
    @Override
    public void fly() {
        System.out.println("Airplane is flying ");
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying in the sky");
    }
}
