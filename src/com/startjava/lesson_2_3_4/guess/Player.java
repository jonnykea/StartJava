package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_NUM_ATTEMPTS = 10;
    private final String name;
    private int countWins;
    private int countAttempts;
    private final int[] attempts = new int[MAX_NUM_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountWins() {
        return countWins;
    }

    public void setCountWins(int countWins) {
        this.countWins = countWins;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getGuess() {
        return attempts[countAttempts - 1];
    }

    public void setGuess(int guess) {
        if (guess > 0 && guess <= 100) {
            attempts[countAttempts] = guess;
        } else {
            System.out.println("Ошибка - значение не удовлетворяет условием игры \nВы потратили попытку");
        }
        countAttempts++;
    }

    public void init() {
        clearAttempts();
        countWins = 0;
    }

    public void clearAttempts() {
        if (countAttempts == 0) {
            return;
        }
        Arrays.fill(attempts, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public boolean isAttemptsLeft() {
        return countAttempts < MAX_NUM_ATTEMPTS;
    }

    @Override
    public String toString() {
        String attemptsPlayer = "";
        for (int i = 0; i < countAttempts; i++) {
            attemptsPlayer += attempts[i] + " ";
        }
        return name + " попытки: " + attemptsPlayer;
    }
}



