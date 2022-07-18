package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
        }
        while (isNext());
    }

    private static boolean isNext() {

        System.out.print("Хотите сыграть еще раз? Введите yes или no... ");
        while (true) {
            String answer = scanner.next().toLowerCase();
            if (answer.equals("yes")) {
                return true;
            } if (answer.equals("no")) {
                return false;
            } else {
                System.out.println("ввели некорректное слово");
            }
        }
    }
}




