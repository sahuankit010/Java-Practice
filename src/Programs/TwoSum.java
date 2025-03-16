package Programs;

import java.util.HashMap;

public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(target-nums[i])){

                return new int[] {hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i], i);
        }

        return new int[2];
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 19, 9, 5};

        int[] ans = twoSum(arr, 12);


        System.out.print(ans[0] + " " + ans[1]);

    }
}
