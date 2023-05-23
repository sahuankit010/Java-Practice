package CollectionPractice;

import java.util.PriorityQueue;

public class PriorityQueueMin {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2);

        pq.offer(5);

        pq.add(100);

        pq.add(54);

        for(int i=200; i>=150; i--)
            pq.add(i);

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }


}
