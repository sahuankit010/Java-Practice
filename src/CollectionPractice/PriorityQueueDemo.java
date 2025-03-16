package CollectionPractice;

/*package whatever //do not write package name here */

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);
    }
}

