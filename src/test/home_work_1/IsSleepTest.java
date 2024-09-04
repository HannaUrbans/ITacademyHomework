package test.home_work_1;

import home_work_1.IsSleep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsSleepTest {
    @Test
    public void inRangeTest() {
        boolean result = IsSleep.isInRange('+');
        assertEquals(true, result, "+ является допустимым значением");
    }

    @Test
    public void notInRangeTest() {
        boolean result = IsSleep.isInRange('*');
        assertEquals(false, result, "* не является допустимым значением");
    }

    @Test
    public void trueAnswerTest() {
        boolean result = IsSleep.sleepIn(false, true);
        assertEquals(true, result, "Вариант предусматривает ответ true");
    }

    @Test
    public void falseAnswerTest() {
        boolean result = IsSleep.sleepIn(true, false);
        assertEquals(false, result, "Вариант предусматривает ответ false");
    }


    //сначала проверяем, что выбрасывается именно то исключение
    //assertThrows принимает два параметра:
    //Класс исключения, который вы ожидаете
    //Лямбда-выражение, содержащее код, который должен выбросить это исключение
    //потом можно проверить, что совпадает текст ошибки:
    //1. в таком случае assertThrows нужно заключить в переменную IllegalArgumentException exc
    //2. потом уже сама проверка: assertEquals("Одновременно выбрать два значения нельзя", exc.getMessage());
    @Test
    public void bothTrueTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            IsSleep.checkCorrectInput(true, true);
        });
    }

    @Test
    public void bothFalseTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            IsSleep.checkCorrectInput(false, false);
        });
    }


}
