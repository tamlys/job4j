package ru.job4j.list;

/**
 * LinkedNodeCycle
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class LinkedNodeCycle {
    /**
     * Класс предназначен для хранения данных
     */
    public class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<Integer> first = new Node<>(1);
    private Node<Integer> two = new Node<>(2);
    private Node<Integer> third = new Node<>(3);
    private Node<Integer> four = new Node<>(4);

    /**
     * Cycle - цикл
     */
    public void cycle() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
    }
    /**
     * Метод hasCycle
     * Определяет есть ли зацикленность в списке
     * @param first первый элемент списка
     * @return true, если список зацикленн
     */
    boolean hasCycle(Node first) {
        Node low = first;
        Node fast = first;
        while (low != null && low.next != null) {
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                return true;
            }
        }
        return false;
    }

    public Node getFirst() {
        return this.first;
    }

}
