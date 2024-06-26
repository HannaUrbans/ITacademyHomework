package home_work_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BytesConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите байты для дальнейшей конвертации в килобайты.");
        double inputBytes = in.nextDouble();

        if (isInRange(inputBytes)){
            double res1 = inputBytes / 1024;
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedRes = df.format(res1);
            System.out.println(inputBytes + " байт = " + formattedRes + " килобайт");
        }
        else {
            System.out.println("Отрицательные числа не допустимы.");
            return;
        }
        in.close();
    }

    public static boolean isInRange(double number) {
        return number >= 0;
    }
}
