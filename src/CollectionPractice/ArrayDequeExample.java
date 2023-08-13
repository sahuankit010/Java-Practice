package CollectionPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();
        String str = "My name is Ankit";

        deq.add(str);
        System.out.println(deq);

        deq.addFirst("Chennai");
        deq.addFirst("Dallas");
        System.out.println(deq);

        System.out.println();
    }
}
