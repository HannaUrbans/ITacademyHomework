package home_work_5.folderToTest.validators;

import home_work_5.folderToTest.exceptions.IncorrectParamException;

public class AllDataValidator implements IDataValidator{
    @Override
    public void validate(String name, String password, String nick) {
        if(password.length() < 5 || password.length() > 10){
            throw new IncorrectParamException("password", "Password must be between 5 and 10");
        }
    }
}

