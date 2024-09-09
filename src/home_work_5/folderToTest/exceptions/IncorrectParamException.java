package home_work_5.folderToTest.exceptions;

/**
 * Конструктор IncorrectParamException принимает два аргумента:
 * param: имя параметра, который вызвал ошибку.
 * message: сообщение об ошибке, которое объясняет, почему параметр некорректен.
 * Он передает message конструктору IllegalArgumentException и сохраняет param в поле paramName.
 */
public class IncorrectParamException extends IllegalArgumentException {
    private final String paramName;

    public IncorrectParamException(String param, String message) {
        super(message);
        this.paramName = param;
    }

    public String getParamName() {
        return paramName;
    }
}

