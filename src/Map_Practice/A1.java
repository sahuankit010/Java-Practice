package Map_Practice;

import java.util.HashMap;
import java.util.Map;

public class A1 {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Ankit", 1);

        hashMap.put("Sahu", 2);

        for(Map.Entry<String, Integer> e: hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        if(hashMap.containsKey("Ankit"))
            System.out.println("present");

        if(!hashMap.containsKey("Sahu"))
            System.out.println("null");
    }
}
