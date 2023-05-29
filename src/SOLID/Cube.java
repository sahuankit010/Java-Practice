package SOLID;

public class Cube implements Shape, ThreeDimensionalShape {

    int edge;

    public Cube(int edge){
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
