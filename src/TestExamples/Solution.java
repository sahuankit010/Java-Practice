package TestExamples;

public class Solution {
    static boolean canReach(int[] arr, int start) {

        int n = arr.length;

        return rec(start, n, arr);
    }

    static boolean rec(int i, int n, int[] arr){

        if(i>=0 && i<n){
            if(arr[i] == 0) return true;
            else return rec(i-arr[i], n, arr) || rec(i+arr[i], n, arr);
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {4,2,3,0,3,1,2};
//        int[] arr = {4,2,3,0,3,1,2};
        int[] arr = {3,0,2,1,2};
        int start = 2;

        System.out.println(canReach(arr, start));
    }
}
