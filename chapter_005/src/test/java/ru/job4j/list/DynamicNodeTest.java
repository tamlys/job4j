package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * DynamicNodeTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 26.09.19
 */
public class DynamicNodeTest {
    DynamicNode<String> dynamicNode;

    @Before
    public void beforeTest() {
        dynamicNode = new DynamicNode<>();
        dynamicNode.add("Vladimir");
        dynamicNode.add("Maxim");
        dynamicNode.add("Ivan");
    }

    @Test
    public void whenAddThreeElementsThenUseGetOneResultThree() {
        assertThat(dynamicNode.get(0), is("Vladimir"));
        assertThat(dynamicNode.get(1), is("Maxim"));
        assertThat(dynamicNode.get(2), is("Ivan"));
    }

    @Test
    public void hasNextNextSequentialInvocation() {
        Iterator<String> iterator = dynamicNode.iterator();
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("Vladimir"));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("Maxim"));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("Ivan"));
        assertThat(iterator.hasNext(), is(false));
    }

    @Test (expected = ConcurrentModificationException.class)
    public void isFailFastThrowConcurrentModificationException() {
        Iterator<String> iterator = dynamicNode.iterator();
        dynamicNode.add("Petr");
        iterator.hasNext();
    }
}
