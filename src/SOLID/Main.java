package SOLID;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangle rectangle = new Rectangle(20, 15);
        NoShape noShape = new NoShape();

        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = List.of(circle,
                square,
                cube,
                rectangle);

//        int sum = areaCalculator.sum(shapes);

        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}
