package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizerRunner {

    public static void main(String[] args) {
        ISearchEngine tmp = new RegExSearch(true);
        ISearchEngine decoratedSearch = new SearchEngineCaseNormalizer(tmp);

        String text = "бабушка, бабушку, бабушки";
        String word = "Бабушка";

        long count = decoratedSearch.search(text, word);
        System.out.println("Количество вхождений слова '" + word + "': " + count);
        // System.out.println(cutWordEnding(word));
    }


}