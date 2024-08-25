package home_work_5.api;

import java.util.EnumSet;
import java.util.Random;

import static home_work_5.api.Characters.*;
import static home_work_5.api.Characters.LATIN_LETTERS;

public class AnimalCreationUtil {
    static Random random = new Random();

    static EnumSet<Characters> characterSetGeneral = EnumSet.of(LATIN_LETTERS, CYRILLIC_LETTERS, DIGITS, SPECIAL_CHARACTERS);
    static EnumSet<Characters> characterSetCyrillic = EnumSet.of(CYRILLIC_LETTERS);

    static String[] arrayOfAnimalNicks = {"Тузик", "Мурзик", "Белка", "Стрелка"};

    static String nickFilePath = "C:/Users/user/IdeaProjects/it-academy/JD1/HomeWork/src/home_work_5/files/namesAnimal.txt";

    public static int generateAge(int minAge, int maxAge) {
        if (minAge > maxAge) {
            throw new IllegalArgumentException("Указан неверный диапазон");
        }

        return random.nextInt(maxAge - minAge + 1) + minAge;
    }


    public static String generateAnimalNick() {
        int nickGeneration = random.nextInt(4);

        String nick = "";

        // макс длина строки выбрана мной для удобства чтения, число может быть любым
        switch (nickGeneration) {
            case 0:
                nick = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetGeneral);
                break;
            case 1:
                nick = StringCreationUtil.generateRandomStringFromEnum(1, 25, characterSetCyrillic);
                break;
            case 2:
                nick = StringCreationUtil.generateRandomStringFromArray(arrayOfAnimalNicks);
                break;
            case 3:
                String fileNickContent = FileReaderUtil.readFromFile(nickFilePath);
                nick = StringCreationUtil.generateRandomStringFromFile(fileNickContent);
                break;
        }
        return nick;
    }

}
