package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public void calculate(int a, int b, String sign) {
        int result;
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
                result = (int)Math.pow(a,b);
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("некорректное действие " + sign + ", доступные мат. действия: + - * / ^ %");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}




