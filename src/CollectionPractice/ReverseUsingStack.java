package CollectionPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ReverseUsingStack {

    static void print(List<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    static void reverse(List<Integer> list){

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i<list.size(); i++){
            stack.push(list.get(i));
        }


        int i=0;

        while(!stack.isEmpty()){
            list.set(i, stack.poll());
            i++;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            list.add(i);
        }
        print(list);
        System.out.println();
        reverse(list);
        print(list);
    }
}
