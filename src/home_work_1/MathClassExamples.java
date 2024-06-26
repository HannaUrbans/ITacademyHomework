package home_work_1;

public class MathClassExamples {
    public static void main(String[] args) {
        int x = (int) (Math.random()*361);
        double sinX = Math.round(Math.sin(x)*100.0)/100.0;
        double cosX = Math.round(Math.cos(x)*100.0)/100.0;
        double tanX = Math.round(Math.tan(x)*100.0)/100.0;
        System.out.println("Синус угла " + x + ": " + sinX + "\n" + "Косинус угла " + x + ": " + cosX + "\n" + "Тангенс угла " + x + ": " + tanX);

        int a = -155;
        System.out.println("Положительное значение " + a + ": " + Math.abs(a));

        int b = (int)Math.PI * (int) (Math.random()*11);
        double c = Math.floor(Math.exp(b));
        double d = Math.ceil(Math.exp(b));
        System.out.println("Округляем экспоненту числа " + b + " в меньшую сторону: " + c);
        System.out.println("Округляем экспоненту числа " + b + " в большую сторону: " + d);

        double m = 25.0;
        double res1 = Math.pow(m, 3.0);
        double res2 = Math.sqrt(m);
        double res3 = Math.cbrt(m);
        System.out.println("Число " + m + " в степени 3: " + res1);
        System.out.println("Квадратный корень из числа " + m + ": " + res2);
        System.out.println("Кубический корень из числа " + m + ": " + res3);

        int maxValue = Math.max(x, a);
        int minValue = Math.min(x, a);
        System.out.println("Имеется два числа: " + x + " и " + a + "\nМаксимальное значение: "+ maxValue + "\nМинимальное значение: " + minValue);
    }
}
