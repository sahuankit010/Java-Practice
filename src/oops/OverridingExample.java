package oops;

abstract class Employee{
    abstract int bonus();

    /*
    A new String object is explicitly created using the new keyword, with the value "Ankit".
    This creates a new object on the heap memory, even if there is already a string literal "Ankit"
    in the string pool. So, even though the content of the string is the same, it's a separate object
    from any existing "Ankit" string literal.
     */
    String whoAreYou(){
        return new String("Ankit");
    }

    /*
    The string "Ankit" is a string literal. In Java, string literals are stored in the string pool,
    which is a special area in the Java heap memory. When you use a string literal like this, Java
    checks if there's already an identical string in the pool.
    If there is, it returns a reference to that existing string instead of creating a new one.
    So, in this case, the same string object from the string pool would be returned every time
    this method is called.
    In terms of functionality, there's usually no practical difference between the two approaches.
    However, the second approach is generally more efficient because it avoids unnecessary object creation.
    Therefore, it's recommended to use string literals when possible, rather than explicitly creating new String objects.
     */
    String whoAreYou1(){
        return new String("Ankit");
    }
}

abstract class Programmer extends Employee {
    abstract int bonus();

}
class Manager extends Employee {
    @Override
    int bonus() {
        return 2000;
    }

    @Override
    public String toString(){
        return "Manager's bonus: " + this.bonus();
    }

}
public class OverridingExample {
    public static void main(String [] args) {
        Manager m = new Manager();
        System.out.println(m.whoAreYou());
        System.out.println(m);
//        System.out.println("Manager's Bonus : "+ m.bonus());
    }
}
