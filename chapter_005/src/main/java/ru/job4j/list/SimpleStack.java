package ru.job4j.list;
/**
 * SimpleStack
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class SimpleStack<T> {
    private SimpleArrayList<T> simpleArrayList;
    public SimpleStack() {
        this.simpleArrayList = new SimpleArrayList<>();
    }

    /**
     * Метод poll
     * @return возвращает значение и удаляет его из коллекции
     */
    public T poll() {
        return simpleArrayList.delete();
    }

    /**
     * Метод push
     * Добавляет значение в коллекцию
     * @param value значение
     */
    public void push(T value) {
        simpleArrayList.add(value);
    }
}
