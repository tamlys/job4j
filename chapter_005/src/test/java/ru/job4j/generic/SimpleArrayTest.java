package ru.job4j.generic;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * SimpleArrayTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 20.09.19
 */
public class SimpleArrayTest {
    private Iterator<String> iterator;

    @Test
    public void whenAddIntAndGetInt() {
        SimpleArray<Integer> simpleArray = new SimpleArray<>(3);
        simpleArray.add(0);
        simpleArray.add(1);
        simpleArray.add(2);
        assertThat(simpleArray.get(0), is(0));
        assertThat(simpleArray.get(1), is(1));
        assertThat(simpleArray.get(2), is(2));
    }

    @Test
    public void whenAddStringAndGetString() {
        SimpleArray<String> simpleArray = new SimpleArray<>(3);
        simpleArray.add("0");
        simpleArray.add("1");
        simpleArray.add("2");
        assertThat(simpleArray.get(0), is("0"));
        assertThat(simpleArray.get(1), is("1"));
        assertThat(simpleArray.get(2), is("2"));
    }

    @Test
    public void whenRemoveElement() {
        SimpleArray<Integer> simpleArray = new SimpleArray<>(3);
        simpleArray.add(0);
        simpleArray.add(1);
        simpleArray.add(2);
        simpleArray.remove(0);
        assertThat(simpleArray.get(0), is(1));
        assertThat(simpleArray.get(1), is(2));
    }

    @Test
    public void whenSetElement() {
        SimpleArray<String> simpleArray = new SimpleArray<>(3);
        simpleArray.add("0");
        simpleArray.add("1");
        simpleArray.add("2");
        simpleArray.set(0, "123");
        assertThat(simpleArray.get(0), is("123"));
        assertThat(simpleArray.get(1), is("1"));
        assertThat(simpleArray.get(2), is("2"));
    }

    @Test
    public void hasNextNextSequentialInvocation() {
        SimpleArray<String> simpleArray = new SimpleArray<>(3);
        simpleArray.add("0");
        simpleArray.add("1");
        simpleArray.add("2");
        iterator = simpleArray.iterator();
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("0"));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("1"));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is("2"));
        assertThat(iterator.hasNext(), is(false));
    }
}
