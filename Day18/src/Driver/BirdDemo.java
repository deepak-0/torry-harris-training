package Driver;

import Model.Bird;
import Model.Peacock;
import Model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        Bird peacock = new Peacock();
        peacock.eat();
        peacock.fly();

        Pigeon pigeon = new Pigeon();
        pigeon.eat();
        pigeon.fly();
    }
}
