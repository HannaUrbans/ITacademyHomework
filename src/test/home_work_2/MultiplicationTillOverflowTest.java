package test.home_work_2;

import home_work_2.loops.MultiplicationTillOverflow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplicationTillOverflowTest {
    @Test
    public void example1FromTaskTest(){
        long [] expected = {4052555153018976267l, -6289078614652622815l};
        long [] actual = MultiplicationTillOverflow.multiplyTillOverflow1(1,3);
        assertArrayEquals(expected, actual, "Значение до переполнения: 4052555153018976267. Значение после переполнения: -6289078614652622815");
    }

    @Test
    public void example2FromTaskTest(){
        long [] expected = {1560496482665168896l, -1774566438301073408l};
        long [] actual = MultiplicationTillOverflow.multiplyTillOverflow1(1,188);
        assertArrayEquals(expected, actual, "Значение до переполнения: 1560496482665168896. Значение после переполнения: -1774566438301073408");
    }

    @Test
    public void example3FromTaskTest(){
        long [] expected = {799006685782884121l, 3265617043834753317l};
        long [] actual = MultiplicationTillOverflow.multiplyTillOverflow1(1,-19);
        assertArrayEquals(expected, actual, "Значение до переполнения: 799006685782884121. Значение после переполнения: -3265617043834753317");
    }

    @Test
    public void example4FromTaskTest(){
        long [] expected = {430804206899405824l, -6539899926455986176l};
        long [] actual = MultiplicationTillOverflow.multiplyTillOverflow1(1,-58);
        assertArrayEquals(expected, actual, "Значение до переполнения: 430804206899405824. Значение после переполнения: -6539899926455986176");
    }

    @Test
    public void zeroAInputTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplicationTillOverflow.multiplyTillOverflow1(0, 5);
        });
    }

    @Test
    public void zeroBInputTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            MultiplicationTillOverflow.multiplyTillOverflow1(5, 0);
        });
    }
}
