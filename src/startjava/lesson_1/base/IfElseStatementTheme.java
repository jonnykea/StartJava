package startjava.lesson_1.base;

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

        System.out.println("\nЗадание №2 - Поиск max и min числа");
        int firstNumber = 45;
        int secondNumber = 55;
        if (firstNumber > secondNumber) {
            System.out.println("максимальное число " + firstNumber);
            System.out.println("минимальное число  " + secondNumber);
        } else {
            System.out.println("максимальное число " + secondNumber);
            System.out.println("минимальное число  " + firstNumber);
        }

        System.out.println("\nЗадание №3 - Работа с числом");
        int srcNum = 15;
        if (srcNum == 0) {
            System.out.println(srcNum + " is null");
        } else {
            if (srcNum > 0) {
                System.out.println(srcNum + " is positive");
            } else {
                System.out.println(srcNum + " is negative");
            }
            if (srcNum % 2 == 0) {
                System.out.println(srcNum + " is even");
            } else {
                System.out.println(srcNum + " is odd");
            }
        }

        System.out.println("\nЗадание №4 - Поиск одинаковых цифр в числах");
        int number1 = 523;
        int threeOfFirst = number1 % 10;
        int twoOfFirst = (number1 / 10) % 10;
        int oneOfFirst = number1 / 100;
        int number2 = 122;
        int threeOfSecond = number2 % 10;
        int twoOfSecond = (number2 / 10) % 10;
        int oneOfSecond = number2 / 100;
        if (oneOfFirst == oneOfSecond) {
            System.out.println("В числах " + number1 + " и " + number2 + " одинаковая цифра " + oneOfFirst +
                    " стоит в первом разряде");
        }
        if (twoOfFirst == twoOfSecond) {
            System.out.println("В числах " + number1 + " и " + number2 + " одинаковая цифра " + twoOfFirst +
                    " стоит во втором разряде");
        }
        if (threeOfFirst == threeOfSecond) {
            System.out.println("В числах " + number1 + " и " + number2 + " одинаковая цифра " + threeOfFirst +
                    " стоит в третьем разряде");
        }

        System.out.println("\nЗадание №5 - Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " является числом");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + " является заглавной буквой");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + " является маленькой буквой");
        } else {
            System.out.println(someChar + " переменная является не буквой и не число");
        }

        System.out.println("\nЗадание №6 - Определение суммы вклада и начисленных банком %");
        double sum = 300_000;
        double interest = 0;
        if (sum < 100_000) {
            interest = sum * 0.05;
        } else if (sum < 300_000 && sum > 100_000) {
            interest = sum * 0.07;
        } else if (sum >= 300_000) {
            interest = sum * 0.1;
        }
        System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент "
                + interest + "\n" + "Итоговая сумма " + (interest + sum));

        System.out.println("\nЗадание №7 - Определение оценки по предметам");
        int historyBall = 59;
        String historySubject = "History";
        String programmingSubject = "Programming";
        int programmingBall = 91;
        int markProgramming = 1;
        int markHistory = 1;
        int amountSubject = 2;
        //определение оценки в зависимости от бала "история"
        if (historyBall <= 60) {
            markHistory = 2;
        } else if (historyBall > 60 && historyBall <= 73) {
            markHistory = 3;
        } else if (historyBall > 73 && historyBall <= 91) {
            markHistory = 4;
        } else if (historyBall > 91) {
            markHistory = 5;
        }
        //определение оценки в зависимости от бала "програмирование"
        if (programmingBall <= 60) {
            markProgramming = 2;
        } else if (programmingBall > 60 && programmingBall <= 73) {
            markProgramming = 3;
        } else if (programmingBall > 73 && programmingBall <= 91) {
            markProgramming = 4;
        } else if (programmingBall > 91) {
            markProgramming = 5;
        }
        //определение среднего бала
        int middleBall = (markProgramming + markHistory) / amountSubject;
        int midPercent = (historyBall + programmingBall) / amountSubject;
        System.out.println("Предмет " + historySubject + " Ваша оценка по истории - " + markHistory +
                "\nПредмет " + programmingSubject + " Ваша оценка по истории - " + markProgramming +
                "\nСредний бал оценок по предметам - " + middleBall + "\n" + "Средний процент предметов - "
                + midPercent + " %" + "\n");

        System.out.println("Задание №8 - Посчитайте годовую прибыль");
        int spentLent = 5000;
        // выручка за месяц
        int proceed = 13000 - 9000;
        int mouths = 12;
        // аренда за год
        int lentForYear = spentLent * mouths;
        int proceedForYear = proceed * mouths;
        // чистая прибыль за год
        int profit = proceedForYear - lentForYear;
        if (profit >= 0) {
            System.out.println("Прибыль за год составила + " + profit + " руб.");
        } else if (profit < 0) {
            System.out.println("Прибыль за год составила " + profit + " руб.");
        }

        System.out.println("\nЗадание №9 - Подсчет количества банкнот");
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

