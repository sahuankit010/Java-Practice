package Streams;

// Java Program Demonstrate
// stream in Java

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class Example1 {

    public static void main(String[] args) {

        // Creates a list using asList()
        List<Integer> l
                = Arrays.asList(
                5, 10, 20, 30, 8, 7);
        Predicate<Integer> greaterThan4 = number -> number > 4;
        // Taking the list as a source
        // Applying stream
        // filtering out the even numbers
        // filtering out the numbers > 10
        // Printing the list
        List<Integer> li = l.stream()
                .filter(greaterThan4)
                .collect(Collectors.toList());

        System.out.println(li);

        List<String> names = List.of("John", "Jane", "Jack", "Ankit", "Jithesh", "Aditya");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .filter(x -> x > 4)
                .sorted().toList();
        System.out.println(nameLengths);

        names.stream()
                .sorted()
                .forEach(x -> System.out.println(x));


        List<String> myList = Arrays.asList("a", "b", "c");
        Stream<String> myStream = myList.stream();

        myStream.forEach(System.out::println);
//        System.out.println(myStream.filter(s -> s.startsWith("a")).count());

        List<String> myList1 = Arrays.asList("a", "b", "c", "aa", "bb", "cc");
        List<String> result = myList1.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        String arr[] = {"abc", "cde", "acd",
                "aec", "xyz"};

        // filters the stream with integers
        // beginning with a and ending with c
        // Then sorts the stream
        Arrays.stream(arr)
                .filter(x -> x.startsWith("a") && x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("Stream without terminal operation");
        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        });

        System.out.println("Stream with terminal operation");
        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        }).sum();

        List<Integer> numbers = List.of(1,2,3,4,5,6); // Your list of numbers

        int sumOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer:: intValue)
                .sum();
        System.out.println(sumOfEvenNumbers);

        // Creates a list using asList()
        List<Integer> l2 = new ArrayList<>();

        for(int i=1; i<200; i++){
            l2.add(i);
        }

        List<Integer> l3 = l2.stream().filter(x -> x%5 == 0).map(x -> x*2).collect(Collectors.toList());

        System.out.println("l3\n" + l3);


    }
}
