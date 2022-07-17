package Lesson_2;

import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "";
        do {
            Scanner action = new Scanner(System.in);
            System.out.print("Введите значения для переменных: a ");
            int a = action.nextInt();

            System.out.print("Введите значения для переменных:  b ");
            int b = action.nextInt();

            System.out.print("Введите действие над переменными, доступные мат. действия: + - * / ^ %: ");
            char sign = action.next().charAt(0);
            Calculator mathAction = new Calculator();
            mathAction.action(a, b, sign);

            Scanner actionElse = new Scanner(System.in);
            System.out.print("Хотите продолжить или завершить вычисления? Введите yes или no... ");
            answer = actionElse.next();
        }
        while (answer.equals("yes"));
    }
}

