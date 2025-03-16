package Thread;

public class ThreadTester {

    public static void main(String[] args) {
        System.out.println("Starting Main");
//
//        Thread thread1 = new Thread1("thread1");
//
////        thread1.setDaemon(true);
//
//        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");

        for(int i=0; i<5; i++){
            thread2.start();
        }



        System.out.println("Exiting  main");
    }
}
