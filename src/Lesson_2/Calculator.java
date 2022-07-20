package Lesson_2;

public class Calculator {
    public void calculate(int a, int b, char sign) {
        int result;
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
            default:
                System.out.println("некорректное действие " + sign + ", доступные мат. действия: + - * / ^ %");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}




