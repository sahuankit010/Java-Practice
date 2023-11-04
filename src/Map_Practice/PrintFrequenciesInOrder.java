package Map_Practice;

// Java implementation of the above approach
import java.util.*;

class PrintFrequenciesInOrder {

    static void printFrequencies(int arr[])
    {
        LinkedHashMap<Integer, Integer> m =
                new LinkedHashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i],0) + 1);
        }

        for(Map.Entry<Integer, Integer> x : m.entrySet())
        {
            System.out.println(x);
//            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(arr);
    }
}
