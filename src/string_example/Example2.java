package string_example;

public class Example2 {

    public static void main(String[] args) {
        String str1 = new String ("GeeksforGeeks");
        String str2 = "GeeksforGeeks";
        String str3 = new String("GeeksforGeeks");
        String str4 = "GeeksforGeeks";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);
        System.out.println(str1.substring(2, 5));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

    }
}
