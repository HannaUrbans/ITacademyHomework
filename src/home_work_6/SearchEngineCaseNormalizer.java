package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String cutWordToSearch = cutWordEnding(word);

        String[] stringArray = generateStringArrayFromInputData(text);

        StringBuilder sb = new StringBuilder();

        for (String wordInArray : stringArray) {
            String cutWordInText = cutWordEnding(wordInArray);
            sb.append(cutWordInText).append(" ");
        }
        String cutText = sb.toString().trim();

        return searchEngine.search(cutText, cutWordToSearch);
    }

    public static String cutWordEnding(String inputWord) {
        inputWord = inputWord.trim();

        String[] endings = {"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я", "ь", "ом", "ем", "ой", "ей", "ёй", "ою", "ею", "ёю", "ью"};

        for (String ending : endings) {
            if (inputWord.length() >= 2) {
                if (inputWord.endsWith(ending)) {
                    return inputWord.substring(0, inputWord.length() - ending.length());
                }
            }
        }
        return inputWord;
    }


    public static String[] generateStringArrayFromInputData(String inputData) {

        String regex = "[ ,.&?:;!()\\\"'\n-]+";

        return inputData.split(regex);
    }
}
