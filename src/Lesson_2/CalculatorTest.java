package Lesson_2;

import java.util.Scanner;


public class CalculatorTest {
    static Scanner console = new Scanner(System.in);
    static String answer;

    public static void main(String[] args) {
        do {
            System.out.print("Введите значения для переменных: a ");
            int a = console.nextInt();
            System.out.print("Введите действие над переменными, доступные мат. действия: + - * / ^ %: ");
            char sign = console.next().charAt(0);
            System.out.print("Введите значения для переменных:  b ");
            int b = console.nextInt();
            Calculator calculator = new Calculator();
            calculator.calculate(a, b, sign);
        } while (isNext());
    }

    private static boolean isNext() {
        System.out.print("Хотите сыграть еще раз? Введите yes или no... ");
        answer = console.next().toLowerCase();
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