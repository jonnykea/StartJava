package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Начало игры! Представьтесь!\n");
        System.out.print("Введите имя первого игрока ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока ");
        Player player2 = new Player(scanner.next());
        System.out.print("Введите имя третьего игрока ");
        Player player3 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2, player3);
        do {
            game.play();
        } while (isNext());
    }

    private static boolean isNext() {
        System.out.print("\nХотите сыграть еще раз? Введите yes или no... ");
        String answer = scanner.next().toLowerCase();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                return true;
            }
            System.out.println("ввели некорректное слово. Введите yes или no...");
            answer = scanner.next().toLowerCase();
        }
        return false;
    }
}




