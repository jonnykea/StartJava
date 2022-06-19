package Lesson_1.CyclesTheme;
//Вывод чисел на консоль в несколько строк
//        выведите с помощью for на консоль числа в полуинтервале [1, 24)
//        шаг итерации 2
//        отображайте в каждой строке по 5 чисел
//        отделяйте их друг от друга необходимым количеством пробелов
//        не указывайте впереди числа нули
//        выравнивайте числа в каждом столбце по правому краю, используя форматированный вывод
//        недостающее в последней строке до 5 количество чисел заполните нулями
//        число нулей определяйте программно. Не считайте их в уме и не пишите сами

public class CyclesTheme4 {
    public static void main(String[] args) {
       final int startInclusive = 1;
       final int stopExclusive = 24;
       final int step = 2;
       final int charsPerString = 5;

        int counter = charsPerString;
        System.out.printf("строка ");
        for (int i = startInclusive; i < stopExclusive; i += step) {
            counter--;
            System.out.printf("%3d", i);
            if (counter == 0) {
                counter = charsPerString;
                System.out.print("\nстрока ");
            }
        }

        if (counter != 0) { // if string is not finished
            for (;counter > 0; counter--) {
                System.out.printf("%3d", 0);
            }
        }
    }
}
