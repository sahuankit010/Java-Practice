package CollectionPractice;
import java.util.ArrayList;
// Parent class
class Student
{
    void print()
    {
        System.out.println("Student");
    }
}

// Descendant class of Student
class EnggStudent extends Student {
    @Override
    void print()
    {
        System.out.println("EngStudent");
    }
}

// Descendant class of Student
class MgmtStudent extends Student {
    @Override
    void print()
    {
        System.out.println("MgmtStudent");
    }
}

class Wildcard {
    // Wildcard to specify any ArrayList
    // of class Student or its descendant can
    // be passed into this
    // general purpose function
    static void printStudents(ArrayList<? extends Student> al) {

        for (Student s: al)
            s.print();
    }
    // Main function
    public static void main (String[] args) {
        // Creating ArrayList of EnggStudent
        ArrayList<EnggStudent> al1 = new ArrayList<>();

        // Adding EnggStudent to al1
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());

        // Creating ArrayList of MgmtStudent
        ArrayList<MgmtStudent> al2 = new ArrayList<>();

        // Adding MgmtStudent to al2
        al2.add(new MgmtStudent());

        // Calling the general purpose StringIndexOutOfBoundsException
        printStudents(al1);
        printStudents(al2);
    }
}
