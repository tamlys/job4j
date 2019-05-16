package ru.job4j.array;

/**
 * Matrix
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {
    /**
     * multiple
     * @param size размер матрицы
     * @return возвращает таблицу умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int o = 0; o <= size - 1; o++) {
            for (int i = 0; i <= size - 1; i++) {
                table[o][i] = (o + 1) * (i + 1);
            }
        }
        return table;
    }
}
