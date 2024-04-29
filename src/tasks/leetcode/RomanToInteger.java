package tasks.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "III";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s));
        System.out.println(romanToIntTreeMapWithRecurcive(3));
        System.out.println(romanToIntMapSimply(3) + "\n");

        s = "LVIII";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s));
        System.out.println(romanToIntTreeMapWithRecurcive(58));
        System.out.println(romanToIntMapSimply(58) + "\n");

        s = "MCMXCIV";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
        System.out.println(romanToInt3(s));
        System.out.println(romanToIntTreeMapWithRecurcive(1994));
        System.out.println(romanToIntMapSimply(1994));
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


    public static String romanToIntTreeMapWithRecurcive(int num) {
        final TreeMap<Integer, String> INT_TO_ROMANS_PARTS = new TreeMap<>();
        INT_TO_ROMANS_PARTS.put(1, "I");
        INT_TO_ROMANS_PARTS.put(2, "II");
        INT_TO_ROMANS_PARTS.put(3, "III");
        INT_TO_ROMANS_PARTS.put(4, "IV");
        INT_TO_ROMANS_PARTS.put(5, "V");
        INT_TO_ROMANS_PARTS.put(6, "VI");
        INT_TO_ROMANS_PARTS.put(7, "VII");
        INT_TO_ROMANS_PARTS.put(8, "VIII");
        INT_TO_ROMANS_PARTS.put(10, "X");
        INT_TO_ROMANS_PARTS.put(50, "L");
        INT_TO_ROMANS_PARTS.put(90, "XC");
        INT_TO_ROMANS_PARTS.put(100, "C");
        INT_TO_ROMANS_PARTS.put(400, "CD");
        INT_TO_ROMANS_PARTS.put(500, "D");
        INT_TO_ROMANS_PARTS.put(900, "CM");
        INT_TO_ROMANS_PARTS.put(1000, "M");

        Map.Entry<Integer, String> entry = INT_TO_ROMANS_PARTS.floorEntry(num);
        if (entry.getKey().equals(num)) {
            return entry.getValue();
        }

        return entry.getValue() + romanToIntTreeMapWithRecurcive(num - entry.getKey());
    }

    public static String romanToIntMapSimply(int num) {
        final Map<Integer, String> INT_TO_ROMANS_PARTS = new HashMap<>();

            INT_TO_ROMANS_PARTS.put(0, "");
            INT_TO_ROMANS_PARTS.put(1, "I");
            INT_TO_ROMANS_PARTS.put(2, "II");
            INT_TO_ROMANS_PARTS.put(3, "III");
            INT_TO_ROMANS_PARTS.put(4, "IV");
            INT_TO_ROMANS_PARTS.put(5, "V");
            INT_TO_ROMANS_PARTS.put(6, "VI");
            INT_TO_ROMANS_PARTS.put(7, "VII");
            INT_TO_ROMANS_PARTS.put(8, "VIII");
            INT_TO_ROMANS_PARTS.put(10, "X");
            INT_TO_ROMANS_PARTS.put(50, "L");
            INT_TO_ROMANS_PARTS.put(60, "LX");
            INT_TO_ROMANS_PARTS.put(70, "LXX");
            INT_TO_ROMANS_PARTS.put(80, "LXXX");
            INT_TO_ROMANS_PARTS.put(90, "XC");
            INT_TO_ROMANS_PARTS.put(100, "C");
            INT_TO_ROMANS_PARTS.put(400, "CD");
            INT_TO_ROMANS_PARTS.put(500, "D");
            INT_TO_ROMANS_PARTS.put(600, "DC");
            INT_TO_ROMANS_PARTS.put(700, "DCC");
            INT_TO_ROMANS_PARTS.put(800, "DCCC");
            INT_TO_ROMANS_PARTS.put(900, "CM");
            INT_TO_ROMANS_PARTS.put(1000, "M");
            INT_TO_ROMANS_PARTS.put(2000, "MM");
            INT_TO_ROMANS_PARTS.put(3000, "MMM");


        int i = num % 10;
        int x = num % 100 - i;
        int c = num % 1000 - (x + i);
        int m = num % 10000 - (c + x + i);

        return INT_TO_ROMANS_PARTS.get(m) +
                INT_TO_ROMANS_PARTS.get(c) +
                INT_TO_ROMANS_PARTS.get(x) +
                INT_TO_ROMANS_PARTS.get(i);
    }
}