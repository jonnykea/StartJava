package Lesson_1.Variable;

//Вывод на консоль ASCII-арт Дюка
//отобразите в консоли Java-талисман, используя символы из примера ниже:
//    /\
//   /  \
//  /_( )\
// /      \
///____/\__\
//каждый уникальный символ, включая пробел, храните в отдельной переменной
//отобразите (построчно, а не посимвольно) результат в консоль, используя значения переменных
public class VariableTheme8 {
    public static void main(String[] args) {
        String a = "/";
        String b = "\\";
        String c = "_";
        String d = " ";
        String e = "(";
        String f = ")";

        System.out.println(d + d + d + d + a + b +
                "\n" + d + d + d + a + d + d + b +
                "\n" + d + d + a + c + e + d + f + b +
                "\n" + d + a + d + d + d + d + d + d + b +
                "\n" + a + c + c + c + c + a + b + c + c + b);
    }
}
