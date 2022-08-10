package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {
    public static int calculate(String expression) {
        String[] partsExpression = expression.split("");
        int a;
        int b;
        try {
            a = parseInt(partsExpression[0]);
            b = parseInt(partsExpression[2]);
        } catch (Exception e){
            throw new IllegalArgumentException("Ошибка - число не может быть <= 0, числа должны быть > 0 ");
        }
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Ошибка - число не может быть <= 0, числа должны быть > 0 ");
        }
        char sign = partsExpression[1].charAt(0);
        int result = switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Ошибка - ввели некорректный математический символ " +
                        "доступные доступные мат. действия: + - * / ^ %");
        };
        return result;
    }
}



