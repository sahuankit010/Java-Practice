package Map_Practice;

import java.util.HashMap;
import java.util.Map;

public class A1 {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Ankit", 1);

        System.out.println(hashMap);

        hashMap.put("Ankit", 2);

        System.out.println(hashMap);

        if(hashMap.containsKey("Ankit"))
            System.out.println("present");

        if(!hashMap.containsKey("Sahu"))
            System.out.println("null");
    }
}
