package IOPractice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        long ll = Long.parseLong(br.readLine());

        String str = br.readLine();

        double d = Double.parseDouble(br.readLine());

        float fl = Float.parseFloat(br.readLine());

        System.out.println(a + " " +ll + " " + str + " " + d + " " + fl);
    }
}
