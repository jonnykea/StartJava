package com.startjava.lesson_2_3_4.array;

import java.util.List;

public class ExperimentList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(56);
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 10);
            list.add(number);
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
        list.set(4, 5);
        System.out.println("");
        for (int num : list) {
            System.out.print(+ num + " ");
        }
    }
}
