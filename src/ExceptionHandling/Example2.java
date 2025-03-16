package ExceptionHandling;

public class Example2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error  : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally Executed");
        }
    }
}
