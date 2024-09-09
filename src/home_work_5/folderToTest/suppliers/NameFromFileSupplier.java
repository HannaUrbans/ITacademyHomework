package home_work_5.folderToTest.suppliers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.function.Supplier;

public class NameFromFileSupplier implements Supplier<String> {
    private final String filePath;
    private final Random random = new Random();

    public NameFromFileSupplier(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String get() {
        try {
            String[] namesFromFile = Files.readString(Path.of(filePath)).split("\\R+");
            return namesFromFile[random.nextInt(namesFromFile.length)];
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading file";
        }
    }
}
