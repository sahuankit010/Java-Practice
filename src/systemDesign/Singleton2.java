package systemDesign;

class Example{
    private static Example instance = null;

    public String s;
    private Example()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static Example getInstance(){
        if(instance == null){
            instance = new Example();
        }
        return instance;
    }
}

public class Singleton2 {

    public static void main(String[] args) {
        Example p = Example.getInstance();
        Example x = Example.getInstance();
        Example y = Example.getInstance();
        Example z = Example.getInstance();

        System.out.println("Hashcode of p is "
                + p.hashCode());
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        if(p == x && x == y && y == z) System.out.println("Same object");
    }
}
