
public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int startRange = -10;
        int endRange = 21;
        do {
            if (startRange % 2 == 0) {
                sumEven += startRange;
            } else {
                sumOdd += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("сумма четных чисел = " + sumEven + "\nсумма нечетных чисел = " + sumOdd);

        System.out.println("\nЗадание №2 - Вывод чисел в интервале между (max и min)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 > num2) {
            startRange = num1;
        } else startRange = num2;
        if (startRange > num3) {
            startRange = num1;
        } else startRange = num3;

        if (num1 < num2) {
            endRange = num1;
        } else endRange = num2;
        if (endRange < num3) {
            endRange = num1;
        } else endRange = num3;
        for (int i = startRange; i >= endRange; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадание №3 - Вывод реверсивного числа и суммы его цифр");
        int sum = 0;
        int srcNum = 1234;
        int digit = 0;
        System.out.printf("цифры в обратном порядке числа %d - ", srcNum);
        do {
            //разбите числа 1234 на разряды
            digit = srcNum % 10;
            sum += digit;
            System.out.print(digit);
            srcNum /= 10;
        } while (srcNum > 0);
        System.out.printf("\nсумма чисел = %d ", sum);

        System.out.println("\n\nЗадание №4 - Вывод чисел на консоль в несколько строк");
        startRange = 1;
        endRange = 24;
        int step = 2;
        int numbersPerString = 5;
        int counter = numbersPerString;
        for (int i = startRange; i < endRange; i += step) {
            counter--;
            System.out.printf("%3d", i);
            if (counter == 0) {
                counter = numbersPerString;
                System.out.println(" ");
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
        int countOnes = 0;
        // Counting how much ones in the number
        srcNum = 3141591;
        // Checking if one number is even
        while (srcNum > 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }
        if (countOnes % 2 == 0) {
            even = "четное";
        } else {
            even = "нечетное";
        }
        System.out.println("число 3141591 содержит количество '1' - " + countOnes + " - " + even);

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
            //построение граней равнобедренного треугольника
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
        for (i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n" + "код символа %3d символ %3c", i, (char) i);
            }
        }
        for (i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n" + "код символа %3d символ %3c", i, (char) i);
            }
        }

        System.out.println("\n\nЗадание №8 - Проверка, является ли число палиндромом");
        srcNum = 1234321; //It is the number variable to be checked for palindrome
        digit = 0;
        int temp = srcNum;
        int invertNum = 0;
        while (srcNum > 0) {
            digit = srcNum % 10;
            invertNum = (invertNum * 10) + digit;
            srcNum = srcNum / 10;
        }
        if (temp == invertNum)
            System.out.println("number is palindrome - " + temp);
        else
            System.out.println("number is not palindrome - " + temp);

        System.out.println("\nЗадание №9 - Определение, является ли число счастливым");
        srcNum = 212411;
        int srcNum1 = srcNum;
        int num = 100000;
        int sumTopHalf = 0;
        int sumLowerHalf = 0;
        while (srcNum > 1000) {
            int digitLast = srcNum % 10;
            int digitFirst = (srcNum1 / num) % 10;
            sumLowerHalf += digitLast;
            sumTopHalf += digitFirst;
            srcNum /= 10;
            num /= 10;
        }
        System.out.println("sum of half lower digit = " + sumLowerHalf + "\nsum of half top digit = " + sumTopHalf);
        if (sumTopHalf == sumLowerHalf) {
            System.out.println(srcNum + " - is happy");
        } else {
            System.out.println(srcNum + " - is unhappy");
        }

        System.out.println("\nЗадание №10 - Вывод таблицы умножения Пифагора");
        int startRow = 1;
        int endRow = 9;
        String pifagor = "      ТАБЛИЦА ПИФАГОРА";
        System.out.printf("%s", pifagor + "\n");
        for (i = startRow; i <= endRow; i++) {
            for (int j = 1; j <= endRow; j++) {
                if (i * j != 1) {
                    System.out.printf("%3d", (i * j));
                } else {
                    System.out.print("   ");
                }
                if (j == 1) {
                    System.out.print("|");
                }
            }
            if (i == 1) {
                System.out.println("\n____________________________");
            } else {
                System.out.println();
            }
        }
    }
}

