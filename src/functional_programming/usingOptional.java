package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class usingOptional {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Cucumber"));

        Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
//        Optional<String> first = fruits.stream().filter(fruit -> fruit.startsWith("B")).findFirst();
        Optional<String> first = fruits.stream().filter(predicate).findFirst();

        System.out.println(first);
        System.out.println(first.isEmpty());
        System.out.println(first.isPresent());
        System.out.println(first.get());

        Optional<String> fruit = Optional.of("Grape");
        Optional<String> empty = Optional.empty();

        System.out.println(fruit);
        System.out.println(empty);
    }
}
