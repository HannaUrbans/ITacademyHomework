package home_work_1;

import home_work_1.utils.ICommunicationPrinter;

public class GreetingSwitch implements ICommunicationPrinter {
    /**public static void main(String[] args) {
        GreetingSwitch printer = new GreetingSwitch();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String inputName = in.nextLine().trim();
        in.close();

        if (inputName.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        } else {
            System.out.println(printer.welcom(inputName));
        }
    }*/

    @Override
     public String welcom (String name){
        String message = "";

        switch(name){
        case "Вася":
            message = "Привет!\nЯ тебя так долго ждал";
            break;
        case "Анастасия":
            message = "Я тебя так долго ждал";
            break;
        default:
            message = "Добрый день, а вы кто?";
            break;
    }
    return message;
    }
}
