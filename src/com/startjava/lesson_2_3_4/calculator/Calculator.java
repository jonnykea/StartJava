package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {

    public Integer calculate(String expression) {
        String[] partsExpression = expression.split("");
        int a = parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = parseInt(partsExpression[2]);
        switch (sign) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return a / b;
            }
            case '^' -> {
                return (int) Math.pow(a, b);
            }
            case '%' -> {
                return a % b;
            }
            default -> System.out.println("некорректное действие - " + sign + "  доступные мат. действия: + - * / ^ %");
        }
        return 0;
    }
}




