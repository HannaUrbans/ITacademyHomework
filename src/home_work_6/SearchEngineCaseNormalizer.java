package home_work_6;

import home_work_6.utils.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    //если слово в им.пад. оканчивается на буквы из окончания творительного падежа, чтобы не отсекать это якобы окончание
    private static String[] endingsSameAsInInstrumentalCase = {"ом", "ем", "ём", "ой", "ей", "ёй"};
    private static String[] endingsWithoutInstrumentalCase = {"й", "а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я", "ь"};


    //управдом, дом, гарем, приём, водопой, водолей, ...,
    @Override
    public long search(String text, String word) {
        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            throw new IllegalArgumentException("Ошибка при передаче данных");
        }

        String cutWordToSearch = "";
        cutWordToSearch = cutWordEnding(word, endingsWithoutInstrumentalCase);

        String[] stringArray = generateStringArrayFromInputData(text);
        StringBuilder sb = new StringBuilder();

        for (String wordInArray : stringArray) {
            String cutWordInText2 = cutWordEnding(wordInArray, endingsSameAsInInstrumentalCase);
            //чтобы ром и управдом в тексте не обрезать
            if ((wordInArray.endsWith("ом") || wordInArray.endsWith("ем") || wordInArray.endsWith("ём") || wordInArray.endsWith("ой") || wordInArray.endsWith("ей") || wordInArray.endsWith("ёй") || wordInArray.endsWith("ою") || wordInArray.endsWith("ёю") || wordInArray.endsWith("ею") || wordInArray.endsWith("ью")) && (cutWordInText2.equals(cutWordToSearch))) {
                {
                    sb.append(cutWordInText2).append(" ");
                }
            } else {
                String cutWordInText = cutWordEnding(wordInArray, endingsWithoutInstrumentalCase);
                sb.append(cutWordInText).append(" ");
            }
        }
        String cutText = sb.toString().trim();

        return searchEngine.search(cutText, cutWordToSearch);
    }

    public static String cutWordEnding(String inputWord, String[] endings) {
        inputWord = inputWord.trim();

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

