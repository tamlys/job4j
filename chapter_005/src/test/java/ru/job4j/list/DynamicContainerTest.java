package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.util.Iterator;
/**
 * DynamicContainerTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 24.09.19
 */
public class DynamicContainerTest {
    DynamicContainer<Integer> dynamicContainer;

    @Before
    public void beforeTest() {
        dynamicContainer = new DynamicContainer<>(3);
        dynamicContainer.add(0);
        dynamicContainer.add(1);
        dynamicContainer.add(2);
    }

    @Test
    public void whenAddThreeElementsThenUseGetOneResultThree() {
        assertThat(dynamicContainer.get(0), is(0));
        assertThat(dynamicContainer.get(1), is(1));
        assertThat(dynamicContainer.get(2), is(2));
    }

    @Test
    public void hasNextNextSequentialInvocation() {
        Iterator<Integer> iterator = dynamicContainer.iterator();
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(0));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(1));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.hasNext(), is(false));
    }

    @Test (expected = ConcurrentModificationException.class)
    public void isFailFastThrowConcurrentModificationException() {
        Iterator<Integer> iterator = dynamicContainer.iterator();
        dynamicContainer.add(4);
        iterator.hasNext();
    }
}
