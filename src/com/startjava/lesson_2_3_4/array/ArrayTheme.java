package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("Task 1 - Reverse of massive [1,7] [7,1]");
        int length = 7;
        int[] intMassive = new int[length];
        fillMassiveInt(intMassive, 7, 1);
        print(intMassive);

        sortBubble(intMassive);
        print(intMassive);

        sortBubbleReverse(intMassive);
        print(intMassive);

        System.out.println("\n\nTask 2 - Display of massive product  [0,9] except 0,9");
        length = 10;
        intMassive = new int[length];
        fillMassiveInt(intMassive, 9, 0);
        print(intMassive);
        System.out.println("");
        int product = 1;
        for (int i = 0; i <= length - 1; i++) {
            product *= (intMassive[i] == 0 || intMassive[i] == 9) ? 1 : intMassive[i];
            if (i == length - 1) {
                System.out.print(intMassive[i] + " = ");
            } else {
                System.out.print(intMassive[i] + " * ");}
        }
        System.out.print(product);

        System.out.println("\n\nTask 3 - Remove elements from massive  [0,1]");
        length = 15;
        double[] doubleMassive = new double[length];
        fillMassiveD(doubleMassive, 1, 0);
        System.out.println("Original massive");
        int counter = 8;
        for (double num : doubleMassive) {
            System.out.printf("%.3f ", num);
            counter--;
            if (counter == 0) {
                System.out.println("");
                counter = 8;
            }
        }
        for (int i = 0; i <= doubleMassive.length - 1; i++) {
            if (doubleMassive[i] > doubleMassive[6]) {
                doubleMassive[i] = 0;
            }
        }
        System.out.println("");
        System.out.println("Changed massive");
        counter = 7;
        for (double num : doubleMassive) {
            System.out.printf("%.3f ", num);
            counter--;
            if (counter == 0) {
                System.out.println("");
                counter = 7;
            }
        }

        System.out.println("\n\nTask 4 - Display elements like stairsteps in reverse order");
        length = 15;
        int index = 0;
        char[] massiveChar = new char[length];
        for (char i = 'L'; i <= 'Z'; i++) {
            massiveChar[index] = i;
            index++;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(massiveChar[j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nTask 5 - Generate unique elements [60,100]");
        length = 41;
        intMassive = new int[length];
        fillMassiveInt(intMassive, 100, 60);
        sortBubble(intMassive);
        counter = 10;
        for (int num : intMassive) {
            System.out.printf("%3d ", num);
            counter--;
            if (counter == 0) {
                System.out.println("");
                counter = 10;
            }
        }
    }

    public static void fillMassiveInt(int[] massive, int topLimit, int lowLimit) {
        System.out.println("New massive is created random, length - " + massive.length);
        int i = 0;
        int max = topLimit - lowLimit;
        int min = lowLimit;
        while (i <= massive.length - 1) {
            double random = Math.random();
            int secretNumber = min + (int) (random * (max + 1));
            massive[i] = secretNumber;
            boolean isEqual = true;
            for (int j = 0; j < i; j++) {
                if (Math.abs(massive[i]) == Math.abs(massive[j])) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                i++;
            }
        }
    }

    public static void fillMassiveD(double[] massive, int topLimit, int lowLimit) {
        System.out.println("New massive is created random, length - " + massive.length);
        int i = 0;
        int max = topLimit - lowLimit;
        int min = lowLimit;
        while (i <= massive.length - 1) {
            double random = Math.random();
            double secretNumber = min + (random * (max + 1));
            massive[i] = secretNumber;
            boolean isEqual = true;
            for (int j = 0; j < i; j++) {
                if (Math.abs(massive[i]) == Math.abs(massive[j])) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                i++;
            }
        }
    }

    private static void sortBubble(int[] massive) {
        System.out.println("\nRealize the bubble sorting by module");
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int j = 1; j <= massive.length - 1; j++) {
                if (Math.abs(massive[j - 1]) > Math.abs(massive[j])) {
                    int tmp = massive[j - 1];
                    massive[j - 1] = massive[j];
                    massive[j] = tmp;
                    isSort = false;
                }
            }
        }
    }

    private static void sortBubbleReverse(int[] massive) {
        System.out.println("\nRealize the reverse bubble sorting by module");
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int j = 1; j <= massive.length - 1; j++) {
                if (Math.abs(massive[j - 1]) < Math.abs(massive[j])) {
                    int tmp = massive[j - 1];
                    massive[j - 1] = massive[j];
                    massive[j] = tmp;
                    isSort = false;
                }
            }
        }
    }

    private static void print(int[] massive) {
        for (int num : massive) {
            System.out.print(num + " ");
        }
    }

    private static void printD(double[] massive) {
        for (double num : massive) {
            System.out.printf(" %.3f ", num);
        }
    }
}
