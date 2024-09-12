package home_work_6;

import home_work_6.utils.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//поиск с учетом регистра
public class RegExSearch implements ISearchEngine {

    public static void main(String[] args) {
        String text = "Однако,   Мры в течение этого мры-мры времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = "мры";
        RegExSearch tmp = new RegExSearch();
        long count = tmp.search(text, word);
        System.out.println("Количество вхождений слова '" + word + "': " + count);
    }


    @Override
    public long search(String text, String word) {

        long frequency = 0;
        //1. создаем Pattern
        Pattern pattern = Pattern.compile ("\\b" + word + "\\b");
        //2. создаем Matcher
        Matcher matcher = pattern.matcher(text);
        //3. поиск в цикле
        while (matcher.find()){
            ++frequency;}

        return frequency;
    }
}
