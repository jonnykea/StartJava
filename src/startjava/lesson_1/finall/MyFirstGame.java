package startjava.lesson_1.finall;

public class MyFirstGame {
    public static void main(String[] args) {
        int highRange = 100;
        int lowRange = 1;
        int choicePlayer = highRange / 2;
        int choiceComputer = (int) (Math.random() * 100) + 1;
        while (choiceComputer != choicePlayer) {
            if (choicePlayer < choiceComputer) {
                System.out.println("компьютер загадал число больше " + choicePlayer);
                lowRange = choicePlayer + 1;
            } else {
                System.out.println("компьютер загадал число меньше " + choicePlayer);
                highRange = choicePlayer - 1;
            }
            choicePlayer = lowRange + (highRange - lowRange) / 2;
        }
        System.out.println("вы угадали число, которое загадал компьютер и ЭТО - " + choiceComputer);
    }
}
