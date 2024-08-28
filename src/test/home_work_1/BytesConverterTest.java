package test.home_work_1;

import home_work_1.BytesConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BytesConverterTest {

    @Test void positiveCaseIsInRange(){
        Boolean result = BytesConverter.isInRange(4);
        assertEquals(true, result, "4 - положительное число, подходит по условию");
    }

    @Test void negativeCaseIsInRange(){
        Boolean result = BytesConverter.isInRange(-4);
        assertEquals(false, result, "-4 - отрицательное число, не подходит по условию");
    }

    @Test void zeroCaseIsInRange(){
        Boolean result = BytesConverter.isInRange(0);
        assertEquals(true, result, "0 - подходит по условию");
    }
}
