package ru.job4j.tracker;

import java.util.List;

/**
 * StubInput
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     */
    private final String[] value;
    /**
     * Поле считает количество вызовом метода ask. При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }
    /**
     * Метод ask возвращает данные на вопросы. При каждом увеличении счетчика, он будет возвращать новое значение
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, List<Integer> range) throws MenuOutExceptiont {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value: range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutExceptiont("Не верные данные. Выберите пункт меню от 0 до 6");
        }
        return key;
    }
}
