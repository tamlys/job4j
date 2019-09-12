package ru.iterator;
import java.util.Iterator;
/**
 * ArrayIterator
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 12.09.19
 */
public class ArrayIterator implements Iterator<Integer> {
    private final int[][] value;
    private int row = 0, col = 0;
    public ArrayIterator(final int[][] value) {
        this.value = value;
    }
    /**
     * Метод hasNext
     * @return проверяет, есть ли следующий элемент. Если есть, то true. Иначе false.
     */
    @Override
    public boolean hasNext() {
        return (row < value.length && col < value[row].length);
    }
    /**
     * Метод next
     * @return возвращает текущий элемент и сдвигает указатель на следующий
     */
    @Override
    public Integer next() {
        int element = value[row][col];
        col++;
        while (row < value.length && col >= value[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}
