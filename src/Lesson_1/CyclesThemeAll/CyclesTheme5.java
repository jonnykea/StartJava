package Lesson_1.CyclesThemeAll;
//Проверка количества единиц на четность
//        дано число 3141591
//        проверьте в цикле while, является ли количество единиц четным
//        отобразите результат:
//        число X содержит N (четное/нечетное) количество единиц

public class CyclesTheme5 {
    public static void main(String[] args) {
        String even = "";
        int onesCount = 0;
        // Counting how much ones in the number
        String number = "3141591";
        // Checking if one number is even
        int i = 0;
        while (i <= 6) {
            char n = number.charAt(i);
            if (n == '1') {
                onesCount++;
            }
            i++;
            if (onesCount % 2 == 0) {
                even = "Четное";
            } else {
                even = "нечетное";
            }
            System.out.println(n);
        }
        System.out.println("число " + number + " содержит количество '1' - " + onesCount + " - " + even);
    }
}

