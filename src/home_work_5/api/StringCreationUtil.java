package home_work_5.api;

import java.util.EnumSet;
import java.util.Random;

public class StringCreationUtil {
    /**
     * Метод по рандомному генерированию String из строк, перечисленных в ENUM
     * @param minLength - минимально возможная длина готовой строки
     * @param maxLength - максимально возможная длина готовой строки
     * @param characterTypes - списки, состоящие из String из Enum
     * @return
     */
    public static String generateRandomStringFromEnum(int minLength, int maxLength, EnumSet<Characters> characterTypes) {
        Random random = new Random();

        //если minLength = maxLength, то в скобках будет 0, а nextInt не принимает 0, значит нужно добавить 1
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        // Собираем стрингбилдер из символов
        StringBuilder charList = new StringBuilder();
        for (Characters character : characterTypes) {
            charList.append(character.getCharacters());
        }

        // Конвертируем стрингбилдер из символов в массив
        char[] charArray = charList.toString().toCharArray();

        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charArray.length);
            result.append(charArray[index]);
        }
        return result.toString();
    }

    /**
     * Метод по рандомному генерированию String из элементов массива
     * @param array - массив с данными
     * @return - один из элементов массива, которого выбирается с помощью рандомного индекса
     */
    public static String generateRandomStringFromArray(String[] array) {
        Random random = new Random();

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int index = random.nextInt(array.length);

        return array[index];
    }

    /**
     * Метод по рандомному генерированию String из внешнего файла
     * @param input - уже прочитанные с помощью метода из FileReaderUtil в виде String, которые впоследствии делятся на массив строк
     * @return - один из элементов массива, которого выбирается с помощью рандомного индекса
     */
    public static String generateRandomStringFromFile(String input) {
        String[] array = input.split("[,;\\s\\r\\n]+");
        return generateRandomStringFromArray(array);
    }

}
