/**
 * @author Ankit Sahu
 * @author GeeksForGeeks https://www.geeksforgeeks.org/classes-objects-java/#
 */

package axs210226;

public class Dog {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
    // Constructor Declaration of Class
    public Dog() {
        this.name = "empty";
        this.breed = "empty";
        this.age = 0;
        this.color = "empty";
    }
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() { return name; }

    // method 2
    public String getBreed() { return breed; }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    @Override public String toString()
    {
        return ("Hi my name is " + this.getName()  + ".\nMy breed, age and color are "  + this.getBreed() + ", " + this.getAge()  + ", " + this.getColor() + ".");
    }

    public static void main(String[] args)
    {
        Dog blank = new Dog();
        Dog tuffy = new Dog("Tuffy", "Papillon", 5, "white");

        System.out.println(tuffy.toString());
        System.out.println(blank.toString());
    }
}
