package test.home_work_1;

import home_work_1.OddOrEven;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OddOrEvenTest {

    @Test
    void testNegativeInput(){
        String result = OddOrEven.findOddOrEvenNumber(-5);
        assertEquals(" не входит в требуемый диапазон.", result, "Числа, меньше 0, запрещены по условию");
    }
   @Test
    void testZeroInput(){
       String result = OddOrEven.findOddOrEvenNumber(0);
       assertEquals(" чётное", result, "0 - чётное число");
   }

    @Test
    void testOddInput(){
        String result = OddOrEven.findOddOrEvenNumber(22266);
        assertEquals(" чётное", result, "Чётные числа делятся на 2 без остатка");
    }

    @Test
    void testEvenInput(){
        String result = OddOrEven.findOddOrEvenNumber(22265);
        assertEquals(" нечётное", result, "Нечётные числа не делятся на 2 без остатка");
    }




}
