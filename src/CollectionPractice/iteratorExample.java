package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorExample {

    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Mumbai");
        li.add("Delhi");

        Iterator<String> it = li.iterator();

        while(it.hasNext()){
//            System.out.println(it.next());
            String temp = it.next();
            it.remove();
            System.out.println(temp);
        }

//        it.next();
        System.out.println(li.isEmpty());
        System.out.println(li.add("Chennai"));
        it = li.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            String temp = it.next();

            System.out.println(temp);
        }
    }
}
