package CollectionPractice;

import java.util.ArrayDeque;

public class StackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.add(1);
        stack.push(2);
        stack.add(3);

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.poll());

        System.out.println(stack);

        System.out.println(stack.isEmpty() + " "+ stack.size());
        stack.pop();

        System.out.println(stack.isEmpty() + " "+ stack.size());
    }
}
