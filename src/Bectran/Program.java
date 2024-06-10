package Bectran;

public class Program {
    int x = 12;

    public void method(int x){
        x += x;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Program t = new Program();

        t.method(5);

        System.out.println(t.x);
    }
}
