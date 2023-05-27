package oops;


// Java Program to illustrate Abstract class
// Without any abstract method

// Class 1
// An abstract class without any abstract method
abstract class Base2 {

    // Demo method. This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println("Function of Base class is called");
    }
}

// Class 2
class Derived2 extends Base2 {
    //This class only inherits the Base class methods and properties

}
public class AbstractExample2 {
    public static void main(String args[])
    {
        // Creating object of class 2
        Derived2 d = new Derived2();

        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}
