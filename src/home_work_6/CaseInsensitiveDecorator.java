package home_work_6;

import home_work_6.utils.ISearchEngine;

public class CaseInsensitiveDecorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public CaseInsensitiveDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            throw new IllegalArgumentException("Ошибка при передаче данных");
        }

        String textToLowerCase = text.toLowerCase();
        String wordToLowerCase = word.toLowerCase();

        if (searchEngine instanceof EasySearch) {
            return searchEngine.search(textToLowerCase, wordToLowerCase);
        } else if (searchEngine instanceof RegExSearch) {
            return searchEngine.search(text, word);

        } else throw new IllegalArgumentException("Ошибка с загрузкой инструмента для поиска");
    }
}
