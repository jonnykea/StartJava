package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorTest {
    static Scanner console = new Scanner(System.in);
    static String answer;

    public static void main(String[] args) {
        do {
            System.out.print("Введите математическое выражение, например 5 * 10 " +
                    "\nдоступные мат. действия: + - * / ^ %: ");
            String expression = console.nextLine();
            String[] arrayMath = expression.split(" ");
            int a = parseInt(arrayMath[0]);
            String sign = arrayMath[1];
            int b = parseInt(arrayMath[2]);
            Calculator calculator = new Calculator();
            calculator.calculate(a, b, sign);
        } while (isNext());
    }

    private static boolean isNext() {
        System.out.print("Хотите сыграть еще раз? Введите yes или no... ");
        answer = console.nextLine().toLowerCase();
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