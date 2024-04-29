package tasks.thread;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static tasks.ReadFile.sorted;

public class ThreadReadFile {
    //static ArrayList<File> FilesFind = new ArrayList<>();
    static Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        final String directoryPath = "C:\\Users\\kochukov.e\\Desktop\\test";
        File directory = new File(directoryPath);
        // Убедимся, что директория найдена и это реально директория, а не файл.
        if (directory.exists() && directory.isDirectory()) {
            processDirectory(directory);
        } else {
            System.out.println("Не удалось найти директорию по указанному пути.");
        }
        Map<String, Integer> sorted = sorted(concurrentMap);

        // выводим топ 10 - самых встречаемых слов
        sorted.entrySet().stream()
                .limit(10)
                .forEach(entry -> System.out.printf("Word - '%5s', Count - '%s'\n", entry.getKey(), entry.getValue()));
        System.out.println("Потоки закончили работу");
    }

    private static void processDirectory(File directory) {
        // Получаем список доступных файлов в указанной директории.
        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Нет доступных файлов для обработки.");
            return;
        } else {
            System.out.println("Количество файлов для обработки: " + files.length);
        }

        // Непосредственно многопоточная обработка файлов.
        // вместо фиксированного числа потоков можно написать Runtime.getRuntime().availableProcessors()
        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Запускаем многопоточный режим с количеством потоков - " + nThreads);
        ExecutorService service = Executors.newFixedThreadPool(nThreads);
        for (final File f : files) {
            if (!f.isFile()) {
                continue;
            }

            service.execute(() -> {
                try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
                    int lines = 0;
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (!line.isEmpty()) {
                            // split line by "/n, "
                            // String[] parts = line.split("(?=\s+|\\n| , +)|\\.");
                            String[] parts = line.split(" |,");
                            Arrays.stream(parts)
                                    .forEach(s -> {
                                        concurrentMap.computeIfPresent(s.trim(), (key, value) -> value + 1);
                                        concurrentMap.putIfAbsent(s.trim(), 1);
                                    });
                        }
                        ++lines;
                    }
                    System.out.println("Поток: " + Thread.currentThread().getName() +
                            ". Файл: " + f.getName() + ". Количество строк: " + lines);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        // Новые задачи более не принимаем, выполняем только оставшиеся.
        service.shutdown();
        // Ждем завершения выполнения потоков не более 10 минут.
        try {
            service.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

/*    public static void getFilesList(String nameDirectory) {
        File f = new File(nameDirectory);
        for (File str : f.listFiles()) {
            if (str.isFile()) {
                FilesFind.add(str);
            } else if (str.isDirectory()) {
                getFilesList(str.getAbsolutePath());
            }
        }
    }*/
}