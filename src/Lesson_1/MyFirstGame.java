package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int highRange = 100;
        int lowRange = 1;
        int choicePlayer = highRange / 2;
        int choiceComputer = (int) (Math.random() * 100) + 1;
        while (choiceComputer != choicePlayer) {
            if (choicePlayer < choiceComputer) {
                System.out.printf("компьютер загадал число больше %d\n", choicePlayer);
                lowRange = choicePlayer + 1;
            } else {
                System.out.printf("компьютер загадал число меньше %d\n", choicePlayer);
                highRange = choicePlayer - 1;
            }
            choicePlayer = lowRange + (highRange - lowRange) / 2;
        }
        System.out.printf("вы угадали число, которое загадал компьютер и ЭТО - %d%n", choiceComputer);
    }
}
