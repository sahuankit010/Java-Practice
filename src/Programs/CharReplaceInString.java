package Programs;

public class CharReplaceInString {

    public String replace(String str, char ch){

        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == ch){
                sb.setCharAt(i, '#');
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        CharReplaceInString charReplaceInString = new CharReplaceInString();
        System.out.println(charReplaceInString.replace("Andaman", 'a'));
    }
}
