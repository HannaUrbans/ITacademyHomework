package home_work_6;

import home_work_6.utils.ISearchEngine;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Создаётся пул потоков с фиксированным количеством потоков, что позволяет обрабатывать несколько файлов одновременно.
 * Задача на поиск слова в файле отправляется в пул потоков.
 * Каждая задача возвращает количество найденных вхождений слова, и результат суммируется в переменной totalCount.
 * После завершения поиска по всем файлам общее количество вхождений слова записывается в файл result.txt.
 * Пул потоков завершает свою работу, и программа ожидает завершения всех активных задач.
 */
public class MultithreadSearch {
    public static void main(String[] args) throws IOException {
        ISearchEngine searchEngine = new EasySearch();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите адрес папки с текстовыми файлами: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Такой папки не существует");
            return;
        }

        // создаётся пул потоков с фиксированным количеством потоков
        //хорошая практика — устанавливать количество потоков равным количеству доступных ядер или немного больше
        ExecutorService executor = Executors.newFixedThreadPool(4);

        while (true) {
            System.out.print("1. Введите слово для поиска в именительном падеже и единственном числе\n2. Введите \"СТОП\", чтобы закончить поиск: ");
            String wordToFind = scanner.nextLine().trim();
            if (Objects.equals("СТОП", wordToFind)) {
                break;
            }

            long totalCount = 0; // Общее количество найденных слов

            for (File file : Objects.requireNonNull(directory.listFiles((dir, name) -> name.endsWith(".txt")))) {
                //объект Future будет хранить результат выполнения задачи
                // submit отправляет задачу на выполнение в пул потоков
                Future<Long> future = executor.submit(() -> {
                    String content = readFile(file);
                    return searchEngine.search(content, wordToFind);
                });
                try {
                    //future.get() блокирует выполнение текущего потока до тех пор, пока задача, ассоциированная с этим Future, не завершится.
                    // Как только задача завершится, get() вернёт количество вхождений слова в файл
                    totalCount += future.get(); // Получаем результат выполнения задачи
                } catch (Exception e) {
                    System.err.println("Ошибка при получении результата: " + e.getMessage());
                }
            }

            File resultFile = new File("HomeWork/src/home_work_6/result.txt");
            updateResultsFile(wordToFind, totalCount, resultFile);
        }

        //завершение работы пула потоков и ожидание завершения всех запущенных задач
        //Этот вызов сообщает пулу, что больше не будет новых задач, и он должен завершить выполнение текущих задач
        executor.shutdown();
        try {
            //блокирует текущий поток до тех пор, пока не завершатся все задачи в пуле или пока не истечёт заданный таймаут
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            //устанавливает флаг прерывания текущего потока
            Thread.currentThread().interrupt();
        }

        readResults();
        scanner.close();
    }

    public static String readFile(File file) {
        StringBuilder content = new StringBuilder();
        try {
            content.append(Files.readString(Paths.get(file.getPath())));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла", e);
        }
        return content.toString();
    }

    public static void updateResultsFile(String word, long quantity, File filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(word + ": " + quantity + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException("Не удалось обновить файл", e);
        }
    }

    private static void readResults() {
        File resultFile = new File("HomeWork/src/home_work_6/result.txt");
        if (resultFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(resultFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла результатов");
            }
        } else {
            System.out.println("Файл результатов не найден.");
        }
    }

}
