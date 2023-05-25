package tasks;

public class Check {
    public static void main(String[] args) {
        String s;
        String t;

        s = "axc";
        t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

        s = "abc";
        t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        boolean isSubsequence = true;
        boolean isFound;

        int nextElement = 0;
        for (int i = 0; i < s.length(); i++) {
            isFound = false;
            for (int j = nextElement; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    nextElement = j + 1;
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                isSubsequence = false;
            }
        }
        return isSubsequence;
    }
}