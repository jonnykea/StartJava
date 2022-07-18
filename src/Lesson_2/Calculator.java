package Lesson_2;

import java.util.Scanner;

public class Calculator {
 char sign;
 int a, b, result;
    public void action(int a, int b, char sign) {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = 1;
                for (int j = 1; j <= b; j++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}




