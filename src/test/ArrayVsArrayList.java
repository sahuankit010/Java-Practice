package test;

import java.util.ArrayList;
import java.util.List;




public class ArrayVsArrayList {

    static void callArrayList(){
        Timer t1 = new Timer();
        t1.start();
        List<Integer> l1 = new ArrayList<>();

        for(int i=0; i<1000000; i++)
            l1.add(i+1);
        t1.end();

        System.out.println("ArrayList\n" + t1);
    }

    static void callArray(){
        Timer t2 = new Timer();
        t2.start();

        int[] arr = new int[1000000];

        for(int i=0; i<1000000; i++)
            arr[i] = i+1;

        t2.end();

        System.out.println("Array\n"+ t2);
    }
    public static void main(String[] args) {
        callArrayList();
        callArray();
    }
}
