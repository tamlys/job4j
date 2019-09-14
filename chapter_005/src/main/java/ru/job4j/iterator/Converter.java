package ru.job4j.iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Converter
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 14.09.19
 */
public class Converter {
    /**
     * Метод объединяет вложенные итераторы
     * @param it итератор итераторов
     * @return объединенный итератор
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Iterator<Integer> iterator;
            /**
             * Метод hasNext объединенного итератора
             * @return true, если есть следующий элемент
             */
            @Override
            public boolean hasNext() {
                while (iterator == null || (it.hasNext() && !iterator.hasNext())) {
                    iterator = it.next();
                }
                return iterator.hasNext();
            }
            /**
             * Метод next объединенного итератора
             * @return следующий элемент
             */
            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return iterator.next();
            }
        };
    }
}
