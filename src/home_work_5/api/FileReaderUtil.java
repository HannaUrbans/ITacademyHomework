package home_work_5.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileReaderUtil {
    public static String readFromFile(String filePath) {
        String fileContent = "";

        try {
            InputStream input = new FileInputStream(filePath);
            fileContent = new String(input.readAllBytes(), StandardCharsets.UTF_8);
        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (
                IOException e) {
            System.out.println("Не удалось прочесть файл");
        }
        return fileContent;

    }
}
