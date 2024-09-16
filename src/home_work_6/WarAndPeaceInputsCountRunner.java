package home_work_6;

import home_work_6.utils.ISearchEngine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static home_work_6.CollectionsGenerator.generateStringArray;

public class WarAndPeaceInputsCountRunner {
    private static String word1 = "война";
    private static String word2 = "и";
    private static String word3 = "мир";

    private static List<String> wordsToFind = new ArrayList<>();

    static
    {
        wordsToFind.add(word1);
        wordsToFind.add(word2);
        wordsToFind.add(word3);
    }

    public static void main(String[] args) throws IOException {
        File filePath = new File("HomeWork/src/home_work_6/Война и мир_книга.txt");
        String[] words = generateStringArray(filePath);

        System.out.println("Поиск с помощью EasySearch с учетом регистра");
        List<Long> res1 = countWarAndPeaceInputsEasySearchCS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res1.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res1.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res1.get(2));
        System.out.println("***************************");

        System.out.println("Поиск с помощью EasySearch без учета регистра");
        List<Long> res2 = countWarAndPeaceInputsEasySearchCIS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res2.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res2.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res2.get(2));
        System.out.println("***************************");

        System.out.println("Поиск с помощью RegExSearch с учетом регистра");
        List<Long> res3 = countWarAndPeaceInputsRegExSearchCS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res3.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res3.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res3.get(2));
        System.out.println("***************************");

        System.out.println("Поиск с помощью RegExSearch без учета регистра");
        List<Long> res4 = countWarAndPeaceInputsRegExSearchCIS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res4.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res4.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res4.get(2));
        System.out.println("***************************");

        System.out.println("Поиск с помощью SearchEngineCaseNormalizer с учетом регистра");
        List<Long> res5 = countWarAndPeaceInputsSearchEngineCaseNormalizerCS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res5.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res5.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res5.get(2));
        System.out.println("***************************");

        System.out.println("Поиск с помощью SearchEngineCaseNormalizer без учета регистра");
        List<Long> res6 = countWarAndPeaceInputsSearchEngineCaseNormalizerCIS(Arrays.toString(words));
        System.out.print("Количество упоминаний слова " + word1 + ": ");
        System.out.println(res6.get(0));
        System.out.print("Количество упоминаний слова " + word2 + ": ");
        System.out.println(res6.get(1));
        System.out.print("Количество упоминаний слова " + word3 + ": ");
        System.out.println(res6.get(2));
        System.out.println("***************************");
    }

    //4.1 с учетом регистра
    public static List<Long> countWarAndPeaceInputsEasySearchCS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp1 = new EasySearch();
        for (String word : wordsToFind) {
            wordCount = tmp1.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }

    //4.1 без учета регистра (используется декоратор из зад. 4.4)
    public static List<Long> countWarAndPeaceInputsEasySearchCIS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp1 = new EasySearch();
        CaseInsensitiveDecorator tmp2 = new CaseInsensitiveDecorator(tmp1);
        for (String word : wordsToFind) {
            wordCount = tmp2.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }

    //4.2 с учетом регистра
    public static List<Long> countWarAndPeaceInputsRegExSearchCS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp3 = new RegExSearch(false);
        for (String word : wordsToFind) {
            wordCount = tmp3.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }


    //4.2 без учета регистра
    public static List<Long> countWarAndPeaceInputsRegExSearchCIS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp4 = new RegExSearch(true);
        for (String word : wordsToFind) {
            wordCount = tmp4.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }

    //4.5 c учетом регистра
    public static List<Long> countWarAndPeaceInputsSearchEngineCaseNormalizerCS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp1 = new RegExSearch(false);
        SearchEngineCaseNormalizer tmp2 = new SearchEngineCaseNormalizer(tmp1);
        for (String word : wordsToFind) {
            wordCount = tmp2.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }

    //4.5 без учета регистра
    public static List<Long>  countWarAndPeaceInputsSearchEngineCaseNormalizerCIS(String text) {
        List<Long> foundWordsQuantity = new ArrayList<>();
        long wordCount = 0;

        ISearchEngine tmp1 = new RegExSearch(true);
        SearchEngineCaseNormalizer tmp2 = new SearchEngineCaseNormalizer(tmp1);
        for (String word : wordsToFind) {
            wordCount = tmp2.search(text, word);
            foundWordsQuantity.add(wordCount);
        }

        return foundWordsQuantity;
    }
}
