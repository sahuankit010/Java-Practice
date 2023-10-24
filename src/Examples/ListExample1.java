

package Examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {


    public static void main(String args[]) {

        List<String> words = List.of("Apple", "Bat", "Cat", "Orange");
        System.out.println(words);
        List<String> wordsAL = new ArrayList<>(words);
        System.out.println(wordsAL);
        for (int i = 0; i < wordsAL.size(); i++) {
            System.out.println(wordsAL.get(i));
            if (wordsAL.get(i).endsWith("at")) {
                System.out.println(wordsAL.get(i));
                wordsAL.remove(wordsAL.get(i));
            }
        }
        System.out.println(wordsAL);
        int a = 10;
        System.out.println(++a*++a);
    }

}
