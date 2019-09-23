package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * SimpleArray
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 20.09.19
 */
public class SimpleArray<T> implements Iterable<T> {
    /**
     * values - массив элементов
     */
    private final Object[] values;
    private int count;
    /**
     * Конструктор SimpleArray
     * @param elem количество элементов массива
     */
    public SimpleArray(int elem) {
        this.values = new Object[elem];
    }

    /**
     * Iterator
     * @return переопределенный Iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) values[index++];
            }
        };
    }

    /**
     * Метод add добавляет элемент в массив, если переполнен, NoSuchException
     * @param model элемент
     */
    public void add(T model) {
        if (count > values.length - 1) {
            throw new NoSuchElementException();
        }
        values[count++] = model;
    }

    /**
     * Метод set заменяет элемент массива по индексу
     * @param index индекс элемента в массиве
     * @param model элемент
     */
    public void set(int index, T model) {
        if (index > count) {
            throw new NoSuchElementException();
        }
        values[index] = model;
    }

    /**
     * Метод remove удаляет элемент по индексу
     * @param index индекс
     */
    public void remove(int index) {
        if (index > count) {
            throw new NoSuchElementException();
        }
        for (int i = index; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
    }

    /**
     * Метод get возвращает элемент по индексу
     * @param index индекс
     * @return элемент
     */
    public T get(int index) {
        if (index > count) {
            throw new NoSuchElementException();
        }
        return (T) values[index];
    }
}
