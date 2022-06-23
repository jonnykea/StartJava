package Lesson_1.CyclesTheme;
//	      Отображение ASCII-символов
//        ○	отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
//        ○	выводите на консоль:
//        i.	символы, идущие до цифр и имеющие нечетные коды
//        ii.	маленькие английские буквы, имеющие четные коды
//        ○	данные каждого столбца должны быть выровнены по правому краю

public class CyclesTheme7 {
    public static void main(String[] args) {
for (char i =0; i <= 47; i++){
    if (i % 2 != 0) {
        System.out.printf("нечетный код");
        System.out.printf("%2c", i);
        System.out.print("\n");
    }
        }
        for (char i =97; i <= 122; i++){
            if (i % 2 == 0) {
                System.out.printf("четный   код");
                System.out.printf("%2c", i);
                System.out.print("\n");
            }
        }
    }
}
