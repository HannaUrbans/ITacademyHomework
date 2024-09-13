package home_work_6;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static home_work_6.FileReader.readFile;

public class CollectionsGenerator {

    public static String[] generateStringArray(File filePath) throws IOException {
        String data = readFile(filePath);

        String regex = "[ ,.&?:;!()\\\"'\n-]+";

        return data.split(regex);
    }

    public static Set<String> generateSet(File filePath) throws IOException {
        String[] stringArray = generateStringArray(filePath);

        Set<String> wordsInFile = new HashSet<>();

        for (String word : stringArray) {
            if (!word.trim().isEmpty()) {
                wordsInFile.add(word.trim());
            }
        }
        return wordsInFile;
    }

    //getOrDefault извлекает значение по ключу, предоставляя значение по умолчанию, если ключ не существует в карте
    public static Map<String, Integer> generateHashMap(File filePath) throws IOException {
        String[] stringArray = generateStringArray(filePath);

        Map<String, Integer> repeatedWords = new HashMap<>();

//        for (String word: stringArray) {
//            Integer valuesRepeats =  repeatedWords.getOrDefault(word,0);
//            repeatedWords.put(word, valuesRepeats+1);
//        }
        for (String word : stringArray) {
            Integer valuesRepeats = repeatedWords.get(word);
            if (valuesRepeats == null) {
                repeatedWords.put(word, 1);
            } else {
                repeatedWords.put(word, ++valuesRepeats);
            }
        }
        return repeatedWords;
    }
}
