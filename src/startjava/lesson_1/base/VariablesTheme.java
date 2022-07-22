package startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Создание переменных и вывод их значений ий на консоль");
        byte numberOfCores = 4;
        short memoryCapacity = 8000;
        int hddCapacity = 1_000_000;
        long speedOfLight = 300_000;
        float monitorDiagonal = 22.5f;
        double numberPi = 3.14;
        char signPercent = '%';
        boolean conditionVariable = true;
        System.out.println("simple variable:  " +
                "\n" + numberOfCores + " , " + memoryCapacity + " , " + hddCapacity + " , "
                + monitorDiagonal + " , " + numberPi
                + "  " + speedOfLight + " , " + signPercent + " , " + conditionVariable + "\n");

        System.out.println("Задание №2 - Расчет стоимости товара со скидкой");
        int costGoods1 = 100;
        int costGoods2 = 200;
        int discount = ((costGoods1 + costGoods2) / 100) * 11;
        int discountPrice = (costGoods1 + costGoods2) - discount;
        System.out.println("сумма скидки - " + discount + "\n" + "общая стоимость товара c учетом скидки - "
                + discountPrice + "\n");

        System.out.println("Задание №3 - Вывод на консоль слова JAVA");
        String smallA = "a";
        String smallV = "v";
        String bigV = "V";
        String bigJ = "J";
        System.out.println("    " + bigJ + "    " + smallA + "  " + smallV + "       " + smallV + "  " + smallA + "\n"
                + "    " + bigJ + "   " + smallA + " " + smallA + "  " + smallV + "     " + smallV + "  " + smallA +
                " " + smallA + "\n" + " " + bigJ + "  " + bigJ + "  " + smallA + smallA + smallA + smallA + smallA
                + smallA + " " + bigV + "   " + bigV + "  " + smallA + smallA + smallA + smallA + smallA + "\n" + "  "
                + bigJ + bigJ + " " + smallA + "       " + smallA + "  " + bigV + "  " + smallA + "       "
                + smallA + "\n");

        System.out.println("Задание №4 - Создание переменные всех целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("переменная - тип byte " + "исходная = " + maxByte + " инкрементированная = "
                + ++maxByte + " декрементированная = " + --maxByte);
        System.out.println("переменная - тип short " + "исходная = " + maxShort + " инкрементированная = " + ++maxShort
                + " декрементированная = " + --maxShort);
        System.out.println("переменная - тип int " + "исходная = " + maxInt + " инкрементированная = " + ++maxInt +
                " декрементированная = " + --maxInt);
        System.out.println("переменная - тип long " + "исходная = " + maxLong + " инкрементированная = " + ++maxLong +
                " декрементированная = " + --maxLong + "\n");

        System.out.println("Задание №5 - Перестановка значений переменных");
        float number1 = 5.5f;
        float number2 = 10.5f;
        float number1ForByte = 5.5f;
        float number2ForByte = 10.5f;
        System.out.println("изначальные значения переменных " + number1 + " " + number2);
        // перестановка с помощью третей переменной
        float buffer = number1;
        number1 = number2;
        number2 = buffer;
        System.out.println("перестановленные значения переменных с помощью переменной  " + number1 + " " + number2);
        //с помощью арифметических операций
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("перестановленные значения переменных c помощью арифметических операций " + number1 + " "
                + number2);
        //с помощью побитовой операции
        number1 = (float) ((int) number1 ^ (int) number2);
        number2 = (float) ((int) number2 ^ (int) number1);
        number1 = (float) ((int) number1 ^ (int) number2);
        number1 = (number2ForByte - number1) + number1;
        number2 = (number1ForByte - number1) + number1;
        System.out.println("перестановленные значения переменных с помощью побитовой операций " + number1 + " "
                + number2 + "\n ");

        System.out.println("Задание №6 - Вывод символов и их кодов");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.println(codeChar1 + " код - " + (char) codeChar1 + "\n" + codeChar2 + " код - "
                + (char) codeChar2 + "\n" + codeChar3 + " код - " + (char) codeChar3 + "\n" + codeChar4 + " код - "
                + (char) codeChar4 + "\n" + codeChar5 + " код - " + (char) codeChar5 + "\n");

        System.out.println("Задание №7 - Найдите произведение, а затем сумму цифр числа 345");
        int srcNum = 345;
        int digit3 = srcNum % 10;
        int digit2 = (srcNum / 10) % 10;
        int digit1 = srcNum / 100;
        System.out.printf("Произведние чисел числа 345 = %d, сумма чисел числа 345 = %d", digit1 * digit2 * digit3,
                digit1 + digit2 + digit3);

        System.out.println("\n\nЗадание №8 - Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char space = ' ';
        char openRoundBracket = '(';
        char closeRoundBraket = ')';
        System.out.println("\n"+space + space + space + space + slash + backslash +
                "\n" + space + space + space + slash + space + space + backslash +
                "\n" + space + space + slash + underscore + openRoundBracket + space + closeRoundBraket + backslash +
                "\n" + space + slash + space + space + space + space + space + space + backslash +
                "\n" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore
                + underscore + backslash + "\n");

        System.out.println("Задание №9 - Отображение количества сотен, десятков и единиц числа 123");
        int srcNumber = 123;
        int hundred = srcNumber / 100;
        int tens = (srcNumber / 10) % 10;
        int ones = srcNumber % 10;
        System.out.println("Число - 123 содержит: " + "\n" + "сотен    " + hundred + "\n" + "десятков  "
                + tens + "\n" + "единиц   " + ones + "\n");

        System.out.println("Задание №10 - Преобразование секунд из 86399");
        int srcSeconds = 86399;
        long hour = srcSeconds / 3600;
        int min = (srcSeconds / 60) % 60;
        int sec = srcSeconds % 60;
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}

