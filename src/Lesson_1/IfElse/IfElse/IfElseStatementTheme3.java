package Lesson_1.IfElse.IfElse;
//Работа с числом
//        создайте переменную с любым числом
//        определите, являться ли оно:
//        нулем
//        четным (нечетным)
//        отрицательным (положительным)
//        если число равно 0, то остальные проверки не должны осуществляться
//        отобразите полученные результаты

public class IfElseStatementTheme3 {
    public static void main(String[] args) {
        int x = 15;

        if (x == 0) {
            System.out.println(x + " is null");
        } else {

            if (x > 0) {
                System.out.println(x + " is positive");
            } else {
                System.out.println(x + " is negative");
            }

            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
