package Lesson_1.CyclesTheme;
//Проверка количества единиц на четность
//        дано число 3141591
//        проверьте в цикле while, является ли количество единиц четным
//        отобразите результат:
//        число X содержит N (четное/нечетное) количество единиц

public class CyclesTheme5 {
    public static void main(String[] args) {

        int onesCount = 0;
        // Counting how much ones in the number
        String number = "3141591";
        // Checking if one number is even
        int SumEven = 0;
        int SumOdd = 0;
        int i = 1;
//        while (i <= number.length()) {
            char n = number.charAt(i);
            if (n == 1) {
             onesCount++;
            }
//            i++;
//        }
//            System.out.printf("число %d содержит количество единиц %d", number, onesCount);
            System.out.println(onesCount);
            System.out.print(n);
        }
    }

