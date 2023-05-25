package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a;
        int b;
        if (partsExpression.length != 3) {
            throw new NumberFormatException("Не корректный ввод");
        }
        try {
            a = Integer.parseInt(partsExpression[0]);
            b = Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка - не корректный ввод, в мат. выражение должны быть цифры ");
        }
        if (a <= 0 || b <= 0) {
            throw new NumberFormatException("Ошибка - число не может быть <= 0, числа должны быть > 0 ");
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



