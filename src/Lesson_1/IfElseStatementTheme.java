package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Перевод псевдокода на язык Java");
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

        System.out.println("\n"+"Задание №2 - Поиск max и min числа");
        int firstNumber = 45;
        int secondNumber = 55;
        if (firstNumber > secondNumber) {
            System.out.println("максимальное число " + firstNumber);
        } else {
            System.out.println("максимальное число " + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println("минимальное число  " + firstNumber);
        }

        System.out.println("\n"+"Задание №3 - Работа с числом");
        int numeric = 15;
        if (numeric == 0) {
            System.out.println(numeric + " is null");
        } else {
            if (numeric > 0) {
                System.out.println(numeric + " is positive");
            } else {
                System.out.println(numeric + " is negative");
            }
            if (numeric % 2 == 0) {
                System.out.println(numeric + " is even");
            } else {
                System.out.println(numeric + " is odd");
            }
        }

        System.out.println("\n"+"Задание №4 - Поиск одинаковых цифр в числах");
        String firstNumeric = "131";
        char oneOfFirst = firstNumeric.charAt(0);
        char twoOfFirst = firstNumeric.charAt(1);
        char threeOfFirst = firstNumeric.charAt(2);
        String secondNumeric = "411";
        char oneOfSecond = secondNumeric.charAt(0);
        char twoOfSecond = secondNumeric.charAt(1);
        char threeOfSecond = secondNumeric.charAt(2);
        System.out.println("Число N " + firstNumeric + "\n" + "Число M " + secondNumeric);
        if (oneOfFirst == oneOfSecond) {
            System.out.println("В числах firstNumeric и secondNumeric одинаковые цифры стоят в первом разряде - "
                    + oneOfFirst + " и " + oneOfSecond);
        }
        if (twoOfFirst == twoOfSecond) {
            System.out.println("В числах firstNumeric и secondNumeric одинаковые цифры стоят во втором разряде - "
                    + twoOfFirst + " и " + twoOfSecond);
        }
        if (threeOfFirst == threeOfSecond) {
            System.out.println("В числах firstNumeric и secondNumeric одинаковые цифры стоят в третьем разряде - "
                    + threeOfFirst + " и " + threeOfSecond);
        }

        System.out.println("\n"+"Задание №5 - Определение буквы, числа или символа по их коду");
        char originalCode = '\u0057';
        if (originalCode >= 0 && originalCode < 48 && originalCode >= 58 && originalCode < 65
                && originalCode >= 123 && originalCode <= 127) {
            System.out.println(originalCode + " переменная является не буквой и не число");
        } else if (originalCode >= 48 && originalCode < 58) {
            System.out.println(originalCode + " является числом");
        } else if (originalCode >= 65 && originalCode < 91) {
            System.out.println(originalCode + " является заглавной буквой");
        } else if (originalCode >= 61 && originalCode < 123) {
            System.out.println(originalCode + " является маленькой буквой");
        }

        System.out.println("\n"+"Задание №6 - Определение суммы вклада и начисленных банком %");
        int sum = 300_000;
        if (sum < 100_000) {
            double interest = sum * 0.05;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент "
                    + (int) interest + "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum < 300_000 && sum > 100_000) {
            double interest = sum * 0.07;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент "
                    + (int) interest + "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum >= 300_000) {
            double interest = sum * 0.1;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент "
                    + (int) interest + "\n" + "Итоговая сумма " + ((int) interest + sum));
        }

        System.out.println("\n"+"Задание №7 - Определение оценки по предметам");
        int historyBall = 59;
        String historySubject = "History";
        String programmingSubject = "Programming";
        int programmingBall = 91;
        int markProgramming = 1;
        int markHistory = 1;
        int amountSubject = 2;
        //определение оценки в зависимости от бала "история"
        if (historyBall <= 60) {
            int markH = 2;
            markHistory = markH;
            System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markH);
        } else if (historyBall > 60 && historyBall <= 73) {
            int markH = 3;
            markHistory = markH;
            System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markH);
        } else if (historyBall > 73 && historyBall <= 91) {
            int markH = 4;
            markHistory = markH;
            System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markH);
        } else if (historyBall > 91) {
            int markH = 5;
            markHistory = markH;
            System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markH);
        }
        //определение оценки в зависимости от бала "програмирование"
        if (programmingBall <= 60) {
            int markP = 2;
            markProgramming = markP;
            System.out.println("Предмет " + programmingSubject + " Ваша оценка по истории - " + markP);
        } else if (programmingBall > 60 && programmingBall <= 73) {
            int markP = 3;
            markProgramming = markP;
            System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markP);
        } else if (programmingBall > 73 && programmingBall <= 91) {
            int markP = 4;
            markProgramming = markP;
            System.out.println("Предмет " + programmingSubject + " Ваша оценка по истории - " + markP);
        } else if (programmingBall > 91) {
            int markP = 5;
            markProgramming = markP;
            System.out.println("Предмет " + programmingSubject + " Ваша оценка по истории - " + markP);
        }
        //определение среднего бала
        int middleBall = (markProgramming + markHistory) / amountSubject;
        int midPercent = (historyBall + programmingBall) / amountSubject;
        System.out.println("Средний бал оценок по предметам - " + middleBall + "\n" + "Средний процент предметов - "
                + midPercent + " %"+"\n");

        System.out.println("Задание №8 - Посчитайте годовую прибыль");
        int SpentLent = 5000;
        // выручка за месяц
        int proceed = 13000 - 9000;
        int mouths = 12;
        // аренда за год
        int LentForYear = SpentLent * mouths;
        int ProceedForYear = proceed * mouths;
        // чистая прибыль за год
        int profit = ProceedForYear - LentForYear;
        if (profit >= 0) {
            System.out.println("Прибыль за год составила  " + profit + " руб." + " +");
        } else if (profit < 0) {
            System.out.println("Прибыль за год составила " + profit + " руб.");
        }

        System.out.println("\n"+"Задание №9 - Подсчет количества банкнот");
        int amount = 567;
        int hundred = amount / 100;
        int ten = (amount / 10) % 10;
        int unit = amount % 10;
        if (ten > 5) {
            ten = 5;
            unit += 10;
        }
        int total = (hundred * 100) + (ten * 10) + unit;
        System.out.println("итоговая сумма " + total + "\n" + "количестово купюр номиналом 100 $ " + hundred +
                "\n" + "количестово купюр номиналом 10 $ " + ten + "\n" + "количестово купюр номиналом 1 $ " + unit);
    }
}

