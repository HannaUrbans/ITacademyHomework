package test.home_work_2;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortsUtilsTest {
    static int[] zeroCaseTestArray = {0};
    static int[] oneDigitCaseTestArray = {1};
    static int[] twoDigitsCaseTestArray = {1574, 153};
    static int[] exampleCaseTestArray1 = {1, 2, 3, 4, 5, 6};
    static int[] exampleCaseTestArray2 = {1, 1, 1, 1};
    static int[] exampleCaseTestArray3 = {9, 1, 5, 99, 9, 9};
    static int[] exampleCaseTestArray4 = {};
    static int[] exampleCaseTestArray5 = {6, 5, 4, 3, 2, 1};

    @Test
    public void zeroCaseSortTest() {
        int [] expArray = {0};
        int [] resArray = Arrays.copyOf(zeroCaseTestArray, zeroCaseTestArray.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void oneDigitCaseSortTest() {
        int [] expArray = {1};
        int [] resArray = Arrays.copyOf(oneDigitCaseTestArray, oneDigitCaseTestArray.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void twoDigitsCaseSortTest() {
        int [] expArray = {153,1574};
        int [] resArray = Arrays.copyOf(twoDigitsCaseTestArray, twoDigitsCaseTestArray.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase1CaseSortTest() {
        int [] expArray = {1,2,3,4,5,6};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray1,exampleCaseTestArray1.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase2CaseSortTest() {
        int [] expArray = {1,1,1,1};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray2, exampleCaseTestArray2.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase3CaseSortTest() {
        int [] expArray = {1,5,9,9,9,99};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray3,exampleCaseTestArray3.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase4CaseSortTest() {
        int [] expArray = {};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray4, exampleCaseTestArray4.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase5CaseSortTest() {
        int [] expArray = {1,2,3,4,5,6};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray5,exampleCaseTestArray5.length);
        SortsUtils.sort(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void zeroCaseShakeTest() {
        int [] expArray = {0};
        int [] resArray = Arrays.copyOf(zeroCaseTestArray, zeroCaseTestArray.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void oneDigitCaseShakeTest() {
        int [] expArray = {1};
        int [] resArray = Arrays.copyOf(oneDigitCaseTestArray, oneDigitCaseTestArray.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void twoDigitsCaseShakeTest() {
        int [] expArray = {153,1574};
        int [] resArray = Arrays.copyOf(twoDigitsCaseTestArray, twoDigitsCaseTestArray.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase1CaseShakeTest() {
        int [] expArray = {1,2,3,4,5,6};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray1,exampleCaseTestArray1.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase2CaseShakeTest() {
        int [] expArray = {1,1,1,1};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray2, exampleCaseTestArray2.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase3CaseShakeTest() {
        int [] expArray = {1,5,9,9,9,99};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray3,exampleCaseTestArray3.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase4CaseShakeTest() {
        int [] expArray = {};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray4, exampleCaseTestArray4.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }

    @Test
    public void exampleCase5CaseShakeTest() {
        int [] expArray = {1,2,3,4,5,6};
        int [] resArray = Arrays.copyOf(exampleCaseTestArray5,exampleCaseTestArray5.length);
        SortsUtils.shake(resArray);
        assertArrayEquals(expArray, resArray);
    }
    }

