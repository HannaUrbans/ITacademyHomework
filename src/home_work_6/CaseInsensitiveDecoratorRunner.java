package home_work_6;

import home_work_6.utils.ISearchEngine;

public class CaseInsensitiveDecoratorRunner {
    public static void main(String[] args) {
        ISearchEngine searchEngine1 = new EasySearch();
        ISearchEngine searchEngine2 = new RegExSearch(true);
        CaseInsensitiveDecorator decoratedSearchEngine1 = new CaseInsensitiveDecorator(searchEngine1);
        CaseInsensitiveDecorator decoratedSearchEngine2 = new CaseInsensitiveDecorator(searchEngine2);
        String text = "Однако,   Мры в течение этого времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = "Мры";

        long count1 = decoratedSearchEngine1.search(text, word);
        long count2 = decoratedSearchEngine2.search(text, word);
        System.out.println("EasySearch");
        System.out.println("********************");
        System.out.println("Количество вхождений слова '" + word + "': " + count1);
        System.out.println();
        System.out.println("RegExSearch");
        System.out.println("********************");
        System.out.println("Количество вхождений слова '" + word + "': " + count2);
    }
}