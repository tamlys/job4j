package ru.job4j.stream;
import java.util.Arrays;
/**
 * Array
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Array {
    public int streamArray(int[] array) {
        return Arrays.stream(array).filter(value -> value % 2 == 0).map(value -> value * value).reduce(0, Integer::sum);
    }
}
