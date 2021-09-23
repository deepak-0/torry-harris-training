package Driver;


import Model.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Swift swift = new Swift();
        swift.changeGear();
        swift.move();

        Boat titanic = new Titanic();
        titanic.floating();
        titanic.move();

        Airplane airIndia = new AirIndia();
        airIndia.fly();
        airIndia.move();
    }
}
