package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Scanner scanner = new Scanner(System.in);
    private int secretNumber;
    public static final int NUM_OF_GAMES = 3;
    private int numOfWinner;
    private final Player[] players;
    private final String[] nameOfWinners = new String[NUM_OF_GAMES];

    public GuessNumber(Player... players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void play() {
        System.out.println("\nПобедитель будет выявлен по результатам 3-х игр");
        initWinners();
        while (numOfWinner != NUM_OF_GAMES) {
            secretNumber = (int) (Math.random() * 100) + 1;
            decideByToss();
            initPlayers();
            System.out.println("Игра - " + (numOfWinner + 1) + "\nУ каждого игрока по 10 попыток, чтобы отгадать число ");
            while (true) {
                boolean gameOver = false;
                for (Player player : players) {
                    if (playTurn(player)) {
                        nameOfWinners[numOfWinner++] = player.getName();
                        gameOver = true;
                    }
                    System.out.println("переход хода");
                }
                if (gameOver){
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

    private boolean isNoAttemptLeft() {
        boolean result = true;
        for (Player player : players) {
            result = result && !player.isAttemptsLeft();
        }
        return result;
    }

    // Returns true if game is ended
    private boolean playTurn(Player player) {
        System.out.print("попытка - " + (player.getCountOfAttempts() + 1) + " у " + player.getName());
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
            System.out.println("У нас есть победитель!!!");
            System.out.println("Игрок - " + player.getName() + ", угадал число - " + secretNumber + " c, "
                    + player.getCountOfAttempts() + " попытки");
        }
        return isWinner;
    }

    private boolean compareNumber(int guess) {
        if (guess == secretNumber) {
            return true;
        }
        if (guess > 0 && guess < 100) {
            System.out.println("компьютер загадал число " + (secretNumber < guess ? "меньше " : "больше ") + guess);
        }
        return false;
    }

    private void decideByToss() {
        System.out.println("\nСейчас узнаем у кого будет первый ход?!");
        int index = 0;
        Player[] temp = new Player[players.length];
        int[] random = new int[players.length];
        while (index < players.length) {
            int randomIndex = (int) (Math.random() * 3);
            boolean unique = true;
            for (int j = 0; j < index; j++) {
                if (random[j] == randomIndex) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index] = players[randomIndex];
                random[index] = randomIndex;
                index++;
            }
        }
        System.arraycopy(temp, 0, players, 0, players.length);
    }

    private void initWinners() {
        if (numOfWinner == 0) {
            return;
        }
        Arrays.fill(nameOfWinners, 0, numOfWinner - 1, null);
        numOfWinner = 0;
    }

    private void initPlayers() {
        for (Player player : players) {
            player.init();
        }
    }

    private void resultOfGames() {
        String[] distinctWinners = new String[nameOfWinners.length];
        int[] numOfWins = new int[nameOfWinners.length];
        int numOfDistinct = 0;
        for (String name : nameOfWinners) {
            boolean foundAny = false;
            for (int i = 0; i < numOfDistinct; i++) {
                if (name.equals(distinctWinners[i])) {
                    numOfWins[i]++;
                    foundAny = true;
                    break;
                }
            }
            if (!foundAny) {
                numOfWins[numOfDistinct] = 1;
                distinctWinners[numOfDistinct++] = name;
            }
        }
        boolean haveAbsoluteWinner = false;
        for (int i = 0; i < numOfWins.length; i++) {
            if (numOfWins[i] == 2) {
                System.out.println("\nПо результату 3-х игр \nПобедитель - " + distinctWinners[i]);
                haveAbsoluteWinner = true;
            }
        }
        if (!haveAbsoluteWinner) {
            System.out.println("НИЧЬЯ");
            for (int i = 0; i < distinctWinners.length; i++) {
                System.out.println((i + 1) + " игра - " + "победа " + distinctWinners[i]);
            }
        }
    }
}








