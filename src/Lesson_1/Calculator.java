package Lesson_1;
//Калькулятор
//        над целыми положительными числами программа должна уметь выполнять следующие вычисления: +, -, *, /, ^, %
//        ^ используется только для обозначения операции возведения в степень. Самостоятельно реализуйте эту функцию, используя цикл
//        % называется оператором деления по модулю — вычисляет остаток от деления, а не процент
//        программа за один свой запуск должна вычислять одну математическую операцию, а не все сразу
//        для этого выполняйте проверку математического знака, используя if-else
//        не используйте ввод с клавиатуры — значения выражения присвойте переменным прямо в коде
//        выведите в консоль результат вычисления в формате System.out.println(a + “ ” + sign + “ ” + b + “ = ” + result);

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
//                 a to the b power
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

