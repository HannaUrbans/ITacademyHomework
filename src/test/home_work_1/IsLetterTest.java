package test.home_work_1;

import home_work_1.IsLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsLetterTest {
    @Test
    public void correctInputLength() {
        boolean result = IsLetter.isNotCorrectSize("1");
        assertEquals(false, result, "1 символ - правильный размер вводимых данных");
    }

    @Test
    public void inCorrectInputLength() {
        boolean result = IsLetter.isNotCorrectSize("12");
        assertEquals(true, result, "размер вводимых данных не должен быть больше 1");
    }

    @Test
    public void letterLatinUppercaseInput() {
        String result = IsLetter.specifyInput('Z');
        assertEquals("букву ", result, "Z - буква");
    }

    @Test
    public void letterLatinLowercaseInput() {
        String result = IsLetter.specifyInput('z');
        assertEquals("букву ", result, "z - буква");
    }

    @Test
    public void letterCyrillicUppercaseInput() {
        String result = IsLetter.specifyInput('Я');
        assertEquals("букву ", result, "Я - буква");
    }

    @Test
    public void letterCyrillicLowercaseInput() {
        String result = IsLetter.specifyInput('я');
        assertEquals("букву ", result, "я - буква");
    }

    @Test
    public void digitInput() {
        String result = IsLetter.specifyInput('1');
        assertEquals("цифру ", result, "1 - цифра");
    }

    @Test
    public void symbolInput() {
        String result = IsLetter.specifyInput('+');
        assertEquals("символ ", result, "+ - символ");
    }
}
