package home_work_2.loops;

/**
 *  1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
 *     	1.4.1. 3
 *     	1.4.2. 188
 *     	1.4.3. -19
 *     	1.4.4. Да и вообще на любое целочисленное
 *
 *     	// Math.multiplyExact!!!
 *     	// еще можно было Long.MAX_VALUE
 */

public class MultiplicationTillOverflow {
    public static void main(String[] args) {
        long a = 1l;
        int x = 3;
        int y = 188;
        int z = -19;
        int myNum = 188888;

        long [] resultX = multiplyNum(a, x);
        long [] resultY = multiplyNum(a, y);
        long [] resultZ = multiplyNum(a, z);
        long [] resultmyNum = multiplyNum(a, myNum);

        System.out.println("Значение до переполнения: " + resultX[0] + "\nЗначение после переполнения:" + resultX[1]);
        System.out.println("Значение до переполнения: " + resultY[0] + "\nЗначение после переполнения:" + resultY[1]);
        System.out.println("Значение до переполнения: " + resultZ[0] + "\nЗначение после переполнения:" + resultZ[1]);
        System.out.println("Значение до переполнения: " + resultmyNum[0] + "\nЗначение после переполнения:" + resultmyNum[1]);
    }

    public static long [] multiplyNum(long firstNum, int secondNum){
        long previousRes = 1;
        long overflowRes = 1;
        long currentRes = firstNum;

        while (true) {
            previousRes = currentRes;
            currentRes *= secondNum;

            if ((secondNum > 0 && currentRes >= Long.MAX_VALUE / secondNum) || (secondNum < 0 && currentRes <= Long.MIN_VALUE / secondNum) || (secondNum < 0 && currentRes >= Long.MAX_VALUE / secondNum)) {
                overflowRes = currentRes*secondNum;
                break;
            }
        }


        long [] arrayToPrint = new  long [2];
        arrayToPrint [0] = previousRes;
        arrayToPrint [1] = overflowRes;
        return arrayToPrint;
    }
}

/**
 * Значение до переполнения: 1350851717672992089
 * Значение после переполнения:4052555153018976267
 * Значение до переполнения: 8300513205665792
 * Значение после переполнения:1560496482665168896
 * Значение до переполнения: 1
 * Значение после переполнения:-19
 * Значение до переполнения: 35678676544
 * Значение после переполнения:6739273855043072
 */

/**
 * Значение до переполнения: 4052555153018976267
 * Значение после переполнения:-6289078614652622815
 * Значение до переполнения: 1560496482665168896
 * Значение после переполнения:-1774566438301073408
 * Значение до переполнения: 1
 * Значение после переполнения:-19
 * Значение до переполнения: 6742125457921376256
 * Значение после переполнения:-1277120833396670464
 */

/**
 * Значение до переполнения: 1350851717672992089
 * Значение после переполнения:-6289078614652622815
 * Значение до переполнения: 8300513205665792
 * Значение после переполнения:-1774566438301073408
 * Значение до переполнения: 1
 * Значение после переполнения:361
 * Значение до переполнения: 35678676544
 * Значение после переполнения:142618845416722432
 */