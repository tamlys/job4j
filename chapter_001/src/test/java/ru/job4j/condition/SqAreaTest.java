package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/**
 * SqAreaTest
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqAreaTest {
    /**
     * value square.
     */
    @Test
    public void p6k2s2() {
        assertThat(SqArea.square(1, 2), is(2));
    }
    /**
     * value height.
     */
    @Test
    public void w1k2h2() {
        assertThat(SqArea.height(1, 2), is(2));
    }
    /**
     * value weight.
     */
    @Test
    public void h2k2w1() {
        assertThat(SqArea.weight(2, 2), is(1));
    }
    /**
     * value perimetr.
     */
    @Test
    public void w1h2p6() {
        assertThat(SqArea.perimetr(1, 2), is(6));
    }


    /**
     * value square.
     */
    @Test
    public void p4k1s1() {
        assertThat(SqArea.square(1, 1), is(1));
    }
    /**
     * value height.
     */
    @Test
    public void w1k1h1() {
        assertThat(SqArea.height(1, 1), is(1));
    }
    /**
     * value weight.
     */
    @Test
    public void h1k1w1() {
        assertThat(SqArea.weight(1, 1), is(1));
    }
    /**
     * value perimetr.
     */
    @Test
    public void w1h1p4() {
        assertThat(SqArea.perimetr(1, 1), is(4));
    }
}