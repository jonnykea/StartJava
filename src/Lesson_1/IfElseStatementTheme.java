package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java (это название задачи)
//        перепишите псевдокод, приведенный ниже, с помощью Java
//        используйте переменные, условные операторы, логическое НЕ
//        придумайте сообщения и отобразите в консоли
//        ЕСЛИ(возраст > 20) {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }
//        ЕСЛИ(!мужскойПол) {
//        сообщение
//        }
//        ЕСЛИ(рост < 1.80) {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }
//        перваяБукваИмени = “Имя”.charAt(0);
//        ЕСЛИ(перваяБукваИмени == 'M') {
//        сообщение
//        } ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }
        int age = 33;
        boolean isMale = false;
        float height = 1.75f;
        String name = "ЖЕНЯ";
        if (age > 20) {
            System.out.println("Старик )))");
        } else {
            System.out.println("Молодой )))");
        }
        if (!isMale) {
            System.out.println("женщина");
        }
        if (height < 1.80) {
            System.out.println("Коротковат " + height);
        } else {
            System.out.println("Средний рост");
        }
        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Не угадал");
        } else if (firstLetter == 'Ж') {
            System.out.println("Угадал");
        } else {
            System.out.println("Все мимо");
        }
        System.out.println("\n");


//        Поиск max и min числа
//        создайте две переменные, присвоив им любые числа
//        найдите максимальное и минимальное число
//        выведите числа на консоль, указав какое из них max и min
        int x = 45;
        int y = 55;

        if (x > y) {
            System.out.println("максимальное число " + x);
        } else {
            System.out.println("максимальное число " + y);
        }
        if (x < y) {
            System.out.println("минимальное число  " + x);
        }
        System.out.println("\n");


//        Работа с числом
//        создайте переменную с любым числом
//        определите, являться ли оно:
//        нулем
//        четным (нечетным)
//        отрицательным (положительным)
//        если число равно 0, то остальные проверки не должны осуществляться
//        отобразите полученные результаты

        int x = 15;
        if (x == 0) {
            System.out.println(x + " is null");
        } else {

            if (x > 0) {
                System.out.println(x + " is positive");
            } else {
                System.out.println(x + " is negative");
            }
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
        System.out.println("\n");

//        Поиск одинаковых цифр в числах
//создайте две переменные, присвоив им два трехзначных целых числа
//найдите в них одинаковые цифры, стоящие в одном и том же разряде
//отобразите результат в формате:
//в числах N и M одинаковые цифры A, B, C стоят в X, Y, Z разрядах

        String N = "111";
        char A = N.charAt(0);
        char B = N.charAt(1);
        char C = N.charAt(2);

        String M = "111";
        char X = M.charAt(0);
        char Y = M.charAt(1);
        char Z = M.charAt(2);
        System.out.println("Число N " + N + "\n" + "Число M " + M);
        if (A == X) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z в  первом разряде - " + A + " и " + X);
        }
        if (B == Y) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z во втором разряде - " + B + " и " + Y);
        }
        if (C == Z) {
            System.out.println("В числах N и M одинаковые цифры A, B, C стоят в X, Y, Z в третьем разряде - " + C + " и " + Z);
        }
        System.out.println("\n");

//        Определение буквы, числа или символа по их коду
//создайте переменную типа char
//присвойте ей значение ‘\u0057’
//определите — это код буквы, числа или другого символа
//использовать для этого методы классов Java запрещено!
//выведите в консоль сам символ и информацию о нем:
//маленькая (большая) буква
//это число
//не буква и не число

        char A = '\u0057';
        if (A >= 0 && A < 48 && A >= 58 && A < 65 && A >= 123 && A <= 127) {
            System.out.println(A + " переменная А является не буквой и не число");
        } else if (A >= 48 && A < 58) {
            System.out.println(A + " является числом");
        } else if (A >= 65 && A < 91) {
            System.out.println(A + " является заглавной буквой");
        } else if (A >= 61 && A < 123) {
            System.out.println(A + " является маленькой буквой");
        }
        System.out.println("\n");

