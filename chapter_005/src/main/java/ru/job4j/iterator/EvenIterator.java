package ru.job4j.iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * EvenIterator
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 14.09.19
 */
public class EvenIterator implements Iterator<Integer> {
    /**
     * Value - массив элементов
     */
    private final int[] value;
    /**
     * Position - каретка
     */
    private int position = 0 ;

    public EvenIterator(final int[] value) {
        this.value = value;
    }
    /**
     * Метод hasNext
     * @return возвращает true, только если в массиве есть четные перед указателем
     */
    @Override
    public boolean hasNext() {
        while (position < value.length) {
            if (value[position] % 2 == 0) {
                break;
            }
            position++;
        }
        return position < value.length;
    }
    /**
     * Метод next
     * @return возвращают только четные числа
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return value[position++];
    }
}