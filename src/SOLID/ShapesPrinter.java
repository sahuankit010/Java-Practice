package SOLID;

import java.util.List;

public class ShapesPrinter {

    // using Dependency Injection
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{Sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "Sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
