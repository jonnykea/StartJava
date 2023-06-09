package tasks.leetcode;

public class SmallestLetter {
    public static void main(String[] args) {
        // первый вариант
        String[] letters = {"c", "f", "j"};
        String target = "a";
        findSmallestLetter(letters, target);

        char[] chars = {'c', 'f', 'j'};
        char tar = 'a';
        System.out.println(nextGreatestLetter(chars, tar));

        // второй вариант
        target = "c";
        findSmallestLetter(letters, target);

        tar = 'c';
        System.out.println(nextGreatestLetter(chars, tar));

        // третий вариант
        target = "z";
        letters = new String[]{"x", "x", "y", "y"};
        findSmallestLetter(letters, target);

        chars = new char[]{'x', 'x', 'y', 'y'};
        tar = 'z';
        System.out.println(nextGreatestLetter(chars, tar));
    }

    private static void findSmallestLetter(String[] letters, String target) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 1; j < letters.length; j++) {
                char indexMinus = letters[j - 1].charAt(0);
                char index = letters[1].charAt(0);
                if (indexMinus > index) {
                    String temp = letters[j - 1];
                    letters[j] = letters[j - 1];
                    letters[j - 1] = temp;
                }
            }
        }
        boolean isExist = false;
        char element;
        char firstElement = letters[0].charAt(0);
        for (String letter : letters) {
            element = letter.charAt(0);
            if (element > target.charAt(0)) {
                isExist = true;
                System.out.println("The smallest character that is lexicographically greater than "
                        + target + " in letters is " + element);
                break;
            }
        }
        if (!isExist) {
            System.out.println("There are no characters in letters that is lexicographically greater than "
                    + target + " so we return letters[0] - " + firstElement);
        }
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                start = mid + 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }

    public char nextGreatestLetter2(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target >= letters[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return letters[left % letters.length];
    }

}