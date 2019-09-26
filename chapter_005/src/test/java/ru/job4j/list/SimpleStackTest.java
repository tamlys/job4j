package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * SimpleStackTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class SimpleStackTest {
    private SimpleStack<Integer> list;

    @Before
    public void beforeTest() {
        list = new SimpleStack<>();
        list.push(1);
        list.push(2);
        list.push(3);
    }

    @Test
    public void whenAddThreeElementsThenUsePoll() {
        assertThat(list.poll(), is(3));
        assertThat(list.poll(), is(2));
        assertThat(list.poll(), is(1));
        assertThat(list.poll() == null, is(true));
    }
}
