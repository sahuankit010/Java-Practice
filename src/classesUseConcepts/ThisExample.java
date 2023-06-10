package classesUseConcepts;

public class ThisExample {
    private int a;
    private int b;

    //Default constructor
    ThisExample() {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }

    //Parameterized constructor
    ThisExample(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public void display(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample();
        obj.display();
    }
}
