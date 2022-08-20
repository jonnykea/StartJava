package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Scanner scanner = new Scanner(System.in);
    private int secretNumber;
    public static final int ROUNDS = 3;
    private final Player[] players;

    public GuessNumber(Player... players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void play() {
        System.out.println("\nПобедитель будет выявлен по результатам 3-х игр");
        init();
        castLots();
        for (int round = 0; round < ROUNDS; round++) {
            secretNumber = (int) (Math.random() * 100) + 1;
            clearAttempts();
            System.out.println("Игра - " + (round + 1) + "\nУ каждого игрока по 10 попыток, чтобы отгадать число ");
            boolean gameOver = false;
            while (true) {
                for (Player player : players) {
                    if (startGameplay(player)) {
                        player.setCountWins(player.getCountWins() + 1);
                        gameOver = true;
                        break;
                    }
                    System.out.println("переход хода");
                }
                if (gameOver) {
                    break;
                }
                if (isNoAttemptLeft()) {
                    System.out.println("Игра окончена ((( попыток больше нет");
                    break;
                }
            }
        }
        resultOfGames();
    }

    private void init() {
        for (Player player : players) {
            player.init();
        }
    }

    private void castLots() {
        System.out.println("\nСейчас узнаем у кого будет первый ход?!");
        for (int i = 0; i < players.length; i++) {
            int randomIndex = (int) (Math.random() * players.length);
            if (i == randomIndex) {
                continue;
            }
            Player temp = players[i];
            players[i] = players[randomIndex];
            players[randomIndex] = temp;
        }
    }

    private void clearAttempts() {
        for (Player player : players) {
            player.clearAttempts();
        }
    }

    // Returns true if game is ended
    private boolean startGameplay(Player player) {
        System.out.print("попытка - " + (player.getCountAttempts() + 1) + " у " + player.getName());
        if (isGuessed(player)) {
            for (Player p : players) {
                System.out.println(p);
            }
            return true;
        }
        if (!player.isAttemptsLeft()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private boolean isGuessed(Player player) {
        System.out.print("\n" + player.getName() + " - угадайте значение, которое загадал компьютер от 1 до 100 -?  ");
        player.setGuess(scanner.nextInt());
        boolean isWinner = compareNumber(player.getGuess());
        if (isWinner) {
            System.out.println("\nУ нас есть победитель!!!");
            System.out.println("Игрок - " + player.getName() + ", угадал число - " + secretNumber + " c, "
                    + player.getCountAttempts() + " попытки");
        }
        return isWinner;
    }

    private boolean compareNumber(int guess) {
        if (guess == secretNumber) {
            return true;
        } else {
            System.out.println("компьютер загадал число " + (secretNumber < guess ? "меньше " : "больше ") + guess);
        }
        return false;
    }

    private boolean isNoAttemptLeft() {
        boolean result = true;
        for (Player player : players) {
            result = result && !player.isAttemptsLeft();
        }
        return result;
    }

    private void resultOfGames() {
        boolean haveAbsoluteWinner = false;
        for (Player p : players) {
            if (p.getCountWins() >= 2) {
                System.out.println("\nПо результату 3-х игр \nПОБЕДИТЕЛЬ - " + p.getName());
                haveAbsoluteWinner = true;
            }
        }
        if (!haveAbsoluteWinner) {
            System.out.println("\nНИЧЬЯ");
            for (Player p : players) {
                System.out.println("победа " + p.getName());
            }
        }
    }
}








