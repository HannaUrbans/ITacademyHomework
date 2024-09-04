package test.home_work_1;

import home_work_1.IsLeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsLeapYearTest {
    @Test
    public void correctYearInputTest() {
        boolean result = IsLeapYear.correctYearInput(123);
        assertEquals(true, result, "123 год подходит по условию задачи");
    }

    @Test
    public void incorrectYearZeroInputTest() {
        boolean result = IsLeapYear.correctYearInput(0);
        assertEquals(false, result, "Год должен быть > 0");
    }

    @Test
    public void incorrectYearNegativeInputTest() {
        boolean result = IsLeapYear.correctYearInput(-123);
        assertEquals(false, result, "Год должен быть > 0");
    }

    @Test
    public void notLeapYearTest() {
        String result = IsLeapYear.specifyLeapStatus(2023);
        assertEquals("невисокосный", result, "2023 - невисокосный год");
    }

    @Test
    public void leapYearTestRule1() {
        String result = IsLeapYear.specifyLeapStatus(2024);
        assertEquals("високосный", result, "2024 - високосный год");
    }

    @Test
    public void leapYearTestRule2() {
        String result = IsLeapYear.specifyLeapStatus(1900);
        assertEquals("невисокосный", result, "1900 - невисокосный год");
    }

    @Test
    public void leapYearTestRule3() {
        String result = IsLeapYear.specifyLeapStatus(2000);
        assertEquals("високосный", result, "2000 - високосный год");
    }
}
