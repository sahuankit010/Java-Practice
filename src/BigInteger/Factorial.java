package BigInteger;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) throws Exception{
        int N = 20;

        System.out.println(factorial(N));
    }

    private static BigInteger factorial(int n) {

        BigInteger f = BigInteger.valueOf(1);

        for(int i=1; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
