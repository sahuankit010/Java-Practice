package ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator1 {

    public static void main(String[] args){

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        String[] arr = {"Ankit", "Sahu", "California", "Google", "Software"};
        List<String> list = new ArrayList<>(List.of(arr));

        for(String str: list){
            System.out.print(str + " ");
        }
        System.out.println();
        Collections.sort(list, com);

        for(String str: list){
            System.out.print(str + " ");
        }
    }
}
