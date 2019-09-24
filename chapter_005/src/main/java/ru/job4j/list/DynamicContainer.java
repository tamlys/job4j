package ru.job4j.list;

import java.util.*;
/**
 * DynamicContainer
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 24.09.19
 */
public class DynamicContainer<E> implements Iterable<E> {
    /**
     * container - массив элементов типа Object
     */
    private Object[] container;
    /**
     * modCount - счётчик изменений
     */
    private int modCount;
    private int count;

    /**
     * Конструктор DynamicContainer
     * @param elem количество элементов
     */
    public DynamicContainer(int elem) {
        this.container = new Object[elem];
    }

    /**
     * Метод add
     * Добавляет новые элементы, если массив переполнен, увеличиться.
     * @param value элемент
     */
    public void add(E value) {
        if (count > container.length - 1) {
            container = changeLength();
        }
        container[count++] = value;
        modCount++;
    }

    /**
     * Метод get
     * Выводит элемент по идентификатору
     * @param index идентификатор
     * @return найденный элемент
     */
    public E get(int index) {
        if (index > count) {
            throw new NoSuchElementException();
        }
        return (E) container[index];
    }

    /**
     * Метод changeLength
     * Если массив заполниться, увеличивает его размер
     * @return массив нового размера
     */
    public Object[] changeLength() {
        int newLength = container.length * 2;
        return Arrays.copyOf(container, newLength);
    }

    /**
     * Итератор Iterator
     * @return переопределенный Iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int expectedModCount = modCount;
            int index = 0;

            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return index < count;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) container[index++];
            }
        };
    }
}
