package Lesson_1;


public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Создание переменных и вывод их значений на консоль");
        byte firstVariable = -5;
        short secondVariable = -5555;
        int thirdVariable = 555555;
        long fourthVariable = 5555555;
        float fifthVariable = 55555555;
        double sixthVariable = 55555555;
        char signVariable = '%';
        boolean conditionVariable = true;

        System.out.println("simple variable:  " +
                "\n " + fifthVariable + " " + secondVariable + " " + thirdVariable + " " + fourthVariable + " " + fifthVariable
                + " " + sixthVariable + " " + "\n" + signVariable + " , " + conditionVariable);
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
        System.out.println("переменная - тип long " + "исходная = " + startVariableLong + " инкрементированная = " + incrementLong + " декрементированная = " + decrementLong + "\n");


        System.out.println("Задание №5 - Перестановка значений переменных");
        float firstVariableFloat = 5f;
        float secondVariableFloat = 10f;
        System.out.println("изначальные значения переменных a и b " + thirdVariableFloat + " " + thirdVariableFloat);
        // перестановка с помощью третей переменной
        float thirdVariableFloat;
        thirdVariableFloat = thirdVariableFloat;
        thirdVariableFloat = thirdVariableFloat;
        thirdVariableFloat = thirdVariableFloat;
        System.out.println("перестановленные значения переменных a и b с помощью переменной  " + thirdVariableFloat + " " + thirdVariableFloat);
        //с помощью арифметических операций
        thirdVariableFloat = thirdVariableFloat + thirdVariableFloat;
        thirdVariableFloat = thirdVariableFloat - thirdVariableFloat;
        thirdVariableFloat = thirdVariableFloat - thirdVariableFloat;
        System.out.println("перестановленные значения переменных a и b с помощью арифметических операций " + thirdVariableFloat + " " + thirdVariableFloat);
        //с помощью побитовой операции
        thirdVariableFloat = (float) ((int) thirdVariableFloat ^ (int) thirdVariableFloat);
        thirdVariableFloat = (float) ((int) thirdVariableFloat ^ (int) thirdVariableFloat);
        thirdVariableFloat = (float) ((int) thirdVariableFloat ^ (int) thirdVariableFloat);
        System.out.println("перестановленные значения переменных c помощью побитовой операций " + thirdVariableFloat + " " + thirdVariableFloat);
        System.out.println("\n ");

//        Вывод символов и их кодов
//создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
//отобразите в консоли:
//код символа
//напротив кода соответствующий ему символ (делайте это программно, а не написав его самим) из ASCII-таблицы

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
        System.out.println("\n ");


//        Произведение и сумма цифр числа имеется число 345 найдите произведение, а затем сумму его цифр не используйте цикл
//выделяйте каждую цифру числа программно, а не написав их самим
//используйте для этого только операции / и %
//выведите результат в следующем формате:
//сумма цифр числа N = столько-то
//произведение цифр числа N = столько-то

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


//        Вывод на консоль ASCII-арт Дюка
//отобразите в консоли Java-талисман, используя символы из примера ниже:
//    /\
//   /  \
//  /_( )\
// /      \
///____/\__\
//каждый уникальный символ, включая пробел, храните в отдельной переменной
//отобразите (построчно, а не посимвольно) результат в консоль, используя значения переменных

        String a = "/";
        String b = "\\";
        String c = "_";
        String d = " ";
        String e = "(";
        String f = ")";

        System.out.println(d + d + d + d + a + b +
                "\n" + d + d + d + a + d + d + b +
                "\n" + d + d + a + c + e + d + f + b +
                "\n" + d + a + d + d + d + d + d + d + b +
                "\n" + a + c + c + c + c + a + b + c + c + b);
        System.out.println("\n");


//Отображение количества сотен, десятков и единиц числа
//имеется число 123
//выделите у него программно сотни, десятки и единицы
//используйте для этого только операции / и %
//отобразите результат, как “Число N содержит:”
//X сотен
//Y десятков
//Z единиц


        int N = 123;
        int X = N / 100;
        int Y = (N / 10) % 10;
        int Z = N % 10;
        System.out.println(" Число N - 123 содержит: " +
                "\n" + " X - сотен    " + X +
                "\n" + " Y - дестков  " + Y +
                "\n" + " Y - единиц   " + Z);
        System.out.println("\n");


//        Преобразование секунд
//имеется количество секунд 86399
//переведите его в часы, минуты и секунды
//используйте для этого только операции / и %
//отобразите полученные значения в формате ЧЧ:ММ:СС

        int secs = 86399;
        long hour = secs / 3600;
        int min = (secs / 60) % 60;
        int sec = secs % 60;

        // int min = (secs - (hour*3600)) % 60;
        // int sec = (secs - (min*60)) % 60;

        System.out.println(secs +
                "\n" + " часы    " + hour +
                "\n" + " минуты  " + min +
                "\n" + " секунды " + sec);
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
        System.out.println("\n");


    }
}

