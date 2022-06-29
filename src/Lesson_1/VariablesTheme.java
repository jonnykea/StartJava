package Lesson_1;


public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Создание переменных и вывод их значений на консоль");
        byte firstVariable = -5;
        short secondVariable = -5;
        int thirdVariable = 55;
        long fourthVariable = 55555;
        float fifthVariable = 5.55f;
        double sixthVariable = 5.555;
        char signVariable = '%';
        boolean conditionVariable = true;

        System.out.println("simple variable:  " +
                "\n " + fifthVariable + " , " + secondVariable + " , " + thirdVariable + " , " + fourthVariable + " , " + fifthVariable
                + "  " + sixthVariable + " , " + signVariable + " , " + conditionVariable);
        System.out.println("\n ");


        System.out.println("Задание №2 - Расчет стоимости товара со скидкой");
        //стоимость первого товара
        int valueFirstGoods = 100;
        //стоимость второго товара
        int valueSecondGoods = 200;
        //скидка
        int discount = ((valueFirstGoods + valueSecondGoods) / 100) * 11; //скидка на товары 11 %
        int totalValue = (valueFirstGoods + valueSecondGoods) - discount; //общая стоимость товара с учетом скидки
        System.out.println("сумма скидки - " + discount + "\n" + "общая стоимость товара c учетом скидки - " + totalValue);
        System.out.println("\n ");


        System.out.println("Задание №3 - Вывод на консоль слова JAVA");
        String smallA = "a";
        String smallV = "v";
        String bigV = "V";
        String bigJ = "J";
        System.out.println("    " + bigJ + "    " + smallA + "  " + smallV + "       " + smallV + "  " + smallA +
                "\n" + "    " + bigJ + "   " + smallA + " " + smallA + "  " + smallV + "     " + smallV + "  " + smallA + " " + smallA +
                "\n" + " " + bigJ + "  " + bigJ + "  " + smallA + smallA + smallA + smallA + smallA + smallA + "  " + bigV + "  " + bigV + "  " + smallA + smallA + smallA + smallA + smallA +
                "\n" + "  " + bigJ + bigJ + "   " + smallA + "      " + smallA + "  " + bigV + "  " + smallA + "       " + smallA +
                "\n");
        System.out.println("\n ");


        System.out.println("Задание №4 - Создание переменные всех целых числовых типов");
        byte startVariableByte = 127;
        byte incrementByte, decrementByte;
        incrementByte = (byte) (startVariableByte + 1);
        decrementByte = (byte) (startVariableByte - 1);
        short startVariableShort = 32_767;
        short incrementShort, decrementShort;
        incrementShort = (short) (startVariableShort + 1);
        decrementShort = (short) (startVariableShort - 1);
        int startVariableInt = 2_147_483_647;
        int incrementInt, decrementInt;
        incrementInt = startVariableInt + 1;
        decrementInt = startVariableInt - 1;
        long startVariableLong = 9_223_372_036_854_775_807L;
        long incrementLong, decrementLong;
        incrementLong = startVariableLong + 1;
        decrementLong = startVariableLong - 1;
        System.out.println("переменная - тип byte " + "исходная = " + startVariableByte + " инкрементированная = " + incrementByte + " декрементированная = " + decrementByte);
        System.out.println("переменная - тип short " + "исходная = " + startVariableShort + " инкрементированная = " + incrementShort + " декрементированная = " + decrementShort);
        System.out.println("переменная - тип int " + "исходная = " + startVariableInt + " инкрементированная = " + incrementInt + " декрементированная = " + decrementInt);
        System.out.println("переменная - тип long " + "исходная = " + startVariableLong + " инкрементированная = " + incrementLong + " декрементированная = " + decrementLong);
        System.out.println("\n ");


        System.out.println("Задание №5 - Перестановка значений переменных");
        float firstVariableFloat = 5f;
        float secondVariableFloat = 10f;
        System.out.println("изначальные значения переменных " + firstVariableFloat + " " + secondVariableFloat);
        // перестановка с помощью третей переменной
        float thirdVariableFloat;
        thirdVariableFloat = firstVariableFloat;
        firstVariableFloat = secondVariableFloat;
        secondVariableFloat = thirdVariableFloat;
        System.out.println("перестановленные значения переменных с помощью переменной  " + firstVariableFloat + " " + secondVariableFloat);

        //с помощью арифметических операций
        firstVariableFloat = firstVariableFloat + secondVariableFloat;
        secondVariableFloat = firstVariableFloat - secondVariableFloat;
        firstVariableFloat = firstVariableFloat - secondVariableFloat;
        System.out.println("перестановленные значения переменных c помощью арифметических операций " + firstVariableFloat + " " + secondVariableFloat);

        //с помощью побитовой операции
        firstVariableFloat = (float) ((int) firstVariableFloat ^ (int) secondVariableFloat);
        secondVariableFloat = (float) ((int) secondVariableFloat ^ (int) firstVariableFloat);
        firstVariableFloat = (float) ((int) firstVariableFloat ^ (int) secondVariableFloat);
        System.out.println("перестановленные значения переменных с помощью побитовой операций " + firstVariableFloat + " " + secondVariableFloat);
        System.out.println("\n ");


        System.out.println("Задание №6 - Вывод символов и их кодов");
        int variable1 = 35;
        int variable2 = 38;
        int variable3 = 64;
        int variable4 = 94;
        int variable5 = 95;
        System.out.println(" код переменной " + variable1 + " код символа " + (char) variable1);
        System.out.println(" код переменной " + variable2 + " код символа " + (char) variable2);
        System.out.println(" код переменной " + variable3 + " код символа " + (char) variable3);
        System.out.println(" код переменной " + variable4 + " код символа " + (char) variable4);
        System.out.println(" код переменной " + variable5 + " код символа " + (char) variable5);
        System.out.println("\n ");


        System.out.println("Задание №7 - Найдите произведение, а затем сумму цифр числа 345");
        int sum = 0;
        int product = 1;
        int digit;
        int value = 345;
        // найти цифру
        digit = value % 10;
        // добавить цифру к сумме
        sum += digit;
        // добавить цифру к произведению
        product *= digit;
        // передвинуть разряд
        value = value / 10;
        // найти цифру
        digit = value % 10;
        // добавить цифру к сумме
        sum += digit;
        // добавить цифру к произведению
        product *= digit;
        // передвинуть разряд
        value = value / 10;
        // найти цифру
        digit = value % 10;
        // добавить цифру к сумме
        sum += digit;
        // добавить цифру к произведению
        product *= digit;
        // вывести сумму
        // вывести произведение
        System.out.printf("Произвведние чисел числа 345 = %d, сумма чисел числа 345 = %d", product, sum);
        System.out.println("\n");


        System.out.println("Задание №8 - Вывод на консоль ASCII-арт Дюка");
        String slash = "/";
        String backslash = "\\";
        String underscore = "_";
        String space = " ";
        String open = "(";
        String close = ")";

        System.out.println(space + space + space + space + slash + backslash +
                "\n" + space + space + space + slash + space + space + backslash +
                "\n" + space + space + slash + underscore + open + space + close + backslash +
                "\n" + space + slash + space + space + space + space + space + space + backslash +
                "\n" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);
        System.out.println("\n");


        System.out.println("Задание №9 - Отображение количества сотен, десятков и единиц числа 123");
        int number = 123;
        int hundred = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        System.out.println(" Число N - 123 содержит: " +
                "\n" + " сотен    " + hundred +
                "\n" + " дестков  " + tens +
                "\n" + " единиц   " + units);
        System.out.println("\n");


        System.out.println("Задание №10 - Преобразование секунд из 86399");
        int initial = 86399;
        long hour = initial / 3600;
        int min = (initial / 60) % 60;
        int sec = initial % 60;

      /*   int min = (secs - (hour*3600)) % 60;
         int sec = (secs - (min*60)) % 60;*/

        System.out.println(initial +
                "\n" + " часы    " + hour +
                "\n" + " минуты  " + min +
                "\n" + " секунды " + sec);
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}

