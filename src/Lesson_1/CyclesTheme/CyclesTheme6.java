package Lesson_1.CyclesTheme;
//Отображение фигур в консоли
//        отобразите геометрические фигуры, используя:
//        для прямоугольника только for
//        для прямоугольного треугольника только while
//        для второго треугольника только do-while
//        каждую фигуру выводите на новой строке
//        **********    #####    $
//        **********    ####     $$
//        **********    ###      $$$
//        **********    ##       $$
//        **********    #        $


public class CyclesTheme6 {
    public static void main(String[] args) {
        System.out.println("Прямоугольник");
        int rectangle = 5; //Прямоугольник
        for (int i = 1; i <= rectangle; i++) {
            for (int j = -5; j < rectangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Прямоугольный треугольник");
        int triangle = 5;
        int i = 0;
        while (i < triangle) {
            int j = i;
            while (j < triangle) {
                System.out.print("#");
                j++;
            }
            i++;
            System.out.println(" ");
        }
        System.out.println("Равнобедренный треугольник");
        i = 0;
        do {
//            int x = 2 - Math.abs(i - 2);
            int x = i - 2;
//            x = 2 - (x < 0 ? x * -1 : x);
            if (x < 0) {
                x = x * -1;
            }
            x = 2 - x;
            do {
                System.out.print('$');
            } while (x-- > 0);
            System.out.println();
        } while (i++ < 4);
    }
}
