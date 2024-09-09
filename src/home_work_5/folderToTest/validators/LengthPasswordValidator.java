package home_work_5.folderToTest.validators;

public class LengthPasswordValidator implements IPasswordValidator{
    @Override
    public boolean isValid(String password) {
        return password.length() > 100;
    }
}

