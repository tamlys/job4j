package ru.job4j.tracker;
import java.util.List;

/**
 * ValidateInput
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutExceptiont meo) {
                System.out.println("Не верные данные. Выберите пункт меню от 0 до 6");
            } catch (NumberFormatException nfe) {
                System.out.println("Даннные введены некоректно, введите еще раз");
            }
        }
        while (invalid);
        return value;
    }
}
