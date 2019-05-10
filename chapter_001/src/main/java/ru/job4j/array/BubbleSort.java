package ru.job4j.array;
/**
 * BubbleSort
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * sort
     * @param array принимает не сортированный массив с произвольными переменными
     * @return возвращает отсортированный массив переменных
     */
    public int[] sort(int[] array) {
        for (int k = 0; k < 100; k++) {
            for (int i = 0; i != array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }
}
