package home_work_6;

import home_work_6.utils.ISearchEngine;

import java.io.FileReader;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileJob {
    public static void main(String[] args) throws IOException {
        ISearchEngine obj = new EasySearch();

        if (args.length == 0) {
            System.out.println("Ничего не введено в аргументах командной строки");
            return;
        }
        String directoryInput = args[0];

        //проверяем, были ли введены аргументы при запуске программы
        File directoryPath = new File(directoryInput);
        if (!directoryPath.exists() || !directoryPath.isDirectory()) {
            throw new NullPointerException("Директория не найдена");
        }

        //флаг, который возвращает в главное меню (если true)
        boolean needToChooseNewFilePath = true;
        File bookPath = null;
        File filePath = new File("HomeWork/src/home_work_6/result.txt");

        Scanner input = new Scanner(System.in);
        System.out.println("Список файлов:");
        File[] filesArray = directoryPath.listFiles();

        //выводим в консоль список файлов из аргумента, который был введен при запуске программы
        for (File book : filesArray) {
            if (book !=null){
            System.out.println(book.getPath());
        }}

        //бесконечный цикл, выход из которого осуществляется после break
        while (true) {
            //блок информации, который выводится в так называемом главном меню, при возврате после ввода "НАЗАД"
            if (needToChooseNewFilePath) {
                System.out.println("Введите адрес файла");
                bookPath = new File(input.nextLine());

                if (bookPath.exists() && bookPath.isFile()) {
                    needToChooseNewFilePath = false;
                } else {
                    System.out.println("Вы ввели неправильный адрес файла. Введите ещё раз адрес файла");
                    needToChooseNewFilePath = true;
                }
            } else {
                System.out.print("1. Введите слово для поиска в именительном падеже и единственном числе\n2. Введите \"СТОП\", чтобы закончить поиск \n3. Введите \"НАЗАД\" для выбора другого адреса\n");
                String wordToFind = input.nextLine().trim();

                //выход из цикла
                if (Objects.equals(wordToFind, "СТОП")) {
                    File pathResFile = new File("HomeWork/src/home_work_6/result.txt");
                    //перед выходом показываем содержимое файла с результатами поисков
                    System.out.println(readFile(pathResFile));
                    break;
                } else if (Objects.equals(wordToFind, "НАЗАД")) {
                    //возврат в главное меню
                    needToChooseNewFilePath = true;
                } else {
                    //блок, выполняемый после ввода слов для поиска
                    String text = readFile(bookPath);
                    Long quantity = obj.search(text, wordToFind);
                    if (quantity >= 0) {
                        //заполняем файл в т.ч.нулевыми результатами
                        updateResultsFile(wordToFind, quantity, filePath);
                    }
                    System.out.println("Количество упоминаний слова " + wordToFind + ": " + quantity);
                }
            }
        }
        input.close();
    }

    /**
     * Метод для чтения содержимого файлов
     *
     * @param textPath - адрес файла
     * @return - текст стринг
     */
    public static String readFile(File textPath) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(textPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new NullPointerException("Ошибка при чтении файла");
        }

        return sb.toString();
    }

    /**
     * Метод для добавления информации в файл result.txt (не перезаписи, а записи к уже существующим данным)
     *
     * @param word     - слово для поиска
     * @param quantity - сколько раз встречается искомое слово
     * @param filePath - адрес файла, в который записывается информация
     */
    public static void updateResultsFile(String word, Long quantity, File filePath)  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(word + ": " + quantity + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Не удалось обновить файл");
        }
    }
}

