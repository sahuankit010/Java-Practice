package TestExamples;

public class StringReverse {

    static String recur(String str){

        if(str.length() <= 1) return str;

        return recur(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        String str = new String("level");

        String ans = recur(str);
//        str.

        System.out.println(str.equals(ans));
    }
}
