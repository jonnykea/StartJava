package Lesson_1.CyclesTheme;
//Проверка количества единиц на четность
//        дано число 3141591
//        проверьте в цикле while, является ли количество единиц четным
//        отобразите результат:
//        число X содержит N (четное/нечетное) количество единиц

public class CyclesTheme5 {
    public static void main(String[] args) {
        boolean isEven = true;
        int onesCount = 0;
        // Counting how much ones in the number

        // if rank is equal to 1 then inverting
        isEven = !isEven;

        int number = 3_141_591;
        // Checking if ones number is even

        int SumEven = 0;
        int SumOdd = 0;
        int i = 1;
        while (i < number) {
            if (i % 2 == 0) {
                SumEven ++;
            } else {
                SumOdd ++;
            }
            i++;
        }

        String isEvenString = isEven ? "четное" : "нечетное";
        System.out.printf("число %d содержит %s количество единиц", number, isEvenString);
    }
}
