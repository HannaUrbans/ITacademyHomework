package test.home_work_1;

import home_work_1.GreetingIfElse;
import home_work_1.GreetingIfElseIf;
import home_work_1.GreetingSwitch;
import home_work_1.utils.ICommunicationPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    //создаем массив, содержащий все варианты Greeting
    public final ICommunicationPrinter[] greetings = {
            new GreetingIfElse(),
            new GreetingIfElseIf(),
            new GreetingSwitch()
    };

    //проходим по всем вариантам
    @Test
    public void VasyaInputTest() {
        for (ICommunicationPrinter arrayPart : greetings) {
            String result = arrayPart.welcom("Вася");
            assertEquals("Привет!\nЯ тебя так долго ждал", result, "Приветственное сообщение должно выглядеть так: \"Привет! Я тебя так долго ждал\"");
        }
    }

    @Test
    public void AnastasiyaInputTest() {
        for (ICommunicationPrinter arrayPart : greetings) {
            String result = arrayPart.welcom("Анастасия");
            assertEquals("Я тебя так долго ждал", result, "Приветственное сообщение должно выглядеть так: \"Я тебя так долго ждал\"");
        }
    }

    @Test
    public void notFamiliarInputTest() {
        for (ICommunicationPrinter arrayPart : greetings) {
            String result = arrayPart.welcom("Кристина");
            assertEquals("Добрый день, а вы кто?", result, "Приветственное сообщение должно выглядеть так: \"Добрый день, а вы кто?\"");
        }
    }

}
