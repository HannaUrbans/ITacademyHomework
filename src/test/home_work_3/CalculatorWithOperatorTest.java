package test.home_work_3;

import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    private final CalculatorWithOperator calculator = new CalculatorWithOperator();

    @Test
    public void test1() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, calculator.subtract(1, 1));
    }
}
