package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_NUM_OF_ATTEMPTS = 10;
    private final String name;
    private int numOfWins;
    private int countOfAttempts;
    private final int[] attempts = new int[MAX_NUM_OF_ATTEMPTS];
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public int getCountOfAttempts() {
        return countOfAttempts;
    }

    public int getGuess() {
        return attempts[countOfAttempts - 1];
    }

    public void setGuess(int guess) {
        if (guess > 0 && guess <= 100) {
            attempts[countOfAttempts++] = guess;
        } else {
            System.out.println("Ошибка - значение не удовлетворяет условием игры \nВы потратили попытку");
            countOfAttempts++;
        }
    }

    public void init(){
        clearAttempts();
        numOfWins = 0;
    }

    public void clearAttempts() {
        if (countOfAttempts == 0) {
            return;
        }
        Arrays.fill(attempts, 0, countOfAttempts, 0);
        countOfAttempts = 0;
    }

    public boolean isAttemptsLeft() {
        return countOfAttempts < MAX_NUM_OF_ATTEMPTS;
    }

    @Override
    public String toString() {
        String attemptsPlayer = "";
        for (int i = 0; i < countOfAttempts; i++) {
            attemptsPlayer += attempts[i] + " ";
        }
        return name + " попытки: " + attemptsPlayer;
    }
}



