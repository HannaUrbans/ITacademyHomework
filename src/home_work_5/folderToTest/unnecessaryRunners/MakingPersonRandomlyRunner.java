package home_work_5.folderToTest.unnecessaryRunners;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class MakingPersonRandomlyRunner {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int minCyrCharCode = 1072;
        final int maxCyrCharCode = 1104;
        final int minLatCharCode = 97;
        final int maxLatCharCode = 122;

        String value1 = generateRandomNumberString(rnd);
        String value2 = generateRandomCyrillicString(rnd, 20, minCyrCharCode, maxCyrCharCode);
        String value3 = generateRandomCyrillicString(rnd, 20, minLatCharCode, maxLatCharCode);
        String value4 = getRandomNameFromArray(new String[]{"Авдей", "Авксентий", "Агапит", "Богдан", "Борис", "Вавила", "Вадим", "Валентин"}, rnd);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        try {
            String value5 = getRandomNameFromFile("C:\\Users\\user\\IdeaProjects\\it-academy\\JD1\\HomeWork\\src\\home_work_5\\folderToTest\\namesPerson.txt", rnd);
            System.out.println(value4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**

     */
    private static String generateRandomNumberString(Random rnd) {
        return String.valueOf(rnd.nextInt());
    }

    /**
     * Метод рандомно генерирует инт, инт переводится в чар,
     * чары соединяются в слово
     *
     * @param rnd     - объект класса Random
     * @param length  - требуемая длина имени
     * @param minChar - нижняя граница интервала (буква а)
     * @param maxChar - верхняя граница интервала (буква я)
     * @return Стринг имя из случайно добавленных букв кириллицы
     */
    private static String generateRandomCyrillicString(Random rnd, int length, int minChar, int maxChar) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append((char) (rnd.nextInt(maxChar - minChar + 1) + minChar));
        }
        return builder.toString();
    }

    /**
     * Метод рандомно генерирует инт, инт переводится в чар,
     * чары соединяются в слово
     *
     * @param rnd     - объект класса Random
     * @param length  - требуемая длина имени
     * @param minChar - нижняя граница интервала (буква а)
     * @param maxChar - верхняя граница интервала (буква z)
     * @return Стринг имя из случайно добавленных букв латиницы
     */
    private static String generateRandomLatinString(Random rnd, int length, int minChar, int maxChar) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append((char) (rnd.nextInt(maxChar - minChar + 1) + minChar));
        }
        return builder.toString();
    }


    /**
     *
     *
     * @param names - список имен в массиве
     * @param rnd   - объект класса Random
     * @return Рандомно выбранное из массива имя
     */
    private static String getRandomNameFromArray(String[] names, Random rnd) {
        return names[rnd.nextInt(names.length)];
    }


    /**
     *
     *
     * @param filePath - адрес файла
     * @param rnd - объект класса Random
     * @return Рандомно выбранное из файла имя
     * @throws IOException
     */
    private static String getRandomNameFromFile(String filePath, Random rnd) throws IOException {
        String[] namesFromFile = Files.readString(Path.of(filePath)).split("\n");
        return namesFromFile[rnd.nextInt(namesFromFile.length)];
    }
}

