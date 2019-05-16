package ru.job4j.array;
/**
 * ArrayChar
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
    /**
     * char[] data массив, в котором хранится заданное слово
     */
    private char[] data;
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * startWith
     * @param prefix префикс
     * @return возвращает true или false, в зависимости от того, сходится ли префикс с начальными символами заданного слова
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i != value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

