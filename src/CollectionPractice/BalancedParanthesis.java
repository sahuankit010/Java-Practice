package CollectionPractice;

import java.util.ArrayDeque;

public class BalancedParanthesis {

    static boolean check(String str){

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println(c);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(!stack.isEmpty()){
                if(c == ')' && stack.peek() == '('){
                    stack.poll();
                } else if(c == '}' && stack.peek() == '{')
                    stack.poll();
                else if(c == ']' && stack.peek() == '[')
                    stack.poll();
                else return false;
            } else return  false;
        }
        System.out.println("\n" + stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("(){}[]"));
    }
}
