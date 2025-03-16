package ComparatorPractice;

import java.util.*;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + '}';
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        // original student data
        System.out.println("original student data: " + students);
        // Sort by name
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name: " + students);

        // Sort by roll number
        Collections.sort(students, new RollNumberComparator());
        System.out.println("Sorted by roll number: " + students);


        // Sort by roll number reversed
        Collections.sort(students, new RollNumberComparator().reversed());
        System.out.println("Sorted by roll number reversed: " + students);
    }
}
