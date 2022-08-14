package com.startjava.lesson_2_3_4.array;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        System.out.println("Task 1 - Create new massive random with different elements and create length with console");
        Scanner lengthMassive = new Scanner(System.in);
        System.out.println("write length of massive: ");
        int length = lengthMassive.nextInt();
        int[] massive = new int[length];

        fillMassive(massive);
        print(massive);

        sortBubble(massive);
        print(massive);

        searchMax(massive);
        print(massive);
    }

    public static void fillMassive(int[] massive) {
        System.out.println("New massive is created random, length - " + massive.length);
        int i = 0;
        while (i < massive.length - 1) {
            int secretNumber = (int) (Math.random() * 200) - 50;
            massive[i] = secretNumber;
            boolean isEqual = true;
            for (int j = 0; j < i; j++) {
                if (Math.abs(massive[i]) == Math.abs(massive[j])) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                i++;
            }
        }
    }

    private static void sortBubble(int[] massive) {
        System.out.println("\nRealize the bubble sorting by module");
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int j = 1; j <= massive.length - 1; j++) {
                if (Math.abs(massive[j - 1]) > Math.abs(massive[j])) {
                    int tmp = massive[j - 1];
                    massive[j - 1] = massive[j];
                    massive[j] = tmp;
                    isSort = false;
                }
            }
        }
    }

    private static void print(int[] massive) {
        for (int num : massive) {
            System.out.print(num + " ");
        }
    }

    private static void searchMax(int[] massive) {
        int max = 0;
        int i = 0;
        while (i <= massive.length - 1) {
            if (max < Math.abs(massive[i])) {
                max = Math.abs(massive[i]);
            }
            i++;
        }
        System.out.println("\nMax value by module in massive - " + max);
    }
}





