package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("Task 1 - Reverse of array [1,7] in [7,1]");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array");
        print(intArray);
        System.out.println("\nReverse array");
        int temp = 0;
        for (int i = 0; i < intArray.length / 2; i++) {
            temp = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        print(intArray);

        System.out.println("\n\nTask 2 - Display of array product  [0,9] except 0,9");
        int length = 10;
        intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= intArray[i];
            System.out.print(i == length - 2 ? (intArray[i] + " = ") : (intArray[i] + " * "));
        }
        System.out.print(product);

        System.out.println("\n\nTask 3 - Remove elements from array  [0,1]");
        length = 15;
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Original array");
        int counter = 8;
        for (double num : doubleArray) {
            System.out.printf("%.2f ", num);
            counter--;
            if (counter == 0) {
                System.out.println();
            }
        }
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > doubleArray[(length / 2)]) {
                doubleArray[i] = 0;
            }
        }
        System.out.println("\nChanged array");
        counter = 7;
        for (double num : doubleArray) {
            System.out.printf("%.2f ", num);
            counter--;
            if (counter == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\nTask 4 - Display elements like stairsteps in reverse order");
        int index = 0;
        char[] arrayChar = new char[15];
        for (char i = 'L'; i <= 'Z'; i++) {
            arrayChar[index] = i;
            index++;
        }
        for (int i = 14; i >= 0; i--) {
            for (int j = 14; j >= i; j--) {
                System.out.print(arrayChar[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 5 - Generate unique elements [60,100]");
        intArray = new int[41];
        fillMassiveInt(intArray, 100, 60);
        sortBubble(intArray);
        counter = 10;
        for (int num : intArray) {
            System.out.printf("%3d ", num);
            counter--;
            if (counter == 0) {
                System.out.println();
                counter = 10;
            }
        }

        System.out.println("\n\nTask 6 - Shift elements of array");
        String[] A = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        System.out.println("Original array, length - " + A.length);
        int i = 0;
        for (String num : A) {
            System.out.print(num + " ");
        }
        int lengthArrayB = 0;
        for (i = 0; i < A.length; i++) {
            if (!A[i].isEmpty()) {
                lengthArrayB++;
            }
        }
        String[] B = new String[lengthArrayB];
        int j = 0;
        i = 0;
        while (i < A.length) {
            if (!A[i].isBlank()) {
                System.arraycopy(A, i, B, j, 1);
                j++;
            }
            i++;
        }
        System.out.println("\nArray is copied without 'null', length - " + lengthArrayB);
        for (String num : B) {
            System.out.print(num + " ");
        }
    }

    public static void fillMassiveInt(int[] array, int topLimit, int lowLimit) {
        System.out.println("New massive is created random, length - " + array.length);
        int i = 0;
        int max = topLimit - lowLimit;
        while (i < array.length) {
            int randomNum = lowLimit + (int) (Math.random() * (max + 1));
            array[i] = randomNum;
            boolean isEqual = true;
            for (int j = 0; j < i; j++) {
                if (Math.abs(array[i]) == Math.abs(array[j])) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                i++;
            }
        }
    }

    private static void sortBubble(int[] array) {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int j = 1; j < array.length; j++) {
                if (Math.abs(array[j - 1]) > Math.abs(array[j])) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    isSort = false;
                }
            }
        }
    }

    private static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
