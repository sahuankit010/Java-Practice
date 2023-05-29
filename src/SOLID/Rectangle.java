package SOLID;

public class Rectangle implements Shape {

    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return this.length * this.breadth;
    }
}
