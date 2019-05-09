package ru.job4j.array;

/**
 * Check
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * mono
     * @param data название массива
     * @return если все значения в массиве равны, то возвращает true, иначе false
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i != data.length - 1; i++) {
            result = data[i] == data[data.length - 1];
        }
        return result;
    }
}
