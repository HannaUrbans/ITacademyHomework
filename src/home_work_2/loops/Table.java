package home_work_2.loops;

public class Table {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        int res;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                res = i * j;
                System.out.printf("%2d * %2d = %3d", j, i, res);
                if (j < 5) {
                    System.out.print(" |");
                }
            }
            System.out.println("");
        }

        //60 подстановкой взяла, в идеале нужно взять длину макс строки
        for (int k = 1; k < 60; k++) {
            System.out.print("-");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                res = i * j;
                System.out.printf("%2d * %2d = %3d", j, i, res);
                if (j < 9) {
                    System.out.print(" |");
                }
            }
            System.out.println("");
        }
    }
}
