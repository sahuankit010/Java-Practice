package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()<=o2.length()? 1 : -1;
            }
        };
        List<String> li = new ArrayList<>();
        li.add("Ankit");
        li.add("UTD");
        li.add("Swagata");


        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);

        Collections.sort(li, com);

        System.out.println(li);
    }
}
