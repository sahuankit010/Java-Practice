/**
 * @author Ankit Sahu
 */

package CollectionPractice;
import muUtils.Timer;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Queue;
public class Queue1 {

    static void reverseK(Queue<Integer> q, int k)
    {
        if(q.size()<0 || k <0 )
            return;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<k; i++)
        {
            stack.offerLast(q.poll());
        }

        while(!stack.isEmpty())
            q.offer(stack.pollLast());

        for(int i=0; i<q.size()-k; i++)
            q.offer(q.poll());
    }

    public static void main(String[] args) {

        // Initialize the timer
//        Timer timer = new Timer();
//        Queue<Long> queue = new ArrayDeque<>();

//        Queue2.addElementQueue(timer, queue);

        Queue<Integer> q = new ArrayDeque<>();

        for (int i=1; i<=10; i++)
            q.offer(i);

        System.out.println(q);
        reverseK(q, 5);

        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
    }
}
