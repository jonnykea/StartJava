package tasks;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "'one', 'two', 'three,four,five', '5'";
        // Removing leading and trailing single quotes
        // input = input.replaceAll("(^')|('$)", "");

        // Splitting based on ', ' that are outside of single quotes
        String[] elements = input.split(", (?=([^\']*\'[^\']*\')*[^\']*\'{0,1}$)");

        // Outputting the results
        for (String element : elements) {
            System.out.println(element);
        }

        // �������� ������
        String input1 = "��� ������ ������, ������� ������ ���� �������" +
                "\n ������ ������";

        // �����������
        String[] separators = {" ", "\n", ","};

        // ��������� ������
        String[] parts = input1.split(String.valueOf(Pattern.compile("[" + String.join("", separators) + "]")));
        //String[] parts = String[] parts = input1.split("(?=\s+|\\n| , +)");

        // ������� ���������
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
