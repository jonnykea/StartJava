package tasks;

import java.util.HashMap;
import java.util.Map;

public class MaxCheck {
    public static void main(String[] args) {

        System.out.println(returnNonRepeatingIndexWithArray("leetcode"));
        System.out.println(returnNonRepeatingIndexWithArray("loveleetcode"));
        System.out.println(returnNonRepeatingIndexWithArray("aabb"));
        System.out.println(returnNonRepeatingIndexWithArray("a"));

        System.out.println(returnNonRepeatingIndexWithMap("leetcode"));
        System.out.println(returnNonRepeatingIndexWithMap("loveleetcode"));
        System.out.println(returnNonRepeatingIndexWithMap("aabb"));
        System.out.println(returnNonRepeatingIndexWithMap("a"));
    }

    public static int returnNonRepeatingIndexWithArray(String s) {
        boolean isUnicue = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(j) == s.charAt(i)) {
                    isUnicue = false;
                    break;
                } else {
                    isUnicue = true;
                }
            }
            if (isUnicue) {
                return i;
            }
        }
        return -1;
    }

    public static int returnNonRepeatingIndexWithMap(String s) {
        if (s.length() == 1) {
            return -1;
        }
        Map<Character, Integer> charts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charts.containsKey(s.charAt(i))) {
                charts.computeIfPresent(s.charAt(i), (key, value) -> value + 1);
            }
            charts.putIfAbsent(s.charAt(i), 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charts.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}