package Lesson_1.Variable;


//Преобразование секунд
//имеется количество секунд 86399
//переведите его в часы, минуты и секунды
//используйте для этого только операции / и %
//отобразите полученные значения в формате ЧЧ:ММ:СС
public class VariableTheme10 {
    public static void main(String[] args) {
        int secs = 86399;
        long hour = secs / 3600;
        int min = (secs / 60) % 60;
        int sec = secs % 60;

        // int min = (secs - (hour*3600)) % 60;
        // int sec = (secs - (min*60)) % 60;

        System.out.println(secs +
                "\n" + " часы    " + hour +
                "\n" + " минуты  " + min +
                "\n" + " секунды " + sec);
        System.out.printf("%02d:%02d:%02d", hour, min, sec);

    }
}
