package home_work_5.folderToTest.validators;

import home_work_5.folderToTest.exceptions.IncorrectParamException;

public interface IDataValidator {
    /**
     * Проверка данных о пользователе
     * @param name имя
     * @param password пароль
     * @param nick псевдоним
     * @throws IncorrectParamException один из параметров неверный
     */
    void validate(String name, String password, String nick);
}
