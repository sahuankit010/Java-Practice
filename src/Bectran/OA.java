package Bectran;

public class OA {

    public static void main(String[] args) {
        int x = 12;
        boolean b1 = true, b2 = false;

        if((x==4) && !b2){
            System.out.println("1");
        }

        System.out.println("2");

        if((b2 = true) && b1){
            System.out.println("3");
        }

        float f1 = 10.2f;
        float f2 = 10.20f;

        System.out.println(f1 + " " + f2);

        System.out.println(f1 == f2);
    }
}
