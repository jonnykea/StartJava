package startjava.lesson_1.finall;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = 0;
        char sign = '%';
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


