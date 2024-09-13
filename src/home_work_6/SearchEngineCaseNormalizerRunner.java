package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizerRunner {

    public static void main(String[] args) {

        //этот метод не предусматривает того, что в середине (!) слова будут буквы разных регистров
        //этот метод не работает если слово оканчивается на буквы из окончания творительного падежа: ром, водолей, запой
        ISearchEngine tmp = new RegExSearch(true);
        ISearchEngine tmp2 = new CaseInsensitiveDecorator(tmp);
        ISearchEngine decoratedSearchEngine = new SearchEngineCaseNormalizer(tmp2);

        String text = "Бабушка, бабушку, Бабушки И и по По по иии  ИИИ под Под пода бабушка бабушкой окно  окНа зонт зонта рома ром домой ложка ложку пароход парохода управдомом управдома управдом";
        String[] words = {"Бабушку", "и", "иии", "по", "под", "окно", "ром", "управдом", "ложка", "пароход", "зонт"};

        for (String word : words) {
            long count = decoratedSearchEngine.search(text, word);
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        }

    }


}