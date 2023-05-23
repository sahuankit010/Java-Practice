
/**
 * @author Ankit Sahu
 */

package CollectionPractice;

import muUtils.Timer;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

    public static void main(String[] args) {

        Timer timer = new Timer();
        Queue<Long> queue = new LinkedList<>();

        addElementQueue(timer, queue);
    }

    public static void addElementQueue(Timer timer, Queue<Long> queue) {
        for(long i=0; i<10000000; i++){
            queue.add(i);
        }

        System.out.println(queue.peek());

        System.out.println(queue);

        while(queue.size() > 0){
            System.out.println(queue.poll());
        }
        timer.end();

        System.out.println(timer);
    }
}
