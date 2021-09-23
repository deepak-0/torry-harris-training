package Driver;

import Model.Bat;
import Model.Cow;
import Model.Mammal;
import Model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.feed();

        Mammal tiger = new Tiger();
        cow.eat();

        Bat bat = new Bat();
        bat.eat();
        bat.feed();
        bat.fly();
        
    }
}