package com.startjava.lesson_2_3_4.array;

import java.util.List;

public class ExperimentList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(56);

        fillList(list);
        printArray(list);

        list.set(4, 5);
        System.out.println("");

        printArray(list);
    }
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 10);
            list.add(number);
        }
    }

    private static void printArray(List<Integer> list){
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
