package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        String filePath = ".\\.gitignore";

        File file = new File(filePath);
        try {
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            throw new RuntimeException("Error", e);
        }
        File dir = new File("./src/com");
        System.out.println(dir.isDirectory());
        String[] list = dir.list();

    /*    if (list != null) {
            for (String name : list) {
                System.out.println(name);
            }
        }*/

        try (FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println(fis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        printAllFiles(dir, 0);
        System.out.println(calculate(3, 3));
        System.out.println(power(3, 3));
    }


    private static void printAllFiles(File dir, int indent) {
        File[] files = dir.listFiles();
        assert files != null;
        for (File element : files) {
            for (int i = 0; i < indent; i++) {
                System.out.print("    ");
            }
            if (element.isDirectory()) {
                System.out.println("Directory: " + element.getName());
                printAllFiles(element, indent + 1);
            } else {
                System.out.println("FileName " + element.getName());
            }
        }
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    private static double calculate(int x, int n) throws ArithmeticException {
        if (x == 0 && n == 0) {
            throw new ArithmeticException("Невалидные входные данные: Неопределенность типа 0^0");
        }

        if (n < 0) {
            throw new ArithmeticException("Невалидные входные данные: Факториал из отрицательного числа!");
        }

        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (x == 0) {
            return 0;
        }
        return power(x, n);
    }

    private static double power(int x, int n) {
        if (n == 1) return x;
        return x * power(x, n - 1);
    }
}