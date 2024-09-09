package home_work_5.folderToTest.suppliers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NameArraySupplier implements Supplier<String> {

    // Получение текущего экземпляра ThreadLocalRandom для текущего потока
    // для улучшения производительности и избежания блокировок
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private final String[] names;

    public NameArraySupplier(String[] names) {
        this.names = names;
    }

    public NameArraySupplier() {
        this.names = new String[]{"Авдей", "Авксентий", "Агапит", "Богдан", "Борис", "Вавила", "Вадим", "Валентин"};
    }

    //  Метод случайно генерирует число в границах размера массива, число - порядковый номер элемента в массиве
    @Override
    public String get() {
        return this.names[rnd.nextInt(this.names.length)];
    }
}

