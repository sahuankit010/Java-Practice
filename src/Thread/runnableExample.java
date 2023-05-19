package Thread;

public class runnableExample {
    public static void main(String[] args) {

        System.out.println("Main Thread is " + Thread.currentThread().getName());

        Thread t1 = new Thread(new runnableExample().new RunnableImp());
        t1.start();
    }
    class RunnableImp implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        }
    }
}
