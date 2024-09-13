package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizerRunner {

    public static void main(String[] args) {
        //просмотри вариант без учета регистра
        ISearchEngine tmp = new EasySearch();
        ISearchEngine decoratedSearchEngine = new SearchEngineCaseNormalizer(tmp);

        //не работает если оканч на согл и буквы из окончания творительного падежа: ром, управдом
        String text = "Бабушка, бабушку,  бабУшка  Бабушки И и по По по иии  ИИИ под Под пода БАБУШКА БАбушка БАБушка БАБУшка БАБУШка БАБУШКа бабушка бабушкой бАБУШКА окно  окНа зонт зонта рома ром домой ложка ложку пароход парохода управдомом управдома управдом";
        String[] words = {"Бабушку", "и", "иии", "по", "под", "окно", "ром", "управдом", "ложка", "пароход", "зонт"};

        for (String word : words) {
            long count = decoratedSearchEngine.search(text, word);
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        }

    }


}