package oops;

class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    void display(){
        System.out.println(name + " " + engine);
        System.out.println(numberOfCars);
    }

}

public class StaticExample {

    public static void main(String[] args){
        Car c1 = new Car("C1", "E1");
        c1.display();
        Car c2 = new Car("C2", "E1");
        c2.display();
        Car c3 = new Car("C3", "E1");
        c3.display();
        Car c4 = new Car("C4", "E1");
        c4.display();
        Car c5 = new Car("C5", "E1");
        c5.display();
    }
}
