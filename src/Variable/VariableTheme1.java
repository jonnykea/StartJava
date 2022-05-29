package Variable;

//Создание переменных и вывод их значений на консоль (это название задачи)
//объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
//в качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
//выведите эти данные на консоль
public class VariableTheme1 {
    public static void main(String[] args) {
        byte a = -5;
        short b = -5555;
        int c = 555555;
        long d = 5555555;
        float e = 55555555;
        double f = 55555555;
        char g = 55;
        boolean h = true;
        String i = "false";
        System.out.println("simple variable: a, b, c, d, e, f = " +
                "\n " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " +
                "\n other simple variable g, h, i " + "\n " + g + " , " + h +" , " + i);

    }
}
