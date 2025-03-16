package Thread;

// worst way to use thread
public class Thread1 extends Thread{

    public Thread1(String thread1) {
        super(thread1);
    }

    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("inside " + Thread.currentThread().getName() + " " + i );

        }
    }

}
