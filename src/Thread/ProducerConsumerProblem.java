package Thread;

import java.util.LinkedList;

class SharedBuffer {
    private final int capacity;
    private final LinkedList<Integer> list = new LinkedList<>();

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }
        list.add(item);
        System.out.println("Produced: " + item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait();
        }
        int item = list.removeFirst();
        System.out.println("Consumed: " + item);
        notifyAll();
        return item;
    }
}

class Producer implements Runnable {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
//        System.out.println(this.buffer.hashCode());
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(100); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
//        System.out.println(this.buffer.hashCode());
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // Buffer size of 5

        Thread producerThread = new Thread(new Producer(buffer), "producer Thread");
        Thread consumerThread = new Thread(new Consumer(buffer), "consumer Thread");

        producerThread.start();
        consumerThread.start();
    }
}
