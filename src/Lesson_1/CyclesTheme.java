package Lesson_1;

public class CyclesTheme {
//    Подсчет суммы четных и нечетных чисел
//        подсчитайте с помощью do-while сумму четных и нечетных чисел в промежутке [-10, 21]
//        отобразите эти значения в формате:
//        в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y

    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                X = X + i;
            } else {
                Y = Y + i;
            }
            i++;
        } while (i < 22);
        System.out.println("сумма четных чисел X = " + X);
        System.out.println("сумма нечетных чисел Y = " + Y);
        System.out.println("\n");


//Вывод чисел в интервале между (max и min)
//        даны значения 10, 5, -1
//        найдите среди них max и min число
//        отобразите в консоль, с помощью for, все числа в интервале (max, min)

        int max = 0;
        int min = 0;
        int a = 10;
        int b = 5;
        int c = -1;
        if (a > b && a > c) {
            max = a;
        }
        if (a < b && a < c) {
            min = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (b < a && b < c) {
            min = b;
        }
        if (c > b && c > a) {
            max = c;
        }
        if (c < b && c < a) {
            min = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }
        System.out.println("\n");


//Вывод реверсивного числа и суммы его цифр
//        дано число 1234
//        в цикле while выделите каждую его цифру
//        подсчитайте сумму полученных цифр
//        отобразите в консоли:
//        исходное число в обратном порядке
//        сумму его цифр
        int sum = 0;
        int a = 1234;
        int i;
        System.out.println("цифры в обратном порядке числа 1234");
        do {
            i = a % 10;
            sum += i;
            System.out.println(i);
            a /= 10;
        } while (a > 0);
        System.out.println("сумма чисел числа 1234 =  " + sum);
        System.out.println("\n");

//Вывод чисел на консоль в несколько строк
//        выведите с помощью for на консоль числа в полуинтервале [1, 24)
//        шаг итерации 2
//        отображайте в каждой строке по 5 чисел
//        отделяйте их друг от друга необходимым количеством пробелов
//        не указывайте впереди числа нули
//        выравнивайте числа в каждом столбце по правому краю, используя форматированный вывод
//        недостающее в последней строке до 5 количество чисел заполните нулями
//        число нулей определяйте программно. Не считайте их в уме и не пишите сами

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
            for (; counter > 0; counter--) {
                System.out.printf("%3d", 0);
            }
        }
        System.out.println("\n");


//Проверка количества единиц на четность
//        дано число 3141591
//        проверьте в цикле while, является ли количество единиц четным
//        отобразите результат:
//        число X содержит N (четное/нечетное) количество единиц

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
        System.out.println("\n");


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
            int x = i - 2;
            if (x < 0) {
                x = x * -1;
            }
            x = 2 - x;
            do {
                System.out.print('$');
            } while (x-- > 0);
            System.out.println();
        } while (i++ < 4);
        System.out.println("\n");


//	      Отображение ASCII-символов
//        ○	отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
//        ○	выводите на консоль:
//        i.	символы, идущие до цифр и имеющие нечетные коды
//        ii.	маленькие английские буквы, имеющие четные коды
//        ○	данные каждого столбца должны быть выровнены по правому краю

        for (char i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("нечетный код");
                System.out.printf("%2c", i);
                System.out.print("\n");
            }
        }
        for (char i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("четный   код");
                System.out.printf("%2c", i);
                System.out.print("\n");
            }
        }
        System.out.println("\n");


//8.	Проверка, является ли число палиндромом
//        ○	дано число 1234321
//        ○	проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
//        ○	использовать Math.pow нельзя
//        ○	отобразите в консоли:
//        i.	число X является палиндромом

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
        System.out.println("\n");


//9.	Определение, является ли число счастливым
//        ○	счастливым называется число, сумма первых трех цифр которого равна сумме последних
//        ○	возьмите любое шестизначное число
//        ○	подсчитайте сумму каждой тройки его цифр
//        ○	отобразите в консоли:
//        i.	каждую тройку цифр в формате “Сумма цифр abc = sum”
//        ii.	является число счастливым или нет

        String word = "125512";
        int length = word.length();
        int i = 0;
        int sumFirstNumber = 0;
        int sumLastNumber = 0;
        while (i <= (length / 2)) {
            sumFirstNumber += word.charAt(i);
            sumLastNumber += word.charAt(length - i - 1);
            i++;
        }
        if (sumFirstNumber == sumLastNumber) {
            System.out.printf("первая тройка цифр - %s %s %s ", word.charAt(0), word.charAt(1), word.charAt(2));
            System.out.print("\n");
            System.out.printf("вторая тройка цифр - %s %s %s ", word.charAt(5), word.charAt(4), word.charAt(3));
            System.out.print("\n");
            System.out.printf("число %s является счастливым", word);
        } else {
            System.out.printf("первая тройка цифр - %s %s %s ", word.charAt(0), word.charAt(1), word.charAt(2));
            System.out.print("\n");
            System.out.printf("вторая тройка цифр - %s %s %s ", word.charAt(5), word.charAt(4), word.charAt(3));
            System.out.print("\n");
            System.out.printf("число %s неявляется счастливым", word);
        }
        System.out.println("\n");


//10.	Вывод таблицы умножения Пифагора
//        ○	отобразите таблицу умножения в точности, как в образце, включая горизонтальные и вертикальные линии
//        ○	не добавляйте между строками и столбцами лишние пустоты
//        ○	используйте цикл for

        int startInclusive = 1;
        int stopExclusive = 9;
        int step = 1;
        int counter = 9;
        String Pifagor = "               ТАБЛИЦА ПИФАГОРА";
        System.out.printf("%s", Pifagor + "\n");
        for (int i = startInclusive; i <= stopExclusive; i += step) {
            for (int j = 1; j <= stopExclusive; j += step) {
                System.out.printf("%5d", (i * j));
            }
            counter--;
            System.out.println("\n");
        }
    }
}

