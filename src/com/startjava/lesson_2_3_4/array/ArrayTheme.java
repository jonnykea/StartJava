package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("Task 1 - Reverse of array [1,7] in [7,1]");
        int length = 7;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array");
        print(intArray);
        System.out.println("\nReverse array");
        int temp = 0;
        for (int i = 0; i < length / 2; i++) {
            temp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = temp;
        }
        print(intArray);

        System.out.println("\n\nTask 2 - Display of array product  [0,9] except 0,9");
        length = 10;
        intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= intArray[i];
            System.out.print(intArray[i]);
            System.out.print(intArray[i] + i == length - 2 ? (" = ") : (" * "));
        }
        System.out.print(product);

        System.out.println("\n\nTask 3 - Remove elements from array  [0,1]");
        length = 15;
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Original array");
        double middleCell = doubleArray[length / 2];
        print(doubleArray, 8);
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleCell) {
                doubleArray[i] = 0;
            }
        }
        System.out.println("\nChanged array");
        print(doubleArray, 8);

        System.out.println("\n\nTask 4 - Display elements like stairsteps in reverse order");
        int index = 0;
        char[] charArray = new char[15];
        for (char i = 'L'; i <= 'Z'; i++) {
            charArray[index] = i;
            index++;
        }
        for (int i = 14; i >= 0; i--) {
            for (int j = 14; j >= i; j--) {
                System.out.print(charArray[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 5 - Generate unique elements [60,100]");
        intArray = new int[41];
        fillArrayInt(intArray, 100, 60);
        sortBubble(intArray);
        int counter = 10;
        for (int num : intArray) {
            System.out.printf("%3d ", num);
            counter--;
            if (counter == 0) {
                System.out.println();
                counter = 10;
            }
        }

        System.out.println("\n\nTask 6 - Shift elements of array");
        String[] srcArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        System.out.println("Original array, length - " + srcArray.length);
        for (String num : srcArray) {
            System.out.print(num + " ");
        }
        int lengthArrayB = 0;
        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].isEmpty()) {
                lengthArrayB++;
            }
        }
        String[] dstArray = new String[lengthArrayB];
        int startSrc = 0;
        int endSrc = 0;
        int startDst = 0;
        int sizeToCopy;
        boolean wasAnyNotBlank = false;
        for (int i = 0; i < srcArray.length; i++) {
            if (srcArray[i].isBlank()) {
                if (wasAnyNotBlank) {
                    sizeToCopy = endSrc - startSrc + 1;
                    System.arraycopy(srcArray, startSrc, dstArray, startDst, sizeToCopy);
                    startDst += sizeToCopy;
                    wasAnyNotBlank = false;
                }
            } else { // if not blank
                if (!wasAnyNotBlank) {
                    wasAnyNotBlank = true;
                    startSrc = i;
                }
                endSrc = i;
            }
        }
        if (wasAnyNotBlank) {
            sizeToCopy = endSrc - startSrc + 1;
            System.arraycopy(srcArray, startSrc, dstArray, startDst, sizeToCopy);
        }

        System.out.println("\nArray is copied without 'null', length - " + lengthArrayB);

        for (String num : dstArray) {
            System.out.print(num + " ");
        }
    }

    private static void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


    public static void fillArrayInt(int[] array, int topLimit, int lowLimit) {
        System.out.println("New massive is created random, length - " + array.length);
        int i = 0;
        int max = topLimit - lowLimit;
        while (i < array.length) {
            int randomNum = lowLimit + (int) (Math.random() * (max + 1));
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (randomNum == array[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                array[i] = randomNum;
                i++;
            }
        }
    }

    private static void sortBubble(int[] array) {
        boolean isAssorted = false;
        while (!isAssorted) {
            isAssorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void print(double[] array, int counter) {
        for (double num : array) {
            System.out.printf("%.2f ", num);
            counter--;
            if (counter == 0) {
                System.out.println();
            }
        }
    }
}
