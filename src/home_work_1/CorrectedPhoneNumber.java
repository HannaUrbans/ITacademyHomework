
package home_work_1;

import java.util.Scanner;

public class CorrectedPhoneNumber {
    public static char[] inputArray;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 цифр номера");
        String input = in.nextLine().trim();
        in.close();

        checkCorrectInput(input);

        System.out.println(createPhoneNumber(inputArray));
    }

    public static String createPhoneNumber(char[] inputArray) {
        return String.format("(%c%c%c) %c%c%c-%c%c%c%c", inputArray[0], inputArray[1], inputArray[2],
                inputArray[3], inputArray[4], inputArray[5], inputArray[6], inputArray[7], inputArray[8], inputArray[9]);
    }

    public static void checkCorrectInput(String input) {
        inputArray = new char[input.length()];
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Вы ничего не ввели");
        }

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.charAt(i);
            if (!Character.isDigit(inputArray[i])) {
                throw new IllegalArgumentException("Введите только цифры без пробелов, букв и иных символов");
            }
        }

        if (inputArray.length < 10) {
            throw new IllegalArgumentException("Вы ввели менее 10 цифр");
        }

        if (inputArray.length > 10) {
            throw new IllegalArgumentException("Вы ввели более 10 цифр");
        }
    }
}


