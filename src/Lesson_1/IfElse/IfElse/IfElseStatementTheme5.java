package Lesson_1.IfElse.IfElse;

//Определение буквы, числа или символа по их коду
//создайте переменную типа char
//присвойте ей значение ‘\u0057’
//определите — это код буквы, числа или другого символа
//использовать для этого методы классов Java запрещено!
//выведите в консоль сам символ и информацию о нем:
//маленькая (большая) буква
//это число
//не буква и не число
public class IfElseStatementTheme5 {
    public static void main(String[] args) {
        char A = '\u0057';
        if (A >= 0 && A < 48 && A >= 58 && A < 65 && A >= 123 && A <= 127) {
            System.out.println(A + " переменная А является не буквой и не число");
        } else if (A >= 48 && A < 58) {
            System.out.println(A + " является числом");
        } else if (A >= 65 && A < 91) {
            System.out.println(A + " является заглавной буквой");
        } else if (A >= 61 && A < 123) {
            System.out.println(A + " является маленькой буквой");
        }
    }
}