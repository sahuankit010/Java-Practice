package CollectionPractice;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 54, 23));

        Iterator<Integer> it = al.iterator();

        Collections.reverse(al);

        // 23, 54, 2, 1
        while(it.hasNext()){
            int a = it.next();
//            it.remove();
            System.out.println(a);
        }

        System.out.println(al.isEmpty());

        ListIterator li = al.listIterator(al.size());

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
