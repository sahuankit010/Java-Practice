package CollectionPractice;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorExample1 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            li.add(i);
        }

        Iterator<Integer> it = li.iterator();

        while(it.hasNext()){
            int i = it.next();

            System.out.println(i + " ");

            if(i%2 != 0) it.remove();
        }

        it = li.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
