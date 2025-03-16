package ExceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        try{
            int x = 10/0;
        } catch (ArithmeticException e){
            System.out.println("sdfdsf");
            System.out.println("error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Hello");
//            System.out.println("Exception Occured: " );//+ e.getStackTrace());
        } finally {
            System.out.println("finally");
        }

        System.out.println("All done.");
    }
}
