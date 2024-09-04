package test.home_work_1;

import home_work_1.CorrectedPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CorrectedPhoneNumberTest {

    @Test
    public void nullInputTest() {
        assertThrows(IllegalArgumentException.class, () -> CorrectedPhoneNumber.checkCorrectInput(""));
    }

    @Test
    public void letterInputTest() {
        assertThrows(IllegalArgumentException.class, () -> CorrectedPhoneNumber.checkCorrectInput("d"));
    }

    @Test
    public void lessThan10DigitsInputTest() {
        assertThrows(IllegalArgumentException.class, () -> CorrectedPhoneNumber.checkCorrectInput("111"));
    }

    @Test
    public void moreThan10DigitsInputTest() {
        assertThrows(IllegalArgumentException.class, () -> CorrectedPhoneNumber.checkCorrectInput("12345678901"));
    }

    @Test
    public void createCorrectFormattedPhoneNumberTest() {
        char[] phoneNumber = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String result = CorrectedPhoneNumber.createPhoneNumber(phoneNumber);
        assertEquals("(123) 456-7890", result, "(123) 456-7890 - корректный формат номера согласно условию");
    }
}
