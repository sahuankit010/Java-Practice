package TestExamples;

class Test {
    int i;
}

public class E1 {
    static String  manipulateString(String s){
        String ans  = "";

        int n = s.length();

        char ch[] = s.toCharArray();

        for(int i=0; i<n; i+=2){
            int first = ch[i];
            int second =  ch[i+1]-'0';
//            System.out.println((int)first);
//            System.out.println((int)second - '0');
            int a = first + second;
            System.out.println(a);
            if(a>122){
                a%=122;
                ans += ((char) (97+a-1));
            } else{
                ans += (char)a;
            }

            System.out.println(a);



        }
//        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {

//        String ans = "";
//
//        for (char c = 'a'; c <= 'z'; c++) {
//            ans += c;
//        }

        System.out.println(manipulateString("k0a4"));

//        int x = 2;
//        int y = 0;
//        for ( ; y < 10; ++y)
//        {
//            if (y % x == 0)
//                continue;
//            else if (y == 8)
//                break;
//            else
//                System.out.print(y + " ");
//        }
    }
}
