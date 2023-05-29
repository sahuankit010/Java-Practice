package SOLID;

public class NoShape implements Shape{

    @Override
    public double area() {
        throw new IllegalStateException("Cannot Calculate Area");
    }
}
