package Driver;

import Model.Shape;
import Model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20,30);
        triangle.area();
        Shape shape = new Triangle(10,30);
        shape.area();
    }
}
