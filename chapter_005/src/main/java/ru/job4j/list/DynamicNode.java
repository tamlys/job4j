package ru.job4j.list;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * DynamicNode
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 26.09.19
 */
public class DynamicNode<E> implements Iterable<E> {
    /**
     * first - первый элемент
     */
    private Node<E> first;
    /**
     * current - текущий элемент
     */
    private Node<E> current;
    /**
     * modCount - счётчик изменений
     */
    private int modCount;
    /**
     * size - размер коллекции
     */
    private int size;

    /**
     * iterator - итератор
     * @return переопределенный итератор
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentElement = first;
            int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return currentElement != null;
            }

            @Override
            public E next() {
                E result;
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                result = currentElement.data;
                currentElement = currentElement.next;
                return result;
            }
        };
    }

    /**
     * Метод add
     * Проверяет, если первый элемент пустой, то записывает значение в первую ячейку, иначе в последующую.
     * При каждом добавлении, счётчик изменений и размер коллекции увеличивается на 1
     * @param value значение
     */
    public void add(E value) {
        Node<E> node = new Node<E>(value);
        if (first != null) {
            this.current.next = node;
            this.current = node;
        } else {
            this.first = node;
            this.current = node;
        }
        this.size++;
        this.modCount++;
    }

    /**
     * Метод get
     * Выводит элемент по индексу
     * @param index
     * @return
     */
    public E get(int index) {
        Node<E> target = this.first;
        for (int i = 0; i < index; i++) {
            target = target.next;
        }
        return target.data;
    }

    /**
     * Node - контейнер
     * @param <E> тип данных
     */
    private static class Node<E> {
        /**
         * data - данные
         */
        E data;
        /**
         * next - указатель на следующий элемент
         */
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }
}
