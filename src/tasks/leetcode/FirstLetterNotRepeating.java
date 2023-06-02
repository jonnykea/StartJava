package tasks.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterNotRepeating {
    public static void main(String[] args) {
        System.out.println("check with array O(n^2)");
        System.out.println(returnNonRepeatingIndexWithArray("leetcode"));
        System.out.println(returnNonRepeatingIndexWithArray("loveleetcode"));
        System.out.println(returnNonRepeatingIndexWithArray("aabb"));
        System.out.println(returnNonRepeatingIndexWithArray("a"));

        System.out.println("check with map O(N)");
        System.out.println(returnNonRepeatingIndexWithMap("leetcode"));
        System.out.println(returnNonRepeatingIndexWithMap("loveleetcode"));
        System.out.println(returnNonRepeatingIndexWithMap("aabb"));
        System.out.println(returnNonRepeatingIndexWithMap("a"));
    }

    public static int returnNonRepeatingIndexWithArray(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnicue = true;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(j) == s.charAt(i)) {
                    isUnicue = false;
                    break;
                }
            }
            if (isUnicue) {
                return i;
            }
        }
        return -1;
    }

    public static int returnNonRepeatingIndexWithMap(String s) {
        Map<Character, Integer> charts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charts.computeIfPresent(s.charAt(i), (key, value) -> value + 1);
            charts.putIfAbsent(s.charAt(i), 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charts.get(s.charAt(i)) == 1 || s.length() == 1) {
                return i;
            }
        }
        return -1;
    }
}