package test.home_work_2;

import home_work_2.loops.MultiplyInsideNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplyInsideNumberTest {
    @Test
    public void dotCheckRightInputTest() {
        String result = MultiplyInsideNumber.toMultiply("181232375");
    assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080", result, "Если перемножить между собой числа, из которых состоит 181232375, то получится 10 080");
    }

    @Test
    public void dotCheck1DotTest() {
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.dotCheck("99.2");
        });
        assertEquals("Введено не целое число", exc.getMessage());
    }

    @Test
    public void notDigitTest() {
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.isDigitCheck("Привет,");
        });
        assertEquals("Введено не число", exc.getMessage());
    }

    @Test
    public void dotCheck2DotsTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.dotCheck(".5.");
        });
    }

    @Test
    public void dotCheckDotFirstTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.dotCheck(".5");
        });
    }

    @Test
    public void dotCheckDotLastTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.dotCheck("5.");
        });
    }

    @Test
    public void dotCheckNotDigitTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplyInsideNumber.dotCheck("5.5f");
        });
    }

    @Test
    public void zeroInputTest(){
        String result = MultiplyInsideNumber.toMultiply("0");
        assertEquals("0", result, "Ответ должен быть 0");
    }

    @Test
    public void negativeInputTest(){
        String result = MultiplyInsideNumber.toMultiply("-181232375");
        assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080", result, "Если перемножить между собой числа, из которых состоит -181232375, то получится 10 080 (берем число по модулю)");

    }

}
