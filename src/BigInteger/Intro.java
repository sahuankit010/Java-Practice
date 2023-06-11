/**
 * @author Ankit Sahu
 */

package BigInteger;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class Intro {

    public static void main(String[] args) {
        BigInteger A = new BigInteger("1");
        BigInteger B = BigInteger.valueOf(2);

        System.out.println(A);
        System.out.println(B);
        System.out.println(A.add(B));

        BigInteger C = A.add(B);
        BigInteger D = A.multiply(B);
        BigInteger E = (A.compareTo(B) > 0)? A.subtract(B) : B.subtract(A);
        BigInteger F = B;
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F.equals(B));
        String z = B.toString();

        System.out.println(z);
    }
}
