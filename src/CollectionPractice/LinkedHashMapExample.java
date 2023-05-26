package CollectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    static void hashmap(){
        Map<Character,Integer> map = new HashMap<>();

        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);

//        System.out.println(map);

        for(Map.Entry<Character, Integer> mapElement: map.entrySet()){
            System.out.println(mapElement);
        }
    }


    public static void main(String[] args) {
        Map<Character, Integer> lhm = new LinkedHashMap<>();

        lhm.put('a', 1);
        lhm.put('b', 2);
        lhm.put('c', 3);

//        System.out.println(lhm);

        for(Map.Entry<Character, Integer> mapElement: lhm.entrySet()){
            System.out.println(mapElement);
        }

        hashmap();


    }
}
