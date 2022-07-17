package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока ");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.play();
        }
        while (isContinuePlaying());
    }

    public static boolean isContinuePlaying() {
        Scanner playAgain = new Scanner(System.in);
        System.out.print("Хотите сыграть еще раз? Введите yes или no... ");
        while (true) {
            String answer = playAgain.next().toLowerCase();
            if (answer.equals("yes")) {
                return true;
            } else if (answer.equals("no")) {
                return false;
            } else {
                System.out.println("ввели некорректное слово");
            }
        }
    }
}




