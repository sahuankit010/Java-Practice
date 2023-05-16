package CollectionPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.add(1);

        deq.add(2);

        deq.addFirst(3);

        deq.addLast(123);

        System.out.println(deq);
    }
}
