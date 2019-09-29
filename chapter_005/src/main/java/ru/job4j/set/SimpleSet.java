package ru.job4j.set;

import ru.job4j.list.DynamicContainer;
import java.util.Iterator;
/**
 * SimpleSet
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 29.09.19
 */
public class SimpleSet<E> implements Iterable<E> {
    private DynamicContainer<E> dynamicContainer;

    public SimpleSet() {
        this.dynamicContainer = new DynamicContainer<>(10);

    }

    @Override
    public Iterator<E> iterator() {
        return dynamicContainer.iterator();
    }

    /**
     * Метод add
     * Если добавляемый элемент еще не присутствует в списке, добавляет его.
     * @param e элемент
     */
    public void add(E e) {
        boolean dublicate = false;
        for (E value : dynamicContainer) {
            if (value.equals(e)) {
                dublicate = true;
                break;
            }
        }
        if (!dublicate) {
            dynamicContainer.add(e);
        }
    }
}
