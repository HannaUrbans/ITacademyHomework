package test.home_work_6;

import home_work_6.EasySearch;
import home_work_6.utils.ISearchEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EasySearchTestCS {

    @DisplayName("Проверка количества вхождений слова с учётом регистра")
    @Test
    public void EasySearchTest() {
        String text = "Однако,   Мры в течение этого времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = "мры";
        ISearchEngine tmp = new EasySearch();
        assertEquals(5, tmp.search(text, word), "Неверно подсчитано количество вхождений слова");
    }

    @DisplayName("Проверка правильности ответа в случае отсутствия совпадений")
    @Test
    public void EasySearchNullResultTest() {
        String text = "Мама мыла раму";
        String word = "мыл";
        ISearchEngine tmp = new EasySearch();
        assertEquals(0, tmp.search(text, word), "Неверно подсчитано количество вхождений слова");
    }

    @DisplayName("Проверка количества вхождений null")
    @Test
    public void nullEasySearchTest() {
        String text = "Однако,   Мы в течение этого времени, мы  , совершали только простейшие операции: удаление (мы?), вставку (мы!!!), вывод в консоль (мы ...). Конечно,         мы     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = null;
        ISearchEngine tmp = new EasySearch();
        assertThrows(IllegalArgumentException.class, () -> {
            tmp.search(text, word);
        }, "Должно выпасть исключение");
    }
}

