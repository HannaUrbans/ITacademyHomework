package home_work_5.folderToCorrect.api;

import java.util.EnumSet;
import java.util.Random;

import static home_work_5.folderToCorrect.api.Characters.*;

/**
 * Класс для генерации объекта типа Person
 * Пароль генерируется с помощью метода generateRandomStringFromEnum из класса StringCreationUtil
 * При генерации имени и ника рандомно выбирается одно из чисел, каждому из чисел соответствует свой метод в switch
 */

public class PersonCreationUtil {
    static Random random = new Random();

    static EnumSet<Characters> characterSetGeneral = EnumSet.of(LATIN_LETTERS, CYRILLIC_LETTERS, DIGITS, SPECIAL_CHARACTERS);
    static EnumSet<Characters> characterSetCyrillic = EnumSet.of(CYRILLIC_LETTERS);
    static EnumSet<Characters> characterSetLatin = EnumSet.of(LATIN_LETTERS);

    static String[] arrayOfNames = {"Авдей", "Авксентий", "Агапит", "Богдан", "Борис", "Вавила", "Вадим", "Валентин"};

    static String nameFilePath = "C:/Users/user/IdeaProjects/it-academy/JD1/HomeWork/src/home_work_5/files/namesPerson.txt";
    static String nickFilePath = "C:/Users/user/IdeaProjects/it-academy/JD1/HomeWork/src/home_work_5/files/nicknames.txt";

    public static String generatePersonNick() {
        int nickGeneration = random.nextInt(3);

        String nick = "";

        // макс длина строки выбрана мной для удобства чтения, число может быть любым
        switch (nickGeneration) {
            case 0:
                nick = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetGeneral);
                break;
            case 1:
                nick = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetLatin);
                break;
            case 2:
                String fileNickContent = FileReaderUtil.readFromFile(nickFilePath);
                nick = StringCreationUtil.generateRandomStringFromFile(fileNickContent);
                break;
        }
        return nick;
    }

    public static String generatePassword(int passwordMinLength, int passwordMaxLength) {
        if (passwordMinLength > passwordMaxLength) {
            throw new IllegalArgumentException("Указан неверный диапазон");
        }

        EnumSet<Characters> characterPasswordSet = EnumSet.of(LATIN_LETTERS, DIGITS, SPECIAL_CHARACTERS);
        return StringCreationUtil.generateRandomStringFromEnum(5, 10, characterPasswordSet);
    }

    public static String generateName() {
        String name = "";

        int nameGeneration = random.nextInt(4);
        // макс длина строки выбрана мной для удобства чтения, число может быть любым
        switch (nameGeneration) {
            case 0:
                name = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetGeneral);
                break;
            case 1:
                name = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetCyrillic);
                break;
            case 2:
                name = StringCreationUtil.generateRandomStringFromArray(arrayOfNames);
                break;
            case 3:
                String fileNameContent = FileReaderUtil.readFromFile(nameFilePath);
                name = StringCreationUtil.generateRandomStringFromFile(fileNameContent);
                break;
        }
        return name;
    }
}
