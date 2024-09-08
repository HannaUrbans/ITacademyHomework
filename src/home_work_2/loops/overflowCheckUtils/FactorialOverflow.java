package home_work_2.loops.overflowCheckUtils;

public class FactorialOverflow {
    public static void main(String[] args) {
        int n = overflowNum();
        System.out.println("Переполнение происходит на факториале числа: " + n);
    }
    public static int overflowNum(){
        long factorial = 1;
        int n = 1;
        while (true) {
            if (Long.MAX_VALUE / factorial < n + 1) {
                break;
            }
            factorial *= n++;
        }

        return n;
    }
}
