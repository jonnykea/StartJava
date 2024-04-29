package tasks.andreyArrays;

import java.util.Random;
import java.util.Scanner;

public class TaskTwoDimensionalArray {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int a;
            int b;
            System.out.print("""
                    \nВведите числа - "a, b" для нижней и верхней границы двумерного массива
                    Например: -1 20 - массив заполниться случайными числами в этом диапозоне
                    """);
            try {
                // запрашиваем переменнные с консоли
                String expression = console.nextLine();
                // извлекаем переменнные с выражения через " "
                String[] partsExpression = expression.split(" ");
                // если елементов больше 3 бросаем ошибку
                if (partsExpression.length != 2) {
                    throw new NumberFormatException("Не корректный ввод, должна быть запись ввиде: -1 20");
                }
                try {
                    // преобразуем в целочисленные переменные типа int
                    a = Integer.parseInt(partsExpression[0]);
                    b = Integer.parseInt(partsExpression[1]);
                    // если введены вместо чисел другие знаки бросаем ошибку
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Ошибка - не корректный ввод, числа должны быть цифры ");
                }
                // создаем двумерный массив
                Integer[][] arrayNumbers = new Integer[4][5];
                // заполняем случайными числами
                fillArraysRandomNumbers(a, b, arrayNumbers);
                // выводим на экран
                printArrays(arrayNumbers);
                // считаем сумму максимальных элементов в каждом столбце
                printSumMaxElementInRows(arrayNumbers);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            // запрашиваем - нужно ли повторить вычисления
        } while (isNext());
    }

    private static void fillArraysRandomNumbers(int a, int b, Integer[][] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers[0].length; j++) {
                Random rand = new Random();
                try {
                    arrayNumbers[i][j] = rand.nextInt((b - a) + 1) + a;
                } catch (IllegalArgumentException e) {
                    throw new NumberFormatException("Ошибка - не корректный ввод, должна быть запись ввиде: -1 20 ");
                }
            }
        }
    }

    private static void printArrays(Integer[][] arrayNumbers) {
        System.out.print("\nПечатаем массив на экран\n");
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 5; j++) {//идём по столбцам
                System.out.printf("%4d", arrayNumbers[i][j]);
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    private static void printSumMaxElementInRows(Integer[][] arrayNumbers) {
        System.out.print("\nВыводим макисамальные значения для каждого столбца\n");
        int maxNumberFirstRow = 0;
        int maxNumberSecondRow = 0;
        int maxNumberThirdRow = 0;
        int maxNumberFourthRow = 0;
        int maxNumberFifthRow = 0;
        int sumMaxElementsInRows;
        for (int i = 0; i < 5; i++) { //идём по строкам
            //обнуляем значение при переходе на следующей столбец
            int maxRowNumber = 0;
            for (int j = 0; j < 4; j++) { //идём по столбцу
                if (arrayNumbers[j][i] > maxRowNumber)
                    maxRowNumber = arrayNumbers[j][i];
            }

            if (i == 0) {
                maxNumberFirstRow = maxRowNumber;
            } else if (i == 1) {
                maxNumberSecondRow = maxRowNumber;
            } else if (i == 2) {
                maxNumberThirdRow = maxRowNumber;
            } else if (i == 3) {
                maxNumberFourthRow = maxRowNumber;
            } else {
                maxNumberFifthRow = maxRowNumber;
            }
        }
        sumMaxElementsInRows = maxNumberFirstRow + maxNumberSecondRow + maxNumberThirdRow + maxNumberFourthRow + maxNumberFifthRow;

        System.out.print("\nМаксимальный элемент в первом столбце = " + maxNumberFirstRow + "\n");
        System.out.print("Максимальный элемент во втором столбце = " + maxNumberSecondRow + "\n");
        System.out.print("Максимальный элемент в третьем столбце = " + maxNumberThirdRow + "\n");
        System.out.print("Максимальный элемент в четвертом столбце = " + maxNumberFourthRow + "\n");
        System.out.print("Максимальный элемент в пятом столбце = " + maxNumberFifthRow + "\n");
        System.out.print("\nСумма максимальных элементов = " + sumMaxElementsInRows);
    }

    private static boolean isNext() {
        System.out.println("\nХотите запустить программу еще раз? Введите yes или no... ");
        String answer = console.nextLine().toLowerCase();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                return true;
            }
            System.out.println("ввели некорректное слово. Введите yes или no...");
            answer = console.next().toLowerCase();
        }
        return false;
    }
}