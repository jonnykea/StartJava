package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("""
                    Введите математическое выражение, например 5*10\s
                    доступные мат. действия: + - * / ^ %:\s
                    """);
            String expression = console.next();
            try {
                System.out.println(Calculator.calculate(expression));
            } catch (Exception e){
                System.out.println("Ошибка - число не может быть <= 0, числа должны быть > 0 ");
            }
        } while (isNext());
    }

    private static boolean isNext(){
        System.out.println("\nХотите ввести мат. выражение еще раз? Введите yes или no... ");
        String answer = console.next().toLowerCase();
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