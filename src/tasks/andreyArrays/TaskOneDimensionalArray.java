package tasks.andreyArrays;

import java.util.Random;
import java.util.Scanner;

public class TaskOneDimensionalArray {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int a;
            int b;
            System.out.print("""
                    \nВведите числа - "a, b" для нижней и верхней границы одномерного массива
                    Например: -1 20 - массив заполниться случайными числами в этом диапозоне
                    """);
            // запрашиваем переменнные с консоли
            String expression = console.nextLine();
            try {
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
                Integer[] arrayNumbers = new Integer[10];
                // заполняем случайными числами
                fillArraysRandomNumbers(a, b, arrayNumbers);
                // выводим на экран
                printArray(arrayNumbers);
                // считаем сумму максимальных элементов в каждом столбце
                printNumberNegativeElementsInArray(arrayNumbers);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            // запрашиваем - нужно ли повторить вычисления
        } while (isNext());
    }

    private static void fillArraysRandomNumbers(int a, int b, Integer[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            Random rand = new Random();
            try {
                arrayNumbers[i] = rand.nextInt((b - a) + 1) + a;
            } catch (IllegalArgumentException e) {
                throw new NumberFormatException("Ошибка - не корректный ввод, должна быть запись ввиде: -1 20 ");

            }
        }
    }

    private static void printArray(Integer[] arrayNumbers) {
        System.out.print("\nПечатаем массив на экран\n");
        for (Integer arrayNumber : arrayNumbers) {
            System.out.printf("%4d", arrayNumber);
        }
    }

    private static void printNumberNegativeElementsInArray(Integer[] arrayNumbers) {
        System.out.print("\n\nСчитаем отрицательные элементы");
        // инициализируем счетчик
        int numberNegativeElements = 0;
        for (Integer arrayNumber : arrayNumbers) {
            if (arrayNumber < 0) {
                numberNegativeElements++;
            }
        }
        System.out.print("\nКоличество отрицательных элементов в массиве = " + numberNegativeElements + "\n");
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