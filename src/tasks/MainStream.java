package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        /*        реализовать метод через стрим int minValue(int[] values).
        Метод принимает массив цифр от 1 до 9, надо выбрать уникальные и вернуть минимально возможное число,
        составленное из этих уникальных цифр. Не использовать преобразование в строку и обратно.
        Например {1,2,3,3,2,3} вернет 123, а {9,8} вернет 89*/

        int[] array = {1, 2, 3, 8, 9, 7, 0, 2, 2, 9, 9};
        System.out.println(minValue(array));

        /*        реализовать метод List<Integer> oddOrEven(List<Integer> integers) если сумма всех чисел нечетная -
        удалить все нечетные, если четная - удалить все четные. Сложность алгоритма должна быть O(N).
        Optional - решение в один стрим.*/

        List<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 3, 9, 5, 2, 1, 7, 6));
        System.out.println(oddOrEvenVariant1(list));
        System.out.println(oddOrEvenVariant2(list));

        //реализовать сортировку мапы по значениям
        Map<String, Integer> nonSortedMap = Map.of(
                "Three", 3,
                "Four", 4,
                "Five", 5,
                "Two", 2,
                "One", 1);

        Map<String, Integer> newMap = sorted(nonSortedMap);

        sorted(nonSortedMap).entrySet().forEach(System.out::println);

        sortedWithPrint(nonSortedMap);
    }


    static int minValue(int[] values) {
        return Arrays.stream(values)
                .sorted()
                .distinct()
                .filter(x -> x > 0)
                .reduce(0, (total, i) -> (total * 10) + i);
    }

    static List<Integer> oddOrEvenVariant1(List<Integer> integers) {
        List<Integer> listOdd = new ArrayList<>(integers.size());
        List<Integer> listEven = new ArrayList<>(integers.size());
        Integer sum = integers.stream()
                .peek(i -> {
                    if (i % 2 == 0) {
                        listEven.add(i);
                    } else {
                        listOdd.add(i);
                    }
                })
                .reduce(0, Integer::sum);

        return sum % 2 == 0 ? listOdd : listEven;
    }


    static List<Integer> oddOrEvenVariant2(List<Integer> integers) {
        int sum = integers.stream().reduce(0, Integer::sum);
        boolean isSumEven = sum % 2 == 0;
        return integers.stream()
                .filter(i -> isSumEven == (i % 2 != 0))
                .collect(Collectors.toList());
    }

    static Map<String, Integer> sorted(Map<String, Integer> nonSorted) {
        return nonSorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (first, conflict) -> first,
                        LinkedHashMap::new
                ));
    }
         /* .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue, TreeMap::new*/

    static void sortedWithPrint(Map<String, Integer> nonSorted) {
        nonSorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}