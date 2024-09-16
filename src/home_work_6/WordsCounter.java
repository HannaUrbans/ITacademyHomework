package home_work_6;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static home_work_6.CollectionsGenerator.generateHashMap;
import static home_work_6.CollectionsGenerator.generateSet;

public class WordsCounter {
    public static void main(String[] args) throws IOException {
        File filePath = new File("HomeWork/src/home_work_6/Война и мир_книга.txt");

        Set<String> words = generateSet(filePath);
        for (String word : words) {
            //System.out.println(word);
        }
        long totalQuantityOfUsedWords = countUsedWords(words);
        System.out.println("Всего использовано слов: " + totalQuantityOfUsedWords);

        //возвращается Map
        Map<String, Integer> repeatedWordsUnsorted = generateHashMap(filePath);
        //возвращается LinkedMap, поэтому вызываем на классе SortUtil, а не на объекте типа Map
        Map<String, Integer> repeatedWordsSorted = SortUtil.sortMapByValue(repeatedWordsUnsorted);

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько строк отобразить");
        int quantityOfLinesToDisplay = input.nextInt();

        if (quantityOfLinesToDisplay >= totalQuantityOfUsedWords) {
            throw new IllegalArgumentException("Количество строк для вывода превышает количество слов в тексте");
        }
        if (quantityOfLinesToDisplay < 0) {
            throw new IllegalArgumentException("Введите положительное число");
        }

        Map<String, Integer> topRepeats = WordsCounter.displayTopRepeatedWords(quantityOfLinesToDisplay, repeatedWordsSorted);
        for (Map.Entry<String, Integer> entry : topRepeats.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Найти в тексте все использованные слова и поместить их в коллекцию Set.
     * прочитать текстовый файл и поместить текст из данного текстового файла в строку
     * строку обработать таким образом чтобы из неё можно было бы считывать слова
     * каждое полученное слово поместить в Set
     * вывести в консоль количество использованных слов
     */
    public static long countUsedWords(Set<String> generatedSet) throws IOException {
        return generatedSet.size();
    }

    /**
     * Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
     * Отсортировать по количеству.
     * Распечатать в консоль.
     */
    public static Map<String, Integer> displayTopRepeatedWords(int quantityOfLinesToDisplay, Map<String, Integer> sortedMap) {
        Map<String, Integer> specifiedListOfRepeatedWords = new LinkedHashMap<>();

        int i = 0;
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (i == quantityOfLinesToDisplay) {
                break;
            }
            specifiedListOfRepeatedWords.put(entry.getKey(), entry.getValue());
            i++;
        }
        return specifiedListOfRepeatedWords;
    }
}
