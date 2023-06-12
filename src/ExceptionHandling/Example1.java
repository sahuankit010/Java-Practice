package ExceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        try{
            int x = 10/0;
        } catch (ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
