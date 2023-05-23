package CollectionPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMax {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for(int i=1; i<=100; i++){
            pq.offer(i);
        }

        System.out.println(pq);

        while(!pq.isEmpty()){

            System.out.print(pq.poll() + " ");
        }
    }
}
