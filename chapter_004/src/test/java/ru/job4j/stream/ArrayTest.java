package ru.job4j.stream;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class ArrayTest {
    @Test
    public void streamArray() {
        Array array = new Array();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = array.streamArray(arr);
        int expected = 120;
        assertThat(expected, is(result));
    }
}
