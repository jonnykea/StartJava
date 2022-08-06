package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {
    public Integer calculate(String expression) {
        String[] arrayMath = expression.split(" ");
        int a = parseInt(arrayMath[0]);
        String sign = arrayMath[1];
        int b = parseInt(arrayMath[2]);
        Integer result = null;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                result = (int) Math.pow(a, b);
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("некорректное действие - " + sign + "  доступные мат. действия: + - * / ^ %");
        }
        return result;
    }
}




