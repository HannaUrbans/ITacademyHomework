package test.home_work_2;

import home_work_2.loops.Table;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableTest {

    @Test
    public void oneColumnPrintTable(){
        String exp = " 1 *  1 =   1\n" +
                " 1 *  2 =   2\n" +
                " 1 *  3 =   3\n" +
                " 1 *  4 =   4\n" +
                " 1 *  5 =   5\n" +
                " 1 *  6 =   6\n" +
                " 1 *  7 =   7\n" +
                " 1 *  8 =   8\n" +
                " 1 *  9 =   9\n" +
                " 1 * 10 =  10\n";
        String res = Table.printTable(1,1);
        assertEquals(exp, res, "Ошибка вывода");
    }

    @Test
    public void twoColumnsPrintTable(){
        String exp = " 1 *  1 =   1 | 2 *  1 =   2\n" +
                " 1 *  2 =   2 | 2 *  2 =   4\n" +
                " 1 *  3 =   3 | 2 *  3 =   6\n" +
                " 1 *  4 =   4 | 2 *  4 =   8\n" +
                " 1 *  5 =   5 | 2 *  5 =  10\n" +
                " 1 *  6 =   6 | 2 *  6 =  12\n" +
                " 1 *  7 =   7 | 2 *  7 =  14\n" +
                " 1 *  8 =   8 | 2 *  8 =  16\n" +
                " 1 *  9 =   9 | 2 *  9 =  18\n" +
                " 1 * 10 =  10 | 2 * 10 =  20\n";
        String res = Table.printTable(1,2);
        assertEquals(exp, res, "Ошибка вывода");
    }

    @Test
    public void zeroCasePrintTable(){
        String exp = " 0 *  1 =   0\n" +
                " 0 *  2 =   0\n" +
                " 0 *  3 =   0\n" +
                " 0 *  4 =   0\n" +
                " 0 *  5 =   0\n" +
                " 0 *  6 =   0\n" +
                " 0 *  7 =   0\n" +
                " 0 *  8 =   0\n" +
                " 0 *  9 =   0\n" +
                " 0 * 10 =   0\n";
        String res = Table.printTable(0,0);
        assertEquals(exp, res, "Ошибка вывода");
    }
}
