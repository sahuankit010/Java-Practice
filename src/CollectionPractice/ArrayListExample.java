package CollectionPractice;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2, 54, 23);
        Collections.sort(al, Collections.reverseOrder());
//        al.remove(1);

        Iterator<Integer> it = al.iterator();

//        Collections.reverse(al);

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

        List<Integer> t = new ArrayList<>(100);

        t.add(4);
        t.add(2);
        t.add(7);

        System.out.println(t);

//        t.sort(Comparator.comparingInt(Integer::intValue));
        Collections.sort(t, (a, b) -> b - a);
        System.out.println(t);

    }
}
