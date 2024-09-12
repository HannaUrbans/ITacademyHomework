package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    //обязательная инициализация в конструкторе
    //конструктор принимает объект, реализующий этот интерфейс, и инициализирует поле
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {

        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            throw new IllegalArgumentException("Ошибка при передаче данных");
        }

        text = text.replace('.', ' ')
                .replace(',', ' ')
                .replace('&', ' ')
                .replace('?', ' ')
                .replace(':', ' ')
                .replace(';', ' ')
                .replace('!', ' ')
                .replace('(', ' ')
                .replace(')', ' ')
                .replace('\n', ' ')
                .replace('\'', ' ')
                .replace('\"', ' ');


        return searchEngine.search(text, word);
    }
}
