package Lesson_2;

import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значения для переменных: a ");
        int a = s.nextInt();
        System.out.print("Введите значения для переменных b ");
        int b = s.nextInt();
        System.out.print("Введите действие над переменными: ");
        char sign = s.next().charAt(0);
        Calculator mathAction = new Calculator();
        mathAction.action(a, b, sign);
    }
}
