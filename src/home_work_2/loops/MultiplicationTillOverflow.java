package home_work_2.loops;

public class MultiplicationTillOverflow {
    /**
     * Умножать число long a = 1; пока не произойдёт переполнение.
     * В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
     * Умножать на:
     * 1.4.1. 3
     * 1.4.2. 188
     * 1.4.3. -19
     * 1.4.4. Да и вообще на любое целочисленное
     */
    public static void main(String[] args) {
        long a = 1;
        long b = 3;
        long c = 188;
        long x = -19;
        long z = -58;

//     long[] resultsb = multiplyTillOverflow(a, b);
//     System.out.println(a + " * " + b);
//     System.out.println("Значение до переполнения: " + resultsb[0]);
//     System.out.println("Значение после переполнения: " + resultsb[1]);
//     System.out.println("");
        long[] resultsb1 = multiplyTillOverflow1(a, b);
        System.out.println(a + " * " + b);
        System.out.println("Значение до переполнения: " + resultsb1[0]);
        System.out.println("Значение после переполнения: " + resultsb1[1]);
        System.out.println("");

//     long[] resultsc = multiplyTillOverflow(a, c);
//     System.out.println(a + " * " + c);
//     System.out.println("Значение до переполнения: " + resultsc[0]);
//     System.out.println("Значение после переполнения: " + resultsc[1]);
//     System.out.println("");
        long[] resultsc1 = multiplyTillOverflow1(a, c);
        System.out.println(a + " * " + c);
        System.out.println("Значение до переполнения: " + resultsc1[0]);
        System.out.println("Значение после переполнения: " + resultsc1[1]);
        System.out.println("");

//     long[] resultsx = multiplyTillOverflow(a, x);
//     System.out.println(a + " * " + x);
//     System.out.println("Значение до переполнения: " + resultsx[0]);
//     System.out.println("Значение после переполнения: " + resultsx[1]);
//     System.out.println("");
        long[] resultsx1 = multiplyTillOverflow1(a, x);
        System.out.println(a + " * " + x);
        System.out.println("Значение до переполнения: " + resultsx1[0]);
        System.out.println("Значение после переполнения: " + resultsx1[1]);
        System.out.println("");

//     long[] resultsz = multiplyTillOverflow(a, z);
//     System.out.println(a + " * " + z);
//     System.out.println("Значение до переполнения: " + resultsz[0]);
//     System.out.println("Значение после переполнения: " + resultsz[1]);
//     System.out.println("");
        long[] resultsz1 = multiplyTillOverflow1(a, z);
        System.out.println(a + " * " + z);
        System.out.println("Значение до переполнения: " + resultsz1[0]);
        System.out.println("Значение после переполнения: " + resultsz1[1]);
        System.out.println("");
    }

    /**
     * public static long[] multiplyTillOverflow(long a, long b) {
     * long resultBeforeOverflow = a;
     * long resultAfterOverflow = a;
     * int i = 0; //сколько раз умножали, если чёт, то произведение положит., иначе произведение отрицат.
     * long maxPosResultsBeforeOverflow = Long.MAX_VALUE / Math.abs(b);    //макс знач results, которое можно умножить на b без переполнения.
     * <p>
     * if (b == 0) {
     * resultBeforeOverflow = 0;
     * resultAfterOverflow = 0;
     * }
     * <p>
     * while (resultBeforeOverflow <= maxPosResultsBeforeOverflow) {
     * resultBeforeOverflow *= Math.abs(b);
     * i++;
     * }
     * <p>
     * //так как умножаем на целочисленное, можем пренебречь тем фактом, что |Long.MIN_VALUE| != Long.MAX_VALUE
     * if (b > 0) {
     * resultAfterOverflow = resultBeforeOverflow * Math.abs(b);
     * } else {
     * if (i % 2 == 0) {
     * resultAfterOverflow = resultBeforeOverflow * b;
     * <p>
     * } else {
     * resultBeforeOverflow *= -1;
     * resultAfterOverflow = resultBeforeOverflow * b;
     * }
     * }
     * return new long[]{resultBeforeOverflow, resultAfterOverflow};
     * }
     */

    public static long[] multiplyTillOverflow1(long a, long b) {
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Умножение на 0 в данном случае запрещено");
        }
        long resultBeforeOverflow = a;
        long resultAfterOverflow = a;
        while (true) {
            resultBeforeOverflow = a;
            try {
                a = Math.multiplyExact(a, b);
            } catch (ArithmeticException e) {
                // Переполнение произошло
                resultAfterOverflow = a * b;
                break;
            }
        }
        return new long[]{resultBeforeOverflow, resultAfterOverflow};
    }

}
