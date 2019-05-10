package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BubbleSortTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    /**
     * whenSortArrayWithTenElementsThenSortedArray
     * Принимает неотсортированный массив с переменными {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
     * После сортировки массива {0, 1, 1, 2, 3, 4, 5, 5, 7, 8}
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] array = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bs.sort(array);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }

}
