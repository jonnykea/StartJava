package tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ReadFile {
    static Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
    //static Map<String, Integer> concurrentMap = new TreeMap<>(Comparator.reverseOrder());

    public static void main(String[] args) {

        final String directoryPath = "C:\\Users\\kochukov.e\\Desktop\\test";
        File directory = new File(directoryPath);

        // Убедимся, что директория найдена и это реально директория, а не файл.
        if (directory.exists() && directory.isDirectory()) {
            // run process read file by lines and put in Map (key - string, value - integer - how often word repeats)
            processDirectory(directory);
        } else {
            System.out.println("Не удалось найти директорию по указанному пути.");
        }

        Map<String, Integer> sorted = sorted(concurrentMap);

        // выводим топ 10 - самых встречаемых слов
        sorted.entrySet().stream()
                .limit(10)
                .forEach(entry -> System.out.printf("Word - '%5s', Count - '%s'\n", entry.getKey(), entry.getValue()));
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

        for (final File f : files) {
            if (!f.isFile()) {
                continue;
            }
            try
                //(BufferedReader reader = new BufferedReader(new FileReader(f)))
                    (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f),
                            StandardCharsets.UTF_8))) {
                // calculate amount line
                int lines = 0;
                String line;
                // read file by lines
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
        }
    }

    public static Map<String, Integer> sorted(Map<String, Integer> nonSorted) {
        return nonSorted.entrySet()
                .stream()
                .filter(k -> !Objects.equals(k.getKey(), ""))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                //.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                // .limit(10)
                .collect(Collectors.toMap(
                        stringIntegerEntry -> stringIntegerEntry.getKey(),
                        stringIntegerEntry1 -> stringIntegerEntry1.getValue(),
                        (first, conflict) -> first,
                        () -> new LinkedHashMap<String, Integer>()
                ));
    }
}