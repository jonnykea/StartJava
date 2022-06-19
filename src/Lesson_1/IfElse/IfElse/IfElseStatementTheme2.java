package Lesson_1.IfElse.IfElse;
//Поиск max и min числа
//        создайте две переменные, присвоив им любые числа
//        найдите максимальное и минимальное число
//        выведите числа на консоль, указав какое из них max и min

public class IfElseStatementTheme2 {
    public static void main(String[] args) {
        int x = 45;
        int y = 55;

        if (x > y) {
            System.out.println("максимальное число " + x);
        } else {
            System.out.println("максимальное число " + y);
        }
        if (x < y) {
            System.out.println("минимальное число  " + x);
        }
    }
}
