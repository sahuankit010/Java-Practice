package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Predicate<Integer> isOdd = number -> number % 2 != 0;

        List<Integer> evenNumber = numbers.stream().filter(isEven).collect(Collectors.toList());
        List<Integer> oddNumber = numbers.stream().filter(isOdd).collect(Collectors.toList());

        System.out.println("Even Numbers " + evenNumber);

        System.out.println("Odd Numbers " + oddNumber);
    }
}
