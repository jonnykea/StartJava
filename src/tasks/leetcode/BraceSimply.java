package tasks.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BraceSimply {
    public static void main(String[] args) {

        System.out.println("task - certain the right sequence brackets");
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid(""));
        System.out.println(isValid("([{)])"));
        System.out.println(isValid(")"));
    }

    static public Boolean isValid(String source) {
        Map<Character, Character> mapWithBrackets = new HashMap<>();
        mapWithBrackets.put('(', ')');
        mapWithBrackets.put('[', ']');
        mapWithBrackets.put('{', '}');

        if (source == null || source.isBlank()) {
            return true;
        }

        Deque<Character> stack = new LinkedList<>();
        for (char bracket : source.toCharArray()) {
            if (mapWithBrackets.containsKey(bracket)) {
                stack.push(bracket);
            } else if (mapWithBrackets.containsValue(bracket)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character c = stack.pop();
                if (mapWithBrackets.get(c) != bracket) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static Character getClosedBracket(Map<Character, Character> brackets, char openBracket) {
        return brackets.get(openBracket);
    }

    private static boolean isCloseBracket(Map<Character, Character> brackets, char sym) {
        return brackets.containsValue(sym);
    }

    private static boolean isOpenBracket(Map<Character, Character> brackets, char sym) {
        return brackets.containsKey(sym);
    }
}