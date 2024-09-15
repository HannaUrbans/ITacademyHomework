package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizerRunner {

    public static void main(String[] args) {

        //этот метод не предусматривает того, что в середине (!) слова будут буквы разных регистров + не для аббревиатур
        //этот метод только для подсчета существительных разных падежей (некорректно работает с глаголами в женском роде: душистое мылО и мама мылА считается одним и тем же)
        //слово для поиска вводится только в ИМЕНИТЕЛЬНОМ падеже
        //этот метод не до конца проработан для случая типа козЁл = козлом, молодЕц - молодцом, когда выпадает гласная при склонении
        ISearchEngine tmp = new EasySearch();
        ISearchEngine tmp2 = new CaseInsensitiveDecorator(tmp);
        ISearchEngine decoratedSearchEngine = new SearchEngineCaseNormalizer(tmp2);

        String text = "Мама мама мыла подо под Мыла Раму раму";
        String[] words = {"мама", "мыл", "мыла", "рама", "под"};

        for (String word : words) {
            long count = decoratedSearchEngine.search(text, word);
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        }

    }
}