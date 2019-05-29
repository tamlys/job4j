package ru.job4j.tracker;
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
}
