package test.home_work_6;

import home_work_6.CaseInsensitiveDecorator;
import home_work_6.EasySearch;
import home_work_6.SearchEngineCaseNormalizer;
import home_work_6.utils.ISearchEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SearchEngineCaseNormalizerTestCIS {

    @DisplayName("Проверка количества вхождений слова без учёта регистра")
    @Test
    public void searchEngineCaseNormalizerTest() {
        String text = "Бабушка, к из бабушку, Бабушки И и по По по иии  ИИИ под Под пода бабушка бабушкой окно  окна " +
                "зонт зонта ложка ложку пароход парохода рома ром рому ромом гарем гаремом гарема управдома управдомом управдом " +
                "водолей водолеем водолея водолею прибой прибоя прибою прибоем кот котом кота";
        String[] words = {"бабушка", "и", "иии", "по", "под", "окно", "ром", "управдом", "ложка", "пароход", "зонт", "водолей", "гарем", "прибой", "кот", "к", "из"};
        ISearchEngine tmp0 = new EasySearch();
        ISearchEngine tmp1 = new CaseInsensitiveDecorator(tmp0);
        ISearchEngine tmp2 = new SearchEngineCaseNormalizer(tmp1);

            assertEquals(5, tmp2.search(text, words[0]), "Неверно подсчитано количество вхождений слова " + words[0]);
            assertEquals(2, tmp2.search(text, words[1]), "Неверно подсчитано количество вхождений слова " +  words[1]);
            assertEquals(1, tmp2.search(text, words[2]), "Неверно подсчитано количество вхождений слова " + words[2]);
            assertEquals(3, tmp2.search(text, words[3]), "Неверно подсчитано количество вхождений слова " + words[3]);
            assertEquals(3, tmp2.search(text, words[4]), "Неверно подсчитано количество вхождений слова " + words[4]);
            assertEquals(2, tmp2.search(text, words[5]), "Неверно подсчитано количество вхождений слова " + words[5]);
            assertEquals(4, tmp2.search(text, words[6]), "Неверно подсчитано количество вхождений слова " + words[6]);
            assertEquals(3, tmp2.search(text, words[7]), "Неверно подсчитано количество вхождений слова " + words[7]);
            assertEquals(2, tmp2.search(text, words[8]), "Неверно подсчитано количество вхождений слова " + words[8]);
            assertEquals(2, tmp2.search(text, words[9]), "Неверно подсчитано количество вхождений слова " + words[9]);
            assertEquals(2, tmp2.search(text, words[10]), "Неверно подсчитано количество вхождений слова " + words[10]);
            assertEquals(4, tmp2.search(text, words[11]), "Неверно подсчитано количество вхождений слова " + words[11]);
            assertEquals(3, tmp2.search(text, words[12]), "Неверно подсчитано количество вхождений слова " + words[12]);
            assertEquals(4, tmp2.search(text, words[13]), "Неверно подсчитано количество вхождений слова " + words[13]);
            assertEquals(3, tmp2.search(text, words[14]), "Неверно подсчитано количество вхождений слова " + words[14]);
            assertEquals(1, tmp2.search(text, words[15]), "Неверно подсчитано количество вхождений слова " + words[15]);
            assertEquals(1, tmp2.search(text, words[16]), "Неверно подсчитано количество вхождений слова " + words[16]);

    }

    @DisplayName("Проверка правильности ответа в случае отсутствия совпадений")
    @Test
    public void EngineCaseNormalizerNullResultTest() {
        String text = "Мама рама";
        String word = "мыло";
        ISearchEngine tmp0 = new EasySearch();
        ISearchEngine tmp1 = new CaseInsensitiveDecorator(tmp0);
        ISearchEngine tmp2 = new SearchEngineCaseNormalizer(tmp1);
        assertEquals(0, tmp2.search(text, word), "Неверно подсчитано количество вхождений слова");
    }

    @DisplayName("Проверка количества вхождений null")
    @Test
    public void nullEngineCaseNormalizerTest() {
        String text = "Однако,   Мы в течение этого времени, мы  , совершали только простейшие операции: удаление (мы?), вставку (мы!!!), вывод в консоль (мы ...). Конечно,         мы     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = null;
        ISearchEngine tmp0 = new EasySearch();
        ISearchEngine tmp1 = new CaseInsensitiveDecorator(tmp0);
        ISearchEngine tmp2 = new SearchEngineCaseNormalizer(tmp1);

        assertThrows(IllegalArgumentException.class, () -> {
            tmp2.search(text, word);
        }, "Должно выпасть исключение");
    }
}

