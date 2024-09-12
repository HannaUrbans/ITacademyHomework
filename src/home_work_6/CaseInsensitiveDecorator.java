package home_work_6;

import home_work_6.utils.ISearchEngine;

public class CaseInsensitiveDecorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public CaseInsensitiveDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String textToLowerCase = text.toLowerCase();
        String wordToLowerCase = word.toLowerCase();
        long res = 0;
        if (searchEngine instanceof EasySearch) {
            res = searchEngine.search(textToLowerCase, wordToLowerCase);
        }
        if (searchEngine instanceof RegExSearch) {
            res = searchEngine.search(text, word);
        }
        return res;
    }
}
