package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(12);
        li.add(15);

//        System.out.println(li);

        for(Integer i: li){
            System.out.println(i);
        }

        li.add(1,23);

        Iterator<Integer> it = li.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
