package home_work_5.folderToTest.suppliers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NameRandomSupplier implements Supplier<String> {

    // Получение текущего экземпляра ThreadLocalRandom для текущего потока
    // для улучшения производительности и избежания блокировок
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    // Метод генерации имени из рандомного числа
    @Override
    public String get() {
        return String.valueOf(rnd.nextInt());
    }
}

