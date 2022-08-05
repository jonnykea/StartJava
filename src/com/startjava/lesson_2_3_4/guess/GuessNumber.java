package com.startjava.lesson_2_3_4.guess;

import com.startjava.lesson_2_3_4.person.Player;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final Scanner scanner = new Scanner(System.in);
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        secretNumber = (int) (Math.random() * 100) + 1;
        while (true) {
            if (playTurn(player1)) {
                break;
            }
            System.out.println("переход хода");
            if (playTurn(player2)) {
                break;
            }
            if (isNoAttemptLeft()) {
                System.out.println("Игра окончена ((( попыток больше нет");
                break;
            }
            System.out.println("переход хода");
        }
    }

    private boolean isNoAttemptLeft() {
        return !player1.isAttemptsLeft() && !player2.isAttemptsLeft();
    }

    // Returns true if game is ended
    private boolean playTurn(Player player) {
        System.out.print("попытка - " + (player.getCountOfAttempts() + 1) + " у " + player);
        if (isGuessed(player)) {
            player1.printAttempts();
            player2.printAttempts();
            return true;
        }
        if (!player.isAttemptsLeft()) {
            System.out.println("У " + player + " закончились попытки");
        }
        return false;
    }

    private boolean isGuessed(Player player) {
        System.out.print("\n" + player + " - угадайте значение, которое загадал компьютер от 1 до 100 -?  ");
        player.setGuess(scanner.nextInt());
        boolean isWinner = compareNumber(player.getGuess());
        if (isWinner) {
            System.out.println("У нас есть победитель!!!");
            System.out.println("Игрок - " + player + " угадал число - " + secretNumber + " c "
                    + player.getCountOfAttempts() + " попытки");
        }
        return isWinner;
    }

    private boolean compareNumber(int guess) {
        if (guess == secretNumber) {
            return true;
        }
        if (secretNumber > guess) {
            System.out.println("компьютер загадал число больше " + guess);
        } else {
            System.out.println("компьютер загадал число меньше " + guess);
        }
        return false;
    }
}





