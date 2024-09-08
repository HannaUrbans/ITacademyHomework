package test.home_work_2;

import home_work_2.loops.MathPowAnalogue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathPowAnalogueTest {

    @Test
    public void withoutDotInputTest(){
        String result = MathPowAnalogue.raiseNum(18,5);
        assertEquals("18.0 ^ 5 = 1 889 568,00", result, "Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568,00");
    }

    @Test
    public void withDotInputTest(){
        String result = MathPowAnalogue.raiseNum(7.5f,2);
        assertEquals("7.5 ^ 2 = 56,25", result, "Ввели 7.5 и 2, должно получиться в консоли: 7.5  ^ 2 = 56,25");
    }

    @Test
    public void baseNumNegativeInputTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            MathPowAnalogue.checkbaseNum(-1);
        });
    }

    @Test
    public void baseNumZeroInputTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            MathPowAnalogue.checkbaseNum(0);
        });
    }

    @Test
    public void expNumNegativeInputTest(){
       assertThrows(IllegalArgumentException.class, () ->{
           MathPowAnalogue.checkExpNum(-1);
       });
    }

    @Test
    public void expNumNegativeZeroTest(){
        String result = MathPowAnalogue.raiseNum(1,0);
        assertEquals("1.0 ^ 0 = 1,00", result, "Любое число в нулевой степени равняется единице");
    }


}
