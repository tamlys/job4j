package ru.job4j.list;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ConvertList2ArrayTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 20.07.19
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when5ElementsThen6() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5),
                2
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 0},
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when10ElementsThen12() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                4
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 0},
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when2ArrayThen1List() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> expect = Arrays.asList(1, 2, 9, 3, 4, 5, 6);
        List<int[]> result = Arrays.asList(new int[]{1, 2, 9}, new int[]{3, 4, 5, 6});
        assertThat(list.convert(result), is(expect));
    }

    @Test
    public void when3ArrayThen1List() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<int[]> result = Arrays.asList(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        assertThat(list.convert(result), is(expect));
    }
}