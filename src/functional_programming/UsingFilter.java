package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingFilter {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Printing Even Numbers:");
        printEven(numbers);
        System.out.println("Printing Odd Numbers:");
        printOdd(numbers);

        List<String> courses = new ArrayList<>(Arrays.asList("Spring", "Spring Boot", "API", "AWS", "PCF", "Azure",
                "Docker", "Kubernetes"));

        System.out.println("Printing courses with Spring word:");
        courses.stream().filter(x -> x.contains("Spring")).forEach(System.out::println);

        System.out.println("Printing courses with more than 4 letters:");
        courses.stream().filter(x -> x.length() >= 4).forEach(System.out::println);

        printSquares(numbers);
        printCubesOddNumbers(numbers);

        courses.stream().map(x -> x + " " + x.length()).forEach(System.out::println);
    }

    private static void printCubesOddNumbers(List<Integer> numbers) {

        numbers.stream().filter(x -> x%2 != 0).map(x -> x*x*x).forEach(System.out::println);
    }

    private static void printSquares(List<Integer> numbers) {

        numbers.stream().map(x -> x*x).forEach(System.out::println);
    }

    private static void printOdd(List<Integer> list) {
        list.stream().filter(x -> x%2 != 0).forEach(System.out::println);
    }

    private static void printEven(List<Integer> list) {
        list.stream().filter(x -> x%2 == 0).forEach(System.out::println);
    }
}
