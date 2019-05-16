package ru.job4j.array;
/**
 * Square
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * calculate
     * Значение элементов массива начинается с 1
     * @param bound количество элементов массива
     * @return возвращает значение элементов массива в квадрате
     */
    public int[] calculate(int bound) {
        int count = 1;
        int[] rst = new int[bound];
        for (int i = 0; i != bound; i++) {
            rst[i] = count * count;
            count++;
        }
        return rst;
    }
}
