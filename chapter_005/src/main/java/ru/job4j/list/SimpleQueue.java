package ru.job4j.list;
/**
 * SimpleQueue
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class SimpleQueue<T> {
    private SimpleStack<T> in;
    private SimpleStack<T> out;
    private int position;

    public SimpleQueue() {
        this.in = new SimpleStack<>();
        this.out = new SimpleStack<>();
    }

    /**
     * Метод poll
     * Если коллекция out пустая, она заполняется элементами из колллекции in до тех пор, пока in не будет пустая
     * @return возвращает значение и удаляет его из коллекции out
     */
    public T poll() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.poll());
            }
        }
        return out.poll();
    }

    /**
     * Метод push
     * Добавляет значение в коллекцию
     * @param value значение
     */
    public void push(T value) {
        this.in.push(value);
        this.position++;
    }
}