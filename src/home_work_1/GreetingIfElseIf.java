package home_work_1;

import home_work_1.utils.ICommunicationPrinter;

import java.util.Objects;

public class GreetingIfElseIf implements ICommunicationPrinter {
    /*public static void main(String[] args) {
        GreetingIfElseIf printer = new GreetingIfElseIf();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String inputName = in.nextLine().trim();
        in.close();

        if (inputName.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        }
        else {
            System.out.println(printer.welcom(inputName));}}*/

    @Override
    public String welcom(String name){
        String message = "";
        if (Objects.equals(name, "Вася")){
            message = "Привет!\nЯ тебя так долго ждал";
        }
        else if (Objects.equals(name, "Анастасия")){
            message = "Я тебя так долго ждал";
        }
        else{
            message = "Добрый день, а вы кто?";
        }
        return message;
    }
    }


