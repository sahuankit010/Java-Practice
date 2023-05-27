/**
 * @author GeeksForGeeks
 * https://www.geeksforgeeks.org/singleton-class-java/
 */

package systemDesign;


// Java program implementing Singleton class
// with using getInstance() method

// Class 1
// Helper class
class ImplementSingleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static ImplementSingleton single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private ImplementSingleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // Static method to create instance of Singleton class
    public static ImplementSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new ImplementSingleton();

        return single_instance;
    }
}

// Class 2
// Main class
class Singleton {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        ImplementSingleton x = ImplementSingleton.getInstance();

        // Instantiating Singleton class with variable y
        ImplementSingleton y = ImplementSingleton.getInstance();

        // Instantiating Singleton class with variable z
        ImplementSingleton z = ImplementSingleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects points to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}

