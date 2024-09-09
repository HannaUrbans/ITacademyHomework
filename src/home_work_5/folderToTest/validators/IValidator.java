package home_work_5.folderToTest.validators;

import home_work_5.folderToTest.exceptions.IncorrectParamException;

public interface IValidator<T> {
    void validate(T item) throws IncorrectParamException;;
}

