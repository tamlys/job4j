package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * SimpleQueueTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class SimpleQueueTest {
    private SimpleQueue<Integer> list;

    @Before
    public void beforeTest() {
        list = new SimpleQueue<>();
        list.push(1);
        list.push(2);
        list.push(3);
    }

    @Test
    public void whenPollAllElement() {
        assertThat(list.poll(), is(1));
        assertThat(list.poll(), is(2));
        assertThat(list.poll(), is(3));
        assertThat(list.poll() == null, is(true));
    }

    @Test
    public void whenPollThreeElementsAndPushTwoAndPollTwo() {
        assertThat(list.poll(), is(1));
        assertThat(list.poll(), is(2));
        assertThat(list.poll(), is(3));
        list.push(4);
        list.push(5);
        assertThat(list.poll(), is(4));
        assertThat(list.poll(), is(5));
        assertThat(list.poll() == null, is(true));
    }
}
