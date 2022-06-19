package Lesson_1.Variable;

//Вывод символов и их кодов
//создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
//отобразите в консоли:
//код символа
//напротив кода соответствующий ему символ (делайте это программно, а не написав его самим) из ASCII-таблицы
public class VariableTheme6 {
    public static void main(String[] args) {
        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;
        System.out.println(" код переменной " + a + " код символа " + (char) a);
        System.out.println(" код переменной " + b + " код символа " + (char) b);
        System.out.println(" код переменной " + c + " код символа " + (char) c);
        System.out.println(" код переменной " + d + " код символа " + (char) d);
        System.out.println(" код переменной " + e + " код символа " + (char) e);
    }
}
