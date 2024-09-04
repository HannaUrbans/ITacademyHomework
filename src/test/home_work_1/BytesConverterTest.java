package test.home_work_1;

import home_work_1.BytesConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BytesConverterTest {

    @Test
    void positiveCaseIsInRange() {
        boolean result = BytesConverter.isInRange(4);
        assertEquals(true, result, "4 - положительное число, подходит по условию");
    }

    @Test
    void negativeCaseIsInRange() {
        boolean result = BytesConverter.isInRange(-4);
        assertEquals(false, result, "-4 - отрицательное число, не подходит по условию");
    }

    @Test
    void zeroCaseIsInRange() {
        boolean result = BytesConverter.isInRange(0);
        assertEquals(true, result, "0 - подходит по условию");
    }

    @Test
    void zeroCaseCorrectCalculation() {
        double result = BytesConverter.convertBytes(0);
        assertEquals(0d, result, "При конвертации 0 должен получиться 0.");
    }

    @Test
    void fractionalResultLessThan1CorrectCalculation() {
        double result = BytesConverter.convertBytes(1);
        assertEquals(0.0009765625d, result, "При конвертации 1 байта в килобайты должно получиться 0.0009765625.");
    }

    @Test
    void fractionalResultMoreThan1CorrectCalculation() {
        double result = BytesConverter.convertBytes(1025);
        assertEquals(1.0009765625d, result, "При конвертации 1 байта в килобайты должно получиться 1.0009765625.");
    }

    @Test
    void IntegerResultCorrectCalculation() {
        double result = BytesConverter.convertBytes(2048);
        assertEquals(2d, result, "При конвертации 2048 байтов в килобайты должно получиться ровно 2.");
    }
}
