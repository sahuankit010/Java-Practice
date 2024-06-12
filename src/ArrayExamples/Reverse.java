package ArrayExamples;

import static java.util.Collections.swap;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i: arr){
            System.out.print(i + " ");
        }

        System.out.println();
        int l = 0, r = arr.length-1;

        while(l<r){
            swap(arr, l, r);
            l++;
            r--;
        }

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
