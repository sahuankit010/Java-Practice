package Practice2025;

import java.util.Objects;

public class Person {
    private String name;
    private int roll;

    public Person(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return roll == person.roll && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    @Override
    public String toString() {
        return "Name = " + this.name + " age = " + this.roll;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ankit", 1);
        Person p2 = new Person("Ankit", 1);
        Person p3 = p1;

        System.out.println("p1 equals p2:" + p1.equals(p2));
        System.out.println("p1 equals p2:" + p1.equals(p3));
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());
    }
}