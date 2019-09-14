package ru.iterator;
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
    private int position = -1;
    /**
     * nextStep - определяет, вызывался ли метод next. При многократном использовании hasNext, не сдвигает каретку
     */
    private boolean nextStep = false;

    public EvenIterator(final int[] value) {
        this.value = value;
    }
    /**
     * Метод hasNext
     * @return возвращает true, только если в массиве есть четные перед указателем
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = position + 1; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                result = true;
                if (nextStep) {
                    position = i;
                    nextStep = false;
                }
                break;
            }
        }
        return result;
    }
    /**
     * Метод next
     * @return возвращают только четные числа
     */
    @Override
    public Integer next() {
        nextStep = true;
        if (!hasNext()) {
            position++;
            throw new NoSuchElementException();
        }
        return value[position];
    }
}