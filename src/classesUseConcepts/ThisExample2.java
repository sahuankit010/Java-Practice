package classesUseConcepts;

public class ThisExample2 {

    int a;
    int b;

    //Default constructor
    ThisExample2() {
        a = 10;
        b = 20;
    }

    //Method that returns current class instance
    ThisExample2 get() {
        return this;
    }

    //Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        ThisExample2 object = new ThisExample2();
        System.out.println(object.get().hashCode());
//        System.out.println(object.get().toString());
        object.get().display();
    }

}
