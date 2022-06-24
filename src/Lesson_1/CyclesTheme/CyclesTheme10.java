package Lesson_1.CyclesTheme;
//10.	Вывод таблицы умножения Пифагора
//        ○	отобразите таблицу умножения в точности, как в образце, включая горизонтальные и вертикальные линии
//        ○	не добавляйте между строками и столбцами лишние пустоты
//        ○	используйте цикл for

import java.sql.SQLOutput;

public class CyclesTheme10 {
    public static void main(String[] args) {
        int startInclusive = 1;
        int stopExclusive = 9;
        int step = 1;


        int counter = 9;
        String Pifagor = "               ТАБЛИЦА ПИФАГОРА";
        System.out.printf("%s", Pifagor+"\n");
        for (int i = startInclusive; i <= stopExclusive; i += step) {
            for (int j = 1; j <= stopExclusive; j += step) {
                System.out.printf("%5d", (i * j));
            }
            counter--;
            System.out.println("\n");
        }
    }
}
