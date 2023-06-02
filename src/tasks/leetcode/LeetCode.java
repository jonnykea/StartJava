package tasks.leetcode;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println("task 1 - display elements that have sum as target");
        int[] a = {2, 10, 11, 7};
        int target = 9;

        int[] result = twoSum(a, target);
        System.out.println(Arrays.toString(result));

        int[] result1 = twoSumWithMap(a, target);
        System.out.println(Arrays.toString(result1));

        System.out.println("task 2 - certain the right sequence brackets");
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("()[]{}"));
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
        for (int i = 0; ; ++i) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[]{m.get(y), i};
            }
            m.put(x, i);
        }
    }

    static public Boolean isValid(String source) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        if (source == null || source.isBlank()) {
            return true;
        }

        Deque<Character> stack = new LinkedList<>();
        for (char sym : source.toCharArray()) {
            if (brackets.containsKey(sym)) {
                stack.push(sym);
            } else if (brackets.containsValue(sym)) {
                Character c = stack.pop();
                if (brackets.get(sym) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

