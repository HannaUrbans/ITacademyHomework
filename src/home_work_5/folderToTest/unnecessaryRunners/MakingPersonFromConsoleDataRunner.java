package home_work_5.folderToTest.unnecessaryRunners;

import home_work_5.folderToTest.dto.Person;
import home_work_5.folderToTest.validators.*;

import java.util.Scanner;

public class MakingPersonFromConsoleDataRunner {
    public static void main(String[] args) {
        IPasswordValidator passwordValidator = new LengthPasswordValidator();
        IDataValidator dataValidator = new AllDataValidator();
        IPersonValidator personValidator = new PersonValidator();

        Scanner console = new Scanner(System.in);
        System.out.println("Введи имя человека");
        String name = console.nextLine();
        System.out.println("Введите пароль");
        String password = console.nextLine();

        if (passwordValidator.isValid(password)) {
            throw new IllegalArgumentException("Password must be between 5 and 10");
        }

        System.out.println("Введите ник");
        String nick = console.nextLine();

        dataValidator.validate(name, password, nick);

        Person person = new Person(name, password, nick);

        personValidator.validate(person);

        System.out.println(person);
    }
}

