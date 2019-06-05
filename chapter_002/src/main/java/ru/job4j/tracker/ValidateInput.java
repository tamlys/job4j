package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
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
