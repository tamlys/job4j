package ru.job4j.array;
import java.util.Arrays;
/**
 * ArrayDuplicate
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * remove
     * @param array название массива
     * newLenght длина массива, после изменения
     * @return возвращаем массив без дубликатов
     * Первый цикл мы проходим по всем элементам, второй делаем на 1 больше и сравниваем эти элементы.
     * При совпадении переносим дубликат на последнее место и уменьшаем длину массива.
     */
    public String[] remove(String[] array) {
        int newLenght = array.length;
        for (int i = 0; i < newLenght; i++) {
            for (int k = i + 1; k < newLenght; k++) {
                if (array[i].equals(array[k])) {
                    String tmp = array[newLenght - 1];
                    array[newLenght - 1] = array[k];
                    array[k] = tmp;
                    newLenght--;
                    k--;
                }
            }
        }
        return Arrays.copyOf(array, newLenght);
    }
}
