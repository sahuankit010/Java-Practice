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
        System.out.println(e1.usingLiterals());
        System.out.println(e1.usingReferences());
//        Since string is immutable, we can not assign a new character at any index in str
//        str.charAt(1) = 'S';
    }
}
