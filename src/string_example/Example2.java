package string_example;

public class Example2 {

    public static void main(String[] args) {
        String str1 = new String ("GeeksforGeeks");
        String str2 = "GeeksforGeeks";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str1.substring(2, 5));
    }
}
