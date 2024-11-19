import java.util.ArrayList;

import java.util.HashMap;

import java.util.HashSet;

import java.util.List;

import java.util.Map;

public static void main(String[] agrs) {

    List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    printOddNumbers(numbers);

    printEvenNumbers(numbers);

    List<String> words = new ArrayList<>(List.of("яблоко", "банан", "яблоко", "груша", "банан", "виноград"));

    printUniqueWords(words);

    List<String> duplicates = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    countDuplicates(duplicates);

}

public static void printOddNumbers(List<Integer> numbers) {

    System.out.println("Нечетные числа:");

    numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

}

public static void printEvenNumbers(List<Integer> numbers) {

    System.out.println("Четные числа:");

    numbers.stream().filter(num -> num % 2 == 0).distinct().sorted().forEach(System.out::println);

}

public static void printUniqueWords(List<String> words) {

    System.out.println("Уникальные слова:");

    new HashSet<>(words).forEach(System.out::println);

}

public static void countDuplicates(List<String> words) {
    System.out.println("Количество дубликатов:");
    Map<String, Integer> wordCountMap = new HashMap<>();
    words.forEach(word -> wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1));
    wordCountMap.forEach((word, count) -> {
        if (count > 1) {
            System.out.println("Слово: " + word + " повторяется " + (count - 1) + " раз(а).");
        }
    });
}

