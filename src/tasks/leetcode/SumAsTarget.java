package tasks.leetcode;

import java.util.*;

public class SumAsTarget {
    public static void main(String[] args) {
        System.out.println("task - display elements that have sum as target");
        int[] a = {2, 10, 11, 7};
        int[] b = {2, 10, 11, 8};
        int target = 9;

        int[] result = twoSum(a, target);
        System.out.println(Arrays.toString(result));

        int[] result11 = twoSum(b, target);
        System.out.println(Arrays.toString(result11));

        int[] result1 = twoSumWithMap(a, target);
        System.out.println(Arrays.toString(result1));
    }


    static public int[] twoSumWithMap(int[] nums, int target) {

        // set up hashmap: remaining to original. thread-unsafe but for here is ok
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // if key in hm, result found.
            // so that only one pass
            if (hm.containsKey(nums[i])) {
                int otherIndex = hm.get(nums[i]);

                return new int[]{Math.min(i, otherIndex), Math.max(i, otherIndex)};
            }
            // put new record into hashmap
            else {
                hm.put(target - nums[i], i);
            }
        }
        return null;
    }

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int y = target - nums[i];
            if (m.containsKey(y)) {
                return new int[]{m.get(y), i};
            }
            m.put(nums[i], i);
        }
        return null;
    }
}