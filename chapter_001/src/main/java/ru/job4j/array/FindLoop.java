package ru.job4j.array;
/**
 * Square
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * indexOf
     * @param data название массива
     * @param el значение, которое будем искать
     * @return возвращаем индекс ячейки массива со значением el
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i != data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
