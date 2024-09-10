package home_work_5.folderToTest.suppliers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NameRandomChoiceLangSupplier implements Supplier<String> {

    // Получение текущего экземпляра ThreadLocalRandom для текущего потока
    // для улучшения производительности и избежания блокировок
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private final int length;

    public NameRandomChoiceLangSupplier(int length) {
        this.length = length;
    }

    public NameRandomChoiceLangSupplier() {
        this.length = 10;
    }

    @Override
    public String get() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append( (char) rnd.nextInt(1072, 1104));
        }
        return builder.toString();
    }

}
