package home_work_5.folderToTest.suppliers;

import home_work_5.folderToTest.dto.Person;

import java.util.function.Supplier;

public class PersonSupplier implements Supplier<Person>{
    private final Supplier<String> nickSupplier;
    private final Supplier<String> passwordSupplier;
    private final Supplier<String> nameSupplier;

    public PersonSupplier(Supplier<String> nickSupplier,
                          Supplier<String> passwordSupplier,
                          Supplier<String> nameSupplier) {
        this.nickSupplier = nickSupplier;
        this.passwordSupplier = passwordSupplier;
        this.nameSupplier = nameSupplier;
    }

    @Override
    public Person get() {
        return new Person(
                nickSupplier.get(),
                passwordSupplier.get(),
                nameSupplier.get());
    }
}

