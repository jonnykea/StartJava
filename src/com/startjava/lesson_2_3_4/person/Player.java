package com.startjava.lesson_2_3_4.person;

import java.util.Arrays;

public class Player {
    public static final int MAX_NUM_OF_ATTEMPTS = 10;
    private final String name;
    private int countOfAttempts = 0;
    private final int[] attempts = new int[MAX_NUM_OF_ATTEMPTS];

    @Override
    public String toString() {
        return name;
    }

    public int getCountOfAttempts() {
        return countOfAttempts;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getGuess() {
        return attempts[countOfAttempts - 1];
    }

    public void setGuess(int guess) {
        attempts[countOfAttempts++] = guess;
    }

    public void init() {
        if (countOfAttempts == 0) {
            return;
        }
        Arrays.fill(attempts, 0, getCountOfAttempts(), 0);
        countOfAttempts = 0;
    }

    public boolean isAttemptsLeft() {
        return countOfAttempts < MAX_NUM_OF_ATTEMPTS;
    }

    public void printAttempts() {
        int[] temp = Arrays.copyOf(attempts, countOfAttempts);
        System.out.print("Названные игроком " + name + " числа: ");
        for (int i = 0; i < countOfAttempts; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}



