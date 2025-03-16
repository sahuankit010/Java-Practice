package TestExamples;

public class StringReverse {

    static String recur(String str) {

        if (str.length() <= 1) return str;

        return recur(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {

        int i = 0;

        if (System.out.printf("Yo! ") == null) {

        }
        for (i = 1; i < 2; System.out.println("Hello World.")) {
            i++;
        }

        String s1 = new String("Ankit");
        String s2 = new String("Ankit");

        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.gc();
    }
}
