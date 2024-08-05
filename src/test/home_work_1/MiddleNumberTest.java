package test.home_work_1;

import home_work_1.MiddleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleNumberTest {

    @Test
    void testMiddleNumberWithZero() {
        int result = MiddleNumber.findMiddleNumber(0, 1, 2);
        assertEquals(1, result, "Среднее число из 0, 1, 2 должно быть 1");
    }

    @Test
    void testMiddleNumberPositive() {
        int result = MiddleNumber.findMiddleNumber(5, 1, 2);
        assertEquals(2, result, "Среднее число из 5, 1, 2 должно быть 2");
    }

    @Test
    void testMiddleNumberNegative() {
        int result = MiddleNumber.findMiddleNumber(-10, -9, -8);
        assertEquals(-9, result, "Среднее число из -10, -9, -8 должно быть -9");
    }

    @Test
    void testMiddleNumberMixed() {
        int result = MiddleNumber.findMiddleNumber(0, -10, 2);
        assertEquals(0, result, "Среднее число из 0, -10, 2 должно быть 0");
    }

    @Test
    void testRangeBoundaryPositive() {
        int result = MiddleNumber.findMiddleNumber(100_000, 5, -2);
        assertEquals(5, result, "Среднее число из 100_000, 5, -2 должно быть 5");
    }

    @Test
    void testRangeBoundaryNegative() {
        int result = MiddleNumber.findMiddleNumber(-100_000, 5, 85);
        assertEquals(5, result, "Среднее число из -100_000, 5, 85 должно быть 5");
    }

    @Test
    void testMiddleNumberWithTwoSameValues() {
        int result = MiddleNumber.findMiddleNumber(-18, 5, 5);
        assertEquals(5, result, "Среднее число из -18, 5, 5 должно быть 5");
    }

    @Test
    void testMiddleNumberWithAllSameValues() {
        int result = MiddleNumber.findMiddleNumber(5, 5, 5);
        assertEquals(5, result, "Среднее число из 5, 5, 5 должно быть 5");
    }
}
