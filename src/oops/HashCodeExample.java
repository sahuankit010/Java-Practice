package oops;

import java.util.Arrays;
import java.util.List;

public class HashCodeExample {

    public static void main(String[] args){
        List<String> words = Arrays.asList("Welcome", "to", "Baeldung");
        if (words.contains("Baeldung")) {
            System.out.println("Baeldung is in the list");
        }

        Hello h1 = new Hello();

        Hello h2 = h1;
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h1));
        System.out.println(h1 == h2);

        h2.printHello();
        Hello h3 = new Hello(h2);
        System.out.println(h2.hashCode());
        System.out.println(h3.hashCode());
        System.out.println(h3.equals(h2));

    }
}
