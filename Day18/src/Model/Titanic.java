package Model;

public class Titanic implements Boat{
    @Override
    public void floating() {
        System.out.println("Boat is Floating");
    }

    @Override
    public void move() {
        System.out.println("boat is moving in Sea");

    }
}
