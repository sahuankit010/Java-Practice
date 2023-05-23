/**
 * @author Ankit Sahu
 */

package CollectionPractice;
import muUtils.Timer;

import java.util.ArrayDeque;
import java.util.Queue;
public class Queue1 {

    public static void main(String[] args) {

        // Initialize the timer
        Timer timer = new Timer();
        Queue<Long> queue = new ArrayDeque<>();

        Queue2.addElementQueue(timer, queue);
    }
}
