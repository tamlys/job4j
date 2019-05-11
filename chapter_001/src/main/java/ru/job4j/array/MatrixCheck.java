package ru.job4j.array;
/**
 * Check
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * mono
     * @param data название массива
     * @return возвращает истину, если по диагоналям значения равны
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i != data.length - 1; i++) {
            for (int o = 1; o != data.length - 1; o++) {
                if (data[data.length - 1][0] != data[i][data.length - 1 - o] || data[i][o] != data[i + 1][o + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
