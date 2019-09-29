package ru.job4j.set;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * SimpleSetTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 29.09.19
 */
public class SimpleSetTest {

    @Test
    public void whenAddElementsWithDublicate() {
        SimpleSet<Integer> simpleSet = new SimpleSet<>();
        simpleSet.add(0);
        simpleSet.add(1);
        simpleSet.add(1);
        simpleSet.add(1);
        simpleSet.add(2);
        simpleSet.add(2);
        simpleSet.add(5);
        simpleSet.add(3);
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 5, 3));
        List<Integer> result = new ArrayList<>();
        for (Integer value : simpleSet) {
            result.add(value);
        }
        assertThat(expected, is(result));
    }
}