//Определение суммы вклада и начисленных банком %
//сумма вклада равна 300_000 руб.
//если она:
//меньше 100 000, то банк начисляет 5% годовых
//от 100 000 до 300 000, то — 7%
//больше 300 000, то — 10%
//отобразите в консоли:
//сумму вклада
//начисленный %
//итоговую сумму с %
        int sum = 300_000;
        if (sum < 100_000) {
            double interest = sum * 0.05;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum < 300_000 && sum > 100_000) {
            double interest = sum * 0.07;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum >= 300_000) {
            double interest = sum * 0.1;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        }
        System.out.println("\n");


//Определение оценки по предметам
//студент получил итоговые % по предметам:
//история 59%
//программирование 91%
//определите оценки по каждому предмету:
//<= 60% — 2
//> 60% - 3
//> 73% - 4
//> 91% - 5
//выведите в консоль:
//оценку и напротив предмет
//средний балл оценок по предметам
//средний % по предметам

        int history = 59;
        String h = "History";
        String p = "Programming";
        int programming = 91;
        int mP = 1;
        int mH = 1;

        if (history <= 60) {
            int markH = 2;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        } else if (history > 60 && history <= 73) {
            int markH = 3;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        } else if (history > 73 && history <= 91) {
            int markH = 4;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);

        } else if (history > 91) {
            int markH = 5;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        }

        if (programming <= 60) {
            int markP = 2;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);
        } else if (programming > 60 && programming <= 73) {
            int markP = 3;
            mP = markP;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markP);
        } else if (programming > 73 && programming <= 91) {
            int markP = 4;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);

        } else if (programming > 91) {
            int markP = 5;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);
        }
        int m = (mP + mH) / 2;
        int midPercent = (history + programming) / 2;
        System.out.println("Средний бал оценок по предметам - " + m +
                "\n" + "Средний процент предметов - " + midPercent + " %");
        System.out.println("\n");


//продавеу снимает помещение за 5000 руб в месяц
//в среднем он продает товара на 13000 руб
//при этом его себестоимость равна 9000 руб
//посчитайте годовую прибыль
//отобразите ее в консоли в следующем формате, например:
//   прибыль за год - 1000 руб
//   прибыль за год + 3000 руб
//если прибыль положительная, то рядом с чмслом необходимо отображать+


        int SpentLent = 5000;
        int proceed = 13000 - 9000; // выручка
        int year = 12;
        int LentForYear = SpentLent * year;
        int ProcedForYear = proceed * year;
        int profit = ProcedForYear - LentForYear;
        if (profit >= 0) {
            System.out.println("Прибыль за год составила  " + profit + " руб." + " +");
        } else if (profit < 0) {
            System.out.println("Прибыль за год составила " + profit + " руб.");
        }
        System.out.println("\n");


//Подсчет количества банкнот
//из банкомата вам необходимо снять 567 USD
//подсчитайте, с помощью какого количества банкнот номиналом 1, 10, 100 банкомат может выдать необходимую сумму
//при этом в банкомате осталось только 5 банкнот номиналом 10
//проведите обратный расчет начальной суммы по полученному количеству банкнот, чтобы убедиться в правильности вычислений
//если каких-то банкнот не хватает, то их нужно заменить банкнотами другого номинала
//выведите в консоль:
//номиналы банкнот
//требуемое их количество
//посчитанную исходную сумму


        int amount = 567;
        int hundred = amount / 100;
        int ten = (amount / 10) % 10;
        int unit = amount % 10;

        if (ten > 5) {
            ten = 5;
            unit += 10;
        }
        int total = (hundred * 100) + (ten * 10) + unit;
        System.out.println("итоговая сумма " + total +
                "\n" + "количестово купюр номиналом 100 $ " + hundred +
                "\n" + "количестово купюр номиналом 10 $ " + ten +
                "\n" + "количестово купюр номиналом 1 $ " + unit);
        System.out.println("\n");
    }
}

