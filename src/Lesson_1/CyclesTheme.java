package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Подсчет суммы четных и нечетных чисел");
        int scoreOfEven = 0;
        int ScoreOfOdd = 0;
        int startRange = -10;
        int endRange = 21;
        do {
            if (startRange % 2 == 0) {
                scoreOfEven += startRange;
            } else {
                ScoreOfOdd += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("сумма четных чисел = " + scoreOfEven + "\nсумма нечетных чисел = " + ScoreOfOdd);

        System.out.println("\nЗадание №2 - Вывод чисел в интервале между (max и min)");
        int firstValue = 10;
        int secondValue = 5;
        int thirdValue = -1;
        if (firstValue > secondValue && firstValue > thirdValue) {
            startRange = firstValue;
        }
        if (firstValue < secondValue && firstValue < thirdValue) {
            endRange = firstValue;
        }
        if (secondValue > firstValue && secondValue > thirdValue) {
            startRange = secondValue;
        }
        if (secondValue < firstValue && secondValue < thirdValue) {
            endRange = secondValue;
        }
        if (thirdValue > secondValue && thirdValue > firstValue) {
            startRange = thirdValue;
        }
        if (thirdValue < secondValue && thirdValue < firstValue) {
            endRange = thirdValue;
        }
        for (int i = startRange; i >= endRange; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадание №3 - Вывод реверсивного числа и суммы его цифр");
        int sum = 0;
        int srcNum = 1234;
        int rank = 0;
        System.out.println("цифры в обратном порядке числа 1234");
        do {
            //разбите числа 1234 на разряды
            rank = srcNum % 10;
            sum += rank;
            System.out.println(rank);
            srcNum /= 10;
        } while (srcNum > 0);
        System.out.println("сумма чисел числа 1234 = " + sum);

        System.out.println("\nЗадание №4 - Вывод чисел на консоль в несколько строк");
        startRange = 1;
        endRange = 24;
        int step = 2;
        int numbersPerString = 5;
        int counter = numbersPerString;
        System.out.print("строка ");
        for (int i = startRange; i < endRange; i += step) {
            counter--;
            System.out.printf("%3d", i);
            if (counter == 0) {
                counter = numbersPerString;
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
        int srcNumber = 3141591;
        // Checking if one number is even
        while (srcNumber > 0) {
            rank = srcNumber % 10;
            srcNumber /= 10;
            if (rank == 1) {
                onesCount++;
            }
            if (onesCount % 2 == 0) {
                even = "четное";
            } else {
                even = "нечетное";
            }
        }
        System.out.println("число 3141591 содержит количество '1' - " + onesCount + " - " + even);

        System.out.println("\nЗадание №6 - Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        int verticalFace = 5;
        int horizontalFace = 10;
        for (int i = 1; i <= verticalFace; i++) {
            for (int j = 1; j <= horizontalFace; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Прямоугольный треугольник");
        int heightTriangle = 5;
        int i = 0;
        while (i < heightTriangle) {
            int j = i;
            while (j < heightTriangle) {
                System.out.print("#");
                j++;
            }
            i++;
            System.out.println(" ");
        }
        System.out.println("Равнобедренный треугольник");
        i = 0;
        do {
            //построение граний равнобедренного треугольника
            int x = i - 2;
            if (x < 0) {
                x *= -1;
            }
            x = 2 - x;
            do {
                System.out.print('$');
            } while (x-- > 0);
            System.out.println();
        } while (i++ < 4);

        System.out.print("\nЗадание №7 -  Отображение ASCII-символов");
        for (char indexSign = 0; indexSign <= 47; indexSign++) {
            if (indexSign % 2 != 0) {
                System.out.printf("\n" + "нечетный символ %2c", indexSign);
            }
        }
        for (char indexSmallLetter = 'a'; indexSmallLetter <= 'z'; indexSmallLetter++) {
            if (indexSmallLetter % 2 == 0) {
                System.out.printf("\n" + "четная   буква %2c", indexSmallLetter);
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
        int endString = 9;
        int numberOfStringString = 9;
        int stepString = 1;
        String Pifagor = "               ТАБЛИЦА ПИФАГОРА";
        System.out.printf("%s", Pifagor + "\n");
        for (i = startString; i <= endString ; i += stepString) {
            for (int j = 1; j <= endString ; j += stepString) {
                System.out.printf("%5d", (i * j));
            }
            numberOfStringString--;
            System.out.println("");
        }
    }
}

