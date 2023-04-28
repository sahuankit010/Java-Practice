package axs210226;

abstract class Example{
    int a, b;
    Example(){
        a = 5;
        b = 6;
    }

    abstract void printName();
}

class Implementation extends Example{
    void printName(){
        System.out.println("Abstract class Example");
        System.out.println("a = " + a + " b = " + b);
    }

}
public class AbstractExample1{

    public static void main(String[] args){
        Implementation obj = new Implementation();

        obj.printName();
    }
}
