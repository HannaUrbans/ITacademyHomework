package home_work_6;

import home_work_6.utils.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//поиск с учетом регистра
public class RegExSearch implements ISearchEngine {

    private final boolean needCaseInsensitive;

    public RegExSearch(boolean needCaseInsensitive) {
        this.needCaseInsensitive = needCaseInsensitive;
    }

    public static void main(String[] args) {
        String text = "Однако,   Мры в течение этого мры времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word1 = "мры";
        //String word2 = "Мры";
        RegExSearch tmpCaseInsensitive = new RegExSearch(true);
        RegExSearch tmpCaseSensitive = new RegExSearch(false);
        long count1 = tmpCaseInsensitive.search(text, word1);
        //long count2 = tmpCaseInsensitive.search(text, word2);
        long count3 = tmpCaseSensitive.search(text, word1);
        //long count4 = tmpCaseSensitive.search(text, word2);
        System.out.println("Нечувствительно к регистру");
        System.out.println("Количество вхождений слова '" + word1 + "': " + count1);
        //System.out.println("Количество вхождений слова '" + word2 + "': " + count2);
        System.out.println("Чувствительно к регистру");
        System.out.println("Количество вхождений слова '" + word1 + "': " + count3);
        //System.out.println("Количество вхождений слова '" + word2 + "': " + count4);
    }


    @Override
    public long search(String text, String word) {

        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            throw new IllegalArgumentException("Ошибка при передаче данных");
        }

        long frequency = 0;

        //1. создаем Pattern
        Pattern pattern = needCaseInsensitive ?
                Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS)
                : Pattern.compile("\\b" + Pattern.quote(word) + "\\b");

        //2. создаем Matcher
        Matcher matcher = pattern.matcher(text);

        //3. поиск в цикле
        while (matcher.find()) {
            ++frequency;
        }

        return frequency;
    }
}
