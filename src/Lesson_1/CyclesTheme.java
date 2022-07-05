package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Подсчет суммы четных и нечетных чисел");
        int scoreOfEven = 0;
        int ScoreOfOdd = 0;
        int startValue = -10;
        int finishValue = 21;
        do {
            if (startValue % 2 == 0) {
                scoreOfEven = scoreOfEven + startValue;
            } else {
                ScoreOfOdd = ScoreOfOdd + startValue;
            }
            startValue++;
        } while (startValue <= finishValue);
        System.out.println("сумма четных чисел = " + scoreOfEven);
        System.out.println("сумма нечетных чисел = " + ScoreOfOdd);

        System.out.println("\nЗадание №2 - Вывод чисел в интервале между (max и min)");
        int initialMax = 0;
        int initialMin = 0;
        int firstValue = 10;
        int secondValue = 5;
        int thirdValue = -1;
        if (firstValue > secondValue && firstValue > thirdValue) {
            initialMax = firstValue;
        }
        if (firstValue < secondValue && firstValue < thirdValue) {
            initialMin = firstValue;
        }
        if (secondValue > firstValue && secondValue > thirdValue) {
            initialMax = secondValue;
        }
        if (secondValue < firstValue && secondValue < thirdValue) {
            initialMin = secondValue;
        }
        if (thirdValue > secondValue && thirdValue > firstValue) {
            initialMax = thirdValue;
        }
        if (thirdValue < secondValue && thirdValue < firstValue) {
            initialMin = thirdValue;
        }
        for (int i = initialMax; i >= initialMin; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадание №3 - Вывод реверсивного числа и суммы его цифр");
        int sum = 0;
        int initialNumeric = 1234;
        int rank;
        System.out.println("цифры в обратном порядке числа 1234");
        do {
            //разбите числа 1234 на разряды
            rank = initialNumeric % 10;
            sum += rank;
            System.out.println(rank);
            initialNumeric /= 10;
        } while (initialNumeric > 0);
        System.out.println("сумма чисел числа 1234 = " + sum);

        System.out.println("\nЗадание №4 - Вывод чисел на консоль в несколько строк");
        final int startInclusive = 1;
        final int stopExclusive = 24;
        final int step = 2;
        final int charsPerString = 5;
        int counter = charsPerString;
        System.out.print("строка ");
        for (int i = startInclusive; i < stopExclusive; i += step) {
            counter--;
            System.out.printf("%3d", i);
            if (counter == 0) {
                counter = charsPerString;
                System.out.print("\nстрока ");
            }
        }
        // if string is not finished
        if (counter != 0) {
            for (; counter > 0; counter--) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадание №5 - Проверка количества единиц на четность");
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
        }
        System.out.println("число " + number + " содержит количество '1' - " + onesCount + " - " + even);

        System.out.println("\nЗадание №6 - Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        int rectangle = 5; //Прямоугольник
        for (i = 1; i <= rectangle; i++) {
            for (int j = -5; j < rectangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Прямоугольный треугольник");
        int triangle = 5;
        i = 0;
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

        System.out.print("\nЗадание №7 -  Отображение ASCII-символов");
        for (char indexNumber = 0; indexNumber <= 47; indexNumber++) {
            if (indexNumber % 2 != 0) {
                System.out.printf("\n" + "нечетный код %2c", indexNumber);
            }
        }
        for (char indexNumber = 97; indexNumber <= 122; indexNumber++) {
            if (indexNumber % 2 == 0) {
                System.out.printf("\n" + "четный   код %2c", indexNumber);
            }
        }

        System.out.println("\n\nЗадание №8 - Проверка, является ли число палиндромом");
        String word = "1234321";
        int length = word.length();
        i = 0;
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

        System.out.println("\n\nЗадание №9 - Определение, является ли число счастливым");
        String wordHappy = "125512";
        length = wordHappy.length();
        i = 0;
        int sumFirstThreeNumber = 0;
        int sumLastThreeNumber = 0;
        while (i <= (length / 2)) {
            sumFirstThreeNumber += wordHappy.charAt(i);
            sumLastThreeNumber += wordHappy.charAt(length - i - 1);
            i++;
        }
        if (sumFirstThreeNumber == sumLastThreeNumber) {
            System.out.printf("первая тройка цифр - %s %s %s",
                    wordHappy.charAt(0), wordHappy.charAt(1), wordHappy.charAt(2) + "\n");
            System.out.printf("вторая тройка цифр - %s %s %s",
                    wordHappy.charAt(5), wordHappy.charAt(4), wordHappy.charAt(3) + "\n");
            System.out.printf("число %s является счастливым", wordHappy);
        } else {
            System.out.printf("первая тройка цифр - %s %s %s",
                    wordHappy.charAt(0), wordHappy.charAt(1), wordHappy.charAt(2) + "\n");
            System.out.printf("вторая тройка цифр - %s %s %s",
                    wordHappy.charAt(5), wordHappy.charAt(4), wordHappy.charAt(3) + "\n");
            System.out.printf("число %s неявляется счастливым", wordHappy);
        }

        System.out.println("\n\nЗадание №10 - Вывод таблицы умножения Пифагора");
        int startString = 1;
        int stopString = 9;
        int stepNumber = 1;
        int valueOfString = 9;
        String Pifagor = "               ТАБЛИЦА ПИФАГОРА";
        System.out.printf("%s", Pifagor + "\n");
        for (i = startString; i <= stopString; i += stepNumber) {
            for (int j = 1; j <= stopString; j += stepNumber) {
                System.out.printf("%5d", (i * j));
            }
            valueOfString--;
        }
    }
}

