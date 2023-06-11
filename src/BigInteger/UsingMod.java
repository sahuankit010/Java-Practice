package BigInteger;

import java.math.BigInteger;

public class UsingMod {

    public static void main(String[] args) throws Exception {
        BigInteger A, B;
        A = new BigInteger("3123");
        B = new BigInteger("12");
        System.out.println(getMod(A, B));
        B = A;
        System.out.println(getMod(A, B));

        B = new BigInteger("-123");

        System.out.println(getMod(A, B));
    }

    private static BigInteger getMod(BigInteger a, BigInteger b) {

        return a.mod(b);
    }
}
