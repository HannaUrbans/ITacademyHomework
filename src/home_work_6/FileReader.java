package home_work_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// чтение из файла осуществляется с помощью BufferedInputStream вместе с FileReader
public class FileReader {
//    public static void main(String[] args) throws IOException {
//        File filePath = new File("C:/Users/user/IdeaProjects/it-academy/JD1/HomeWork/src/home_work_6/Война и мир_книга.txt");
//
//        System.out.println(readFile(filePath));
//    }

    public static String readFile(File filePath) throws IOException {
        StringBuilder sb = new StringBuilder();

        if (filePath.exists() && filePath.isFile() && filePath.canRead()) {
            try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
                //хранит содержимое текущей строки, считываемой из файла
                //построчное чтение:
                //1. позволяет начинать обработку данных до того, как весь файл будет прочитан
                //2. работа с содержимым файла начинается уже когда считается первая строка, а не весь файл
                //3. меньше нагрузка на оперативную память
                String line = "";
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException e) {
                System.err.println("Произошла ошибка при чтении файла");
            }
        } else {
            if (!filePath.exists()) {
                throw new FileNotFoundException("Введён неверный путь файла");
            } else if (!filePath.isFile()) {
                throw new IOException(filePath + " не является файлом");
            } else if (!filePath.canRead()) {
                throw new IOException(filePath + " не доступен для чтения");
            }
        }
        return sb.toString();
    }

}
