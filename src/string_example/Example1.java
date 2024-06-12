package string_example;

public class Example1 {
    boolean usingLiterals(){
        String s1 = "abc";
        String s2 = "abc";

        // Note that this == compares whether
        // s1 and s2 refer to same object or not
        return (s1 == s2);
    }

    boolean usingReferences(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        return (s1 == s2);
    }

    public static void main(String[] args){
        String str = "Ankit";
        Example1 e1 = new Example1();

        System.out.println(str.charAt(0) == 'A');
        System.out.println("Using literals: " + e1.usingLiterals());
        System.out.println("Using references: " + e1.usingReferences());
//        Since string is immutable, we will not able assign a new character at any index in str
//        str.charAt(1) = 'S';

        String s1 = "ONE";
        s1 += "asc";
        s1.concat("TWO");
        s1.concat("THREE");

        System.out.println(s1);

        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";


    }
}
