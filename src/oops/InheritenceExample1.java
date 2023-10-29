package oops;

// Java program to demonstrate that Both Super Class
// and Subclass Constructors Refer to Same Object

// Importing required classes
import java.util.*;

// Class 1
// Super Class
class Fruit {

    // Method inside super class
    public Fruit() {

        // Print statement
        System.out.println("Super class constructor");

        // Displaying object hashcode of super class
        System.out.println("Super class object hashcode :" +
                this.hashCode());

        System.out.println(this.getClass().getName());
    }
}

// Class 2
// Sub class extending above super class
class Apple extends Fruit {

    // Method inside sub class
    public Apple() {

        // Print statement
        System.out.println("Subclass constructor invoked");

        // Displaying object hashcode of subclass
        System.out.println("Sub class object hashcode :" +
                this.hashCode());

        System.out.println(this.hashCode() + " " +
                super.hashCode());

        System.out.println(this.getClass().getName() + " " +
                super.getClass().getName());
    }
}

// Class 3
// Main class
public class InheritenceExample1 {

    // Main driver method
    public static void main(String[] args) {

        // Creating an instance of above class
        // inside main() method
        new Apple();
    }
}

