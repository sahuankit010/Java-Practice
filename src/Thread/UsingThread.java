package Thread;

public class UsingThread extends Thread{
    public void run() {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args) {
        UsingThread t = new UsingThread();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}
