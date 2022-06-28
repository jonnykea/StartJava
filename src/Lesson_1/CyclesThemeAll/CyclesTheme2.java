package Lesson_1.CyclesThemeAll;
//Вывод чисел в интервале между (max и min)
//        даны значения 10, 5, -1
//        найдите среди них max и min число
//        отобразите в консоль, с помощью for, все числа в интервале (max, min)

public class CyclesTheme2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int a = 10;
        int b = 5;
        int c = -1;

        if (a > b && a > c) {
            max = a;
        }
        if (a < b && a < c) {
            min = a;

        }
        if (b > a && b > c) {
            max = b;
        }
        if (b < a && b < c) {
            min = b;

        }
        if (c > b && c > a) {
            max = c;
        }
        if (c < b && c < a) {
            min = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }
    }
}
