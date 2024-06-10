package oops;

// Define an interface
interface Animal1 {
    void makeSound();
}

// Implement the interface
class Dog1 implements Animal1 {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class InterfaceWithReferenceButClassInstance {
    public static void main(String[] args) {
        // We can't instantiate an interface directly
        // Animal myAnimal = new Animal(); // This line would cause a compile-time error

        // But we can create a reference of the interface type
        Animal1 myAnimal = new Dog1(); // Here we are creating an instance of Dog class which implements Animal interface

        // And we can use that reference to call methods defined in the interface
        myAnimal.makeSound(); // Output: Woof!
    }
}
