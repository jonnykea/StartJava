package tasks.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "III";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s) + "\n");

        s = "LVIII";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s) + "\n");

        s = "MCMXCIV";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s));
    }

    static public int romanToInt(String source) {
        Map<Character, Integer> romanMapWithValue = new HashMap<>();
        romanMapWithValue.put('I', 1);
        romanMapWithValue.put('V', 5);
        romanMapWithValue.put('X', 10);
        romanMapWithValue.put('L', 50);
        romanMapWithValue.put('C', 100);
        romanMapWithValue.put('D', 500);
        romanMapWithValue.put('M', 1000);

        int result = 0;
        int previousValue = 0;
        for (int i = source.length() - 1; i >= 0; i--) {
            int currentValue = romanMapWithValue.get(source.charAt(i));
            if (previousValue > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }

    static public int romanToInt2(String s) {
        int result = 0, value = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
            }
            if (4 * value < result) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

    static public int romanToInt3(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> {
                    if (result >= 5) result -= 1;
                    else result += 1;
                }
                case 'V' -> {
                    if (result >= 10) result -= 5;
                    else result += 5;
                }
                case 'X' -> {
                    if (result >= 50) result -= 10;
                    else result += 10;
                }
                case 'L' -> {
                    if (result > 100) result -= 50;
                    else result += 50;
                }
                case 'C' -> {
                    if (result >= 500) result -= 100;
                    else result += 100;
                }
                case 'D' -> {
                    if (result >= 1000) result -= 500;
                    else result += 500;
                }
                case 'M' -> {
                    result += 1000;
                }
            }
        }
        return result;
    }
}