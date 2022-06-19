package Lesson_1.CyclesTheme;
//Вывод реверсивного числа и суммы его цифр
//        дано число 1234
//        в цикле while выделите каждую его цифру
//        подсчитайте сумму полученных цифр
//        отобразите в консоли:
//        исходное число в обратном порядке
//        сумму его цифр

public class CyclesTheme3 {
    public static void main(String[] args) {

        int sum = 0;
        int a = 1234;
        int i;
        System.out.println("цифры в обратном порядке числа 1234");
        do {
            i = a % 10;
            sum += i;
            System.out.println(i);
            a /= 10;
        } while (a > 0);
        System.out.println("сумма чисел числа 1234 =  " + sum);
    }
}


