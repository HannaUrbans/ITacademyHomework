package home_work_5.folderToTest.validators;

import home_work_5.folderToTest.dto.Person;
import home_work_5.folderToTest.exceptions.IncorrectParamException;

public class PersonValidator implements IPersonValidator{
    @Override
    public void validate(Person person) {
        String password = person.getPassword();
        if(password == null || password.isEmpty()){
            throw new IncorrectParamException("password", "Password cannot be null or empty");
        }
        if(password.length() < 5 || password.length() > 10){
            throw new IncorrectParamException("password", "Password must be between 5 and 10");
        }
    }
}

