package TestExamples;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class E2 {

    public static void main(String[] args) {
//
//        String a = "Geeks";
//        String b = "geeks";
//        System.out.println(a.compareTo(b));

        String a = "Hello";
        String b = "World";
        System.out.println(a = b);

        TreeSet ts = new TreeSet();
        ts.add(6);
        ts.add(5);
        ts.add(7);
        ts.add(8);
        ts.add(1);
        ts.add(2);

        TreeSet hdset;
        hdset = (TreeSet)ts.headSet(6);
        Iterator itr = hdset.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        TreeMap obj = new TreeMap<>();
        obj.put('A', 1);
        obj.put('B', 2);
        obj.put('C', 3);
        System.out.println(obj.entrySet());

    }
}
