package Lesson_1.IfElse.IfElse;
//Поиск одинаковых цифр в числах
//создайте две переменные, присвоив им два трехзначных целых числа
//найдите в них одинаковые цифры, стоящие в одном и том же разряде
//отобразите результат в формате:
//в числах N и M одинаковые цифры A, B, C стоят в X, Y, Z разрядах
public class IfElseStatementTheme4 {
    public static void main(String[] args) {
        String N = "111";
        char A = N.charAt(0);
        char B = N.charAt(1);
        char C = N.charAt(2);

        String M = "111";
        char X = M.charAt(0);
        char Y = M.charAt(1);
        char Z = M.charAt(2);
        System.out.println("Число N " + N + "\n" + "Число M " + M);
        if (A == X) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z в  первом разряде - " + A + " и " + X);
        }
        if (B == Y) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z во втором разряде - " + B + " и " + Y);
        }
        if (C == Z) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z в третьем разряде - " + C + " и " + Z);
        }
    }
}
