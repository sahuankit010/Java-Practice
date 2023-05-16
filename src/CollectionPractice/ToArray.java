package CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<10; i++){
            l.add(i);
        }

        Object[] obj = l.toArray();
        Integer[] arr = new Integer[l.size()];

        arr = l.toArray(arr);

        for (Object i: obj){
            System.out.println(i);
        }

        for(Integer x: arr){
            System.out.println(x);
        }
    }
}
