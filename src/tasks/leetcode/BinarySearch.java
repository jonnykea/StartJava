package tasks.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
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