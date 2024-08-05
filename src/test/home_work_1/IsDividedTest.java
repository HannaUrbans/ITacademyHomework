package test.home_work_1;

import home_work_1.IsDivided;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IsDividedTest {

    @Test
    void testZeroInput() {
        String result = IsDivided.findIfDivided(4, 0);
        assertEquals(" с остатком.", result, "При делении 0 на любое число получается 0");
    }

    @Test
    void testDivided() {
        String result = IsDivided.findIfDivided(2, 22266);
        assertEquals(" без остатка.", result, "22266 делится на 2 без остатка");
    }

    @Test
    void testNotDivided() {
        String result = IsDivided.findIfDivided(2, 22265);
        assertEquals(" с остатком.", result, "22265 делится на 2 с остатком");
    }

    @Test
    void testSecondNumMoreThanFirstNum() {
        String result = IsDivided.findIfDivided(22265, 2);
        assertEquals(" с остатком.", result, "Если второе делитель больше делимого, то деление всегда будет с остатком");
    }

    @Test
    void testDividedBySelf() {
        String result = IsDivided.findIfDivided(5, 5);
        assertEquals(" без остатка.", result, "Число делится на само себя без остатка");
    }

    @Test
    void testMaxValue() {
        String result = IsDivided.findIfDivided(1_000_000_000, 2_147_483_647);
        assertEquals(" с остатком.", result, "2_147_483_647 не делится на 1_000_000_000 без остатка");
    }


    @Test
    void testMinValue() {
        String result = IsDivided.findIfDivided(1, 2_147);
        assertEquals(" без остатка.", result, "1 делится на 2_147 без остатка");
    }
}
