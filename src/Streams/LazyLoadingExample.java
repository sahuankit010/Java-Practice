package Streams;

import java.util.stream.Stream;

public class LazyLoadingExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() > 3;
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                });

        System.out.println("Stream created, no operations executed yet");

        // Terminal operation triggers processing
        stream.forEach(s -> System.out.println("forEach: " + s));


    }
}