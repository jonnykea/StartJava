package Lesson_1.CyclesTheme;
//9.	Определение, является ли число счастливым
//        ○	счастливым называется число, сумма первых трех цифр которого равна сумме последних
//        ○	возьмите любое шестизначное число
//        ○	подсчитайте сумму каждой тройки его цифр
//        ○	отобразите в консоли:
//        i.	каждую тройку цифр в формате “Сумма цифр abc = sum”
//        ii.	является число счастливым или нет

public class CyclesTheme9 {
    public static void main(String[] args) {
        String word = "125512";
        int length = word.length();
        int i = 0;
        int sumFirstNumber = 0;
        int sumLastNumber = 0;
        while (i <= (length / 2)) {
            sumFirstNumber += word.charAt(i);
            sumLastNumber += word.charAt(length - i - 1);
            i++;
        }
        if (sumFirstNumber == sumLastNumber) {
            System.out.printf("первая тройка цифр - %s %s %s ", word.charAt(0),word.charAt(1),word.charAt(2));
            System.out.print("\n");
            System.out.printf("вторая тройка цифр - %s %s %s ", word.charAt(5),word.charAt(4),word.charAt(3));
            System.out.print("\n");
            System.out.printf("число %s является счастливым", word);
        } else {
            System.out.printf("первая тройка цифр - %s %s %s ", word.charAt(0),word.charAt(1),word.charAt(2));
            System.out.print("\n");
            System.out.printf("вторая тройка цифр - %s %s %s ", word.charAt(5),word.charAt(4),word.charAt(3));
            System.out.print("\n");
            System.out.printf("число %s неявляется счастливым", word);
        }
    }
}
