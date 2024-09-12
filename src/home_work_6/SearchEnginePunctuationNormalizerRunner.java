package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEnginePunctuationNormalizerRunner {
    public static void main(String[] args) {
        //ISearchEngine searchEngine = new EasySearch();
        ISearchEngine searchEngine = new RegExSearch(false);
        ISearchEngine decoratedSearch = new SearchEnginePunctuationNormalizer(searchEngine);

        String text = "Однако,   Мры в течение этого времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = "мры";

        long count = decoratedSearch.search(text, word);
        System.out.println("Количество вхождений слова '" + word + "': " + count);
    }
}
