package Lesson_1.CyclesThemeAll;
//Подсчет суммы четных и нечетных чисел
//        подсчитайте с помощью do-while сумму четных и нечетных чисел в промежутке [-10, 21]
//        отобразите эти значения в формате:
//        в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y

public class CyclesTheme1 {
    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                X = X + i;
            } else {
                Y = Y + i;
            }
            i++;
        } while (i < 22);
        System.out.println("сумма четных чисел X = " + X);
        System.out.println("сумма нечетных чисел Y = " + Y);
    }
}

