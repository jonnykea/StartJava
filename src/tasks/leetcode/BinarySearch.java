package tasks.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class BinarySearch {
    public static final String UUID_1 = "uuid1";
    final Integer digit = 555;
    Integer num = digit;
    public static void main(String[] args) {


        Set<String> stringSet = new TreeSet<>();

        // Добавляем несколько элементов в set
        stringSet.add("Jan");
        stringSet.add("Feb");
        stringSet.add("March");
        stringSet.add("April");
        System.out.println(stringSet);
        stringSet.remove("April");
        System.out.println(stringSet);

        if (stringSet.contains("March")) {
            System.out.println("The set contains the element 'March'");
        }

        int highRange = 100;
        int lowRange = 1;
        int choicePlayer = lowRange + (highRange - lowRange) / 2;
        int choiceComputer = (int) (Math.random() * 100) + 1;
        while (choiceComputer != choicePlayer) {
            choicePlayer = lowRange + (highRange - lowRange) / 2;
            if (choicePlayer < choiceComputer) {
                System.out.printf("компьютер загадал число больше %d\n", choicePlayer);
                lowRange = choicePlayer + 1;
            } else {
                System.out.printf("компьютер загадал число меньше %d\n", choicePlayer);
                highRange = choicePlayer - 1;
            }
        }
        System.out.printf("вы угадали число, которое загадал компьютер и ЭТО - %d%n", choiceComputer);
    }
}