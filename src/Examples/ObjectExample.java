package Examples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ObjectExample {

    List<Long> al = new ArrayList<>(1000000000);
//    List<Long> al1 = new ArrayList<>(1000000000);
//    List<Long> al2 = new ArrayList<>(1000000000);
//    List<Long> al3 = new ArrayList<>(1000000000);
//    List<Long> al4 = new ArrayList<>(1000000000);
//    List<Long> al5 = new ArrayList<>(1000000000);
//    List<Long> al6 = new ArrayList<>(1000000000);
//    List<Long> al7 = new ArrayList<>(1000000000);
//    List<Long> al8 = new ArrayList<>(1000000000);
//    List<Long> al9 = new ArrayList<>(1000000000);
//    List<Long> al10 = new ArrayList<>(1000000000);
//    List<Long> al11 = new ArrayList<>(1000000000);



    ObjectExample(){
        System.out.println("New Object");

    }

    public static void main(String[] args) {
        Timer t = new Timer();
//        t.start();
        long i = 1;
        while(i > 0){
            new ObjectExample();

            i--;
        }
        t.end();
        System.out.println(t);

    }
}
