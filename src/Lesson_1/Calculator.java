package Lesson_1;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char operation = '%';

        switch (operation) {
            case '+':
                System.out.printf("addition between (%2d and %2d = %2d) sign + %n", a, b, a + b);
                break;
            case '-':
                System.out.printf("subtraction between (%2d and %2d = %2d) sign - %n", a, b, a - b);
                break;
            case '*':
                System.out.printf("multiplication between (%2d and %2d = %2d) sign * %n", a, b, a * b);
                break;
            case '/':
                System.out.printf("division between (%2d and %2d = %2d) sign  / %n", a, b, a / b);
                break;
            case '^':
                int result = 1;
                //a to the b power
                for (int j = 1; j <= b; j++) {
                    result = result * a;
                }
                System.out.printf("raised a to the power b (%2d in %2d = %2d) sign ^ %n", a, b, result);
                break;
            case '%':
                System.out.printf("remainder of division between (%2d from %2d) = %2d sign %%%n ", b, a, a % b);
                break;
        }
    }
}

