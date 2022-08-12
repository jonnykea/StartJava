package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("""
                    Введите математическое выражение, доступные мат. действия: + - * / ^ %
                    например: 5 * 10
                    """);
            String expression = console.nextLine();
            try {
                System.out.println(Calculator.calculate(expression));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (isNext());
    }

    private static boolean isNext() {
        System.out.println("\nХотите ввести мат. выражение еще раз? Введите yes или no... ");
        String answer = console.nextLine().toLowerCase();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                return true;
            }
            System.out.println("ввели некорректное слово. Введите yes или no...");
            answer = console.next().toLowerCase();
        }
        return false;
    }
}