package axs210226;

class Test {
    int x,y;
    Test(){
        x = 10;
        y= 20;
    }

    void print(){
        System.out.println("x = " + x + " y = " + y);
    }
}
public class CloneExample {

    public static void main(String[] args){
        Test t1 = new Test();

        t1.print();

        Test t2 = t1;

        t2.print();

        t2.x = 100;
        t2.y = 200;

        t1.print();
        t2.print();

        System.out.println(t1.getClass().equals(t2.getClass()));
    }
}
