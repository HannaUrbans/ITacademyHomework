package test.home_work_6;

import home_work_6.MultithreadSearch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MultithreadSearchTest {
    private static final String TEST_FILE_PATH = "home_work_6/src/test/home_work_6/testfile.txt";
    private static final String RESULT_FILE_PATH = "home_work_6/src/test/home_work_6/resultfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Убедитесь, что директория существует
        Files.createDirectories(Paths.get("home_work_6/src/test/home_work_6"));

        File testFile = new File(TEST_FILE_PATH);
        if (!testFile.exists()) {
            Files.createFile(Paths.get(TEST_FILE_PATH));
        }

        String content = "Другой популярный представитель жанра — книга-автобиография руководителей бизнеса, книга в которой описывается становление (о, книга) и жизненный путь тех, о ком иная Книга умолчит и не расскажет (книиига, книга! кни-ига)";
        Files.write(Paths.get(TEST_FILE_PATH), content.getBytes());

        Files.deleteIfExists(Paths.get(RESULT_FILE_PATH));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
        Files.deleteIfExists(Paths.get(RESULT_FILE_PATH));
    }

    private String normalizeLineEndings(String input) {
        return input.replace("\r\n", "\n").replace("\r", "\n");
    }

    @DisplayName("Проверка чтения содержимого файла")
    @Test
    void readFileTest() {
        String expected = "Другой популярный представитель жанра — книга-автобиография руководителей бизнеса, книга в которой описывается становление (о, книга) и жизненный путь тех, о ком иная Книга умолчит и не расскажет (книиига, книга! кни-ига)";
        assertEquals(normalizeLineEndings(expected.trim()), normalizeLineEndings(MultithreadSearch.readFile(new File(TEST_FILE_PATH)).trim()));
    }

    @DisplayName("Проверка обработки исключения при чтении несуществующего файла")
    @Test
    void readIfFileAbsentTest() {
        File absentFile = new File("hello.txt");
        try {
            MultithreadSearch.readFile(absentFile);
            fail("Expected an IOException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Ошибка при чтении файла", e.getMessage());
        }
    }

    @DisplayName("Проверка записи одной строки в файл")
    @Test
    void updateResults1InputTest() throws IOException {
        String word = "автор";
        Long quantity = 5L;

        MultithreadSearch.updateResultsFile(word, quantity, new File(RESULT_FILE_PATH));

        String expectedContent = word + ": " + quantity + "\n";
        String resultContent = new String(Files.readAllBytes(Paths.get(RESULT_FILE_PATH)));
        assertEquals(normalizeLineEndings(expectedContent), normalizeLineEndings(resultContent));
    }

    @DisplayName("Проверка записи строки с нулевым количеством в файл")
    @Test
    void updateResultsZeroCaseInputTest() throws IOException {
        String word = "авторка";
        Long quantity = 0L;

        MultithreadSearch.updateResultsFile(word, quantity, new File(RESULT_FILE_PATH));

        String expectedContent = word + ": " + quantity + "\n";
        String resultContent = new String(Files.readAllBytes(Paths.get(RESULT_FILE_PATH)));
        assertEquals(normalizeLineEndings(expectedContent), normalizeLineEndings(resultContent));
    }

    @DisplayName("Проверка записи нескольких строк в файл")
    @Test
    void updateResultsSeveralInputsTest() throws IOException {
        MultithreadSearch.updateResultsFile("классика", 158L, new File(RESULT_FILE_PATH));
        MultithreadSearch.updateResultsFile("трон", 2L, new File(RESULT_FILE_PATH));

        String expectedContent = "классика: 158\nтрон: 2\n";
        String resultContent = new String(Files.readAllBytes(Paths.get(RESULT_FILE_PATH)));
        assertEquals(normalizeLineEndings(expectedContent), normalizeLineEndings(resultContent));
    }
}
