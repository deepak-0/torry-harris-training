package Model;

public class Triangle extends Shape {
    private int height;
    private int length;

    public Triangle(int height, int length) {
        this.height = height;
        this.length = length;
    }



    public void area() {
        System.out.println("The area of triangle : " + ((height * length)/2));
    }
}
