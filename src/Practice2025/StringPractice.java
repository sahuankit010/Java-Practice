
package Practice2025;

public class StringPractice {

    int x;


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        String str = "Ankit";

        System.out.println("str == " + str);

        sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }




}
