package home_work_1;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        int firstRes = 5 + a / b;
        /*
        1) 2/8 = 0;
        2) 5+0=5;
        */

        int secondRes = (5 + a) / b;
        /*
        1) 5+2 = 7;
        2) 7/8 = 0;
        */

        int thirdRes = (5 + a++) / b;
        /*
        1) 5+2 = 7;
        2) 7/8 = 0;
        */

        a = 2;
        int fourthRes = (5 + a++) / --b;
        /*
        1) b = 7;
        2) 5+2 = 7;
        3) 7/7 = 1;
        */

        a = 2;
        b = 8;
        int fifthRes = (5 * a >> a++) / --b;
        /*
        1) b = 7;
        2) 5*2 = 10;
        3) 10 в двоичной системе -> 00001010;
        4) смещаем 00001010 на 2 элемента вправо -> 00000010 -> 2 в десятичной;
        5) 2/7 = 0;
        */

        a = 2;
        b = 8;
        int sixthRes = (5 + 7 > 20 ? 68 : 22 * a >> a++) / --b;
        /*
        1) b = 7;
        2) 22*2 = 44;
        3) 44 в двоичной системе -> 00101100;
        4) смещаем 00101100 на 2 элемента вправо -> 00001011 -> 11 в десятичной;
        5) 5+7 < 20 -> выбираем 11
        6) 11/7 = 1;
        */

        a = 2;
        b = 8;
        /*int seventhRes = (5 + 7 > 20 ? 68 >= 68 : 22 * a >> a++) / --b;
        ошибка компиляции
        обе ветви (истина и ложь) тернарного оператора (?:) должны возвращать значения одного типа (у нас же "68 >= 68" -> true, "22 * a >> a++" -> int);
        */

        a = 2;
        b = 8;
        boolean eighthRes = 6 - a > 3 && 12 * 12 <= 119;
        /*
        1) 6-2 = 4;
        2) 12*12 = 144;
        3) 4>3 -> true;
        4) 144>119 -> false;
        5) true && false -> один из операторов = false -> false;
        */

        boolean ninthRes = true && false;
        // один из операторов = false -> false;

        System.out.println(firstRes + "\n" + secondRes+ "\n" + thirdRes+ "\n" + fourthRes + "\n" + fifthRes + "\n" + sixthRes + "\n" + eighthRes + "\n" + ninthRes);
    }
}


