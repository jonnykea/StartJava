package Lesson_1.CyclesThemeAll;
//8.	Проверка, является ли число палиндромом
//        ○	дано число 1234321
//        ○	проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
//        ○	использовать Math.pow нельзя
//        ○	отобразите в консоли:
//        i.	число X является палиндромом

public class CyclesTheme8 {
    public static void main(String[] args) {
        String word = "1234321";
        int length = word.length();
        int i = 0;
        while (i < (length / 2)) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.printf("число %s не является палиндромом", word);
                break;
            } else {
                i++;
            }
        }
        if (i == (length / 2)) {
            System.out.printf("число %s является палиндромом", word);
        }
    }
}


