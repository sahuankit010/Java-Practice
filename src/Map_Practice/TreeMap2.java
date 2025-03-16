package Map_Practice;

// Java program to demonstrate
// the working of TreeMap

import java.util.*;

class TreeMap2 {
    public static void main(String args[]) {
        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> t
                = new TreeMap<>();

        // Inserting the Elements
        t.put(10, "geeks");
        t.put(15, "ide");
        t.put(5, "courses");

        // returns the smallest key greater
        // than the passed key i.e., 15
        System.out.println(t.higherKey(10));

        // returns the greatest smaller key
        // than the passed key i.e., 5
        System.out.println(t.lowerKey(10));

        // greatest key <= passed key i.e., 10
        System.out.println(t.floorKey(10));

        // greatest key >= passed key i.e., 10
        System.out.println(t.ceilingKey(10));
    }
}
