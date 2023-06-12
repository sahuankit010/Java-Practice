package ExceptionHandling;

import java.util.Scanner;

public class ThrowExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        try {
            catchNumber(n);
        } catch (ZeroNumberException e){
            System.out.println("Caught ZeroNumberException: " + e.getMessage());
        } catch (EvenNumberException e){
            System.out.println("Caught EvenNumberException: " + e.getMessage());
        } catch (OddNumberException e){
            System.out.println("Caught OddNumberException: " + e.getMessage());
        }
    }

    public static void catchNumber(int n) throws EvenNumberException, OddNumberException, ZeroNumberException {
        if(n==0) throw new ZeroNumberException("Number is zero");
        if(n % 2 == 0) throw new EvenNumberException("Number is even");
        else throw new OddNumberException("Number is odd");
    }
}

class ZeroNumberException extends Exception{
    public ZeroNumberException(String message){
        super(message);
    }
}

class EvenNumberException extends Exception{
    public EvenNumberException(String message){
        super(message);
    }
}

class OddNumberException extends Exception{
    public OddNumberException(String message){
        super(message);
    }
}