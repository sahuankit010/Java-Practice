package oops;

public class finalExample {

    public final int A;

    finalExample(){
        this.A = 11;
    }

    finalExample(int a){
//        this();
        this.A = a;
    }

    void printA(){
        System.out.println(A);
    }

    public static void main(String[] args) {
        finalExample obj = new finalExample();
//        obj.A = 9;
        obj.printA();
    }
}
